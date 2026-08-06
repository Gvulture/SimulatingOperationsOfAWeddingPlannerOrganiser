package com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.User;

import java.util.ArrayList;

public class Photographer {
    private int photographerId;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String specialization;
    private int availability;
    private int experienceYears;
    private boolean Status;
    private ArrayList portfolio;
    private ArrayList schedule;
    private double earnings;

    @Override
    public String toString() {
        return "Photographer{" +
                "photographerId=" + photographerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", specialization='" + specialization + '\'' +
                ", availability=" + availability +
                ", experienceYears=" + experienceYears +
                ", Status=" + Status +
                ", portfolio=" + portfolio +
                ", schedule=" + schedule +
                ", earnings=" + earnings +
                '}';
    }

    public Photographer(int photographerId, String name, String email, String phone, String password, String specialization, int availability, int experienceYears, boolean status, ArrayList portfolio, ArrayList schedule, double earnings) {
        this.photographerId = photographerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.specialization = specialization;
        this.availability = availability;
        this.experienceYears = experienceYears;
        Status = status;
        this.portfolio = portfolio;
        this.schedule = schedule;
        this.earnings = earnings;
    }

    public int getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(int photographerId) {
        this.photographerId = photographerId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public ArrayList getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(ArrayList portfolio) {
        this.portfolio = portfolio;
    }

    public ArrayList getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList schedule) {
        this.schedule = schedule;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
