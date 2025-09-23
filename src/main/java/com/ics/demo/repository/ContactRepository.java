package com.ics.demo.repository;

import com.ics.demo.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByIsDeletedFalse();

    List<Contact> findByNameContainingIgnoreCaseAndIsDeletedFalse(String name);
}