package com.ics.contactsapi.service;

import com.ics.contactsapi.model.Contact;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class ContactService {
    private final Map<Long, Contact> store = new ConcurrentHashMap<>();
    private final AtomicLong seq = new AtomicLong(0);

    public List<Contact> list(String q) {
        Collection<Contact> values = store.values();
        if (q == null || q.isBlank()) {
            return new ArrayList<>(values);
        }
        String needle = q.toLowerCase(Locale.ROOT);
        return values.stream()
                .filter(c -> (c.getName() != null && c.getName().toLowerCase(Locale.ROOT).contains(needle))
                        || (c.getEmail() != null && c.getEmail().toLowerCase(Locale.ROOT).contains(needle)))
                .collect(Collectors.toList());
    }

    public Optional<Contact> get(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    public Contact create(Contact in) {
        long id = seq.incrementAndGet();
        Contact c = new Contact(id, in.getName(), in.getEmail());
        store.put(id, c);
        return c;
    }

    public Optional<Contact> update(Long id, Contact patch) {
        Contact existing = store.get(id);
        if (existing == null) return Optional.empty();
        if (patch.getName() != null) existing.setName(patch.getName());
        if (patch.getEmail() != null) existing.setEmail(patch.getEmail());
        return Optional.of(existing);
    }

    public boolean delete(Long id) {
        return store.remove(id) != null;
    }
}
