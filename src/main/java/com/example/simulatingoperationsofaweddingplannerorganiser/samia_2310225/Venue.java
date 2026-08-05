package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import java.io.Serializable;

public class Venue implements Serializable {
    private final int venueId;
    private int capacity;
    private String venueName, location, Status;
    private double pricePerDay;

    public Venue(int venueId, int capacity, String venueName, String location, String status, double pricePerDay) {
        this.venueId = venueId;
        this.capacity = capacity;
        this.venueName = venueName;
        this.location = location;
        Status = status;
        this.pricePerDay = pricePerDay;
    }

    public int getVenueId() {
        return venueId;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getVenueName() {
        return venueName;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return Status;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueId=" + venueId +
                ", capacity=" + capacity +
                ", venueName='" + venueName + '\'' +
                ", location='" + location + '\'' +
                ", Status='" + Status + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
