package com.ics.contactsapi.model;

public class Contact {
// Hacer uso de Lombok, agregar atributos para el CRUD general y datos necesarios
  private Long id;
    private String name;
    private String email;

    public Contact() {
    }

    public Contact(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
