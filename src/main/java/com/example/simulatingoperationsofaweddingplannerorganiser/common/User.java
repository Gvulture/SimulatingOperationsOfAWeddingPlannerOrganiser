package com.example.simulatingoperationsofaweddingplannerorganiser.common;

public abstract class User {

    private final int id;
    private String name;
    private String role;
    private int contact;
    private String email;
    private String password;

    public User(int id, String name, String role, int contact, String email, String password) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.contact = contact;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean login(int id, String password) {
        return this.id == id && this.password.equals(password);
    }

    public void viewProfile() {
        System.out.println("Name: " + name + ", Role: " + role + ", Email: " + email);
    }

    public void updateProfile(String details) {

    }

    public void submitRequest(String request) {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", contact=" + contact +
                ", email='" + email + '\'' +
                '}';
    }
}


