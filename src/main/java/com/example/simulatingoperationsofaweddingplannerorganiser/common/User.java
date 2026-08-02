package com.example.simulatingoperationsofaweddingplannerorganiser.common;

import java.io.Serializable;

public abstract class User implements Serializable {
    protected int id;
    protected String name;
    protected String role;
    protected int contact;
    protected String email;
    protected String password;


    public User() {
    }


    public User(int id, String name, String role, int contact, String email, String password) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.contact = contact;
        this.email = email;
        this.password = password;
    }


    public boolean login(int id, String password) {
        // Login logic
        return this.id == id && this.password.equals(password);
    }

    public void viewProfile() {

    }

    public void updateProfile(String details) {

    }

    public void submitRequest(String request) {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
