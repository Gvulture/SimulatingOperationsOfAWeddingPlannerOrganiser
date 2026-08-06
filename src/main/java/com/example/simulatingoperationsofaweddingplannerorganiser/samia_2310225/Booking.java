package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import java.io.Serializable;
import java.time.LocalDate;

public class Booking implements Serializable {
    private final int bookingId;
    private int numberOfGuests;
    private String clientName,status;
    private double totalPrice;
    private LocalDate weddingDate;

    public Booking(int bookingId, int numberOfGuests, String status, String clientName, double totalPrice, LocalDate weddingDate) {
        this.bookingId = bookingId;
        this.numberOfGuests = numberOfGuests;
        this.status = status;
        this.clientName = clientName;
        this.totalPrice = totalPrice;
        this.weddingDate = weddingDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public String status() {
        return status;
    }

    public String getClientName() {
        return clientName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void setStatus(String bookingStatus) {
        this.status = bookingStatus;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setWeddingDate(LocalDate weddingDate) {
        this.weddingDate = weddingDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", numberOfGuests=" + numberOfGuests +
                ", status='" + status + '\'' +
                ", clientName='" + clientName+ '\'' +
                ", totalPrice=" + totalPrice +
                ", weddingDate=" + weddingDate +
                '}';
    }
}
