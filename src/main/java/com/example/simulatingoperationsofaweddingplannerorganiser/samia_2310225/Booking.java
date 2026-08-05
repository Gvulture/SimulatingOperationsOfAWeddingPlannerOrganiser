package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import java.io.Serializable;
import java.time.LocalDate;

public class Booking implements Serializable {
    private final int bookingId;
    private int numberOfGuests;
    private String bookingStatus, paymentStatus;
    private double totalPrice;
    private LocalDate weddingDate;

    public Booking(int bookingId, int numberOfGuests, String bookingStatus, String paymentStatus, double totalPrice, LocalDate weddingDate) {
        this.bookingId = bookingId;
        this.numberOfGuests = numberOfGuests;
        this.bookingStatus = bookingStatus;
        this.paymentStatus = paymentStatus;
        this.totalPrice = totalPrice;
        this.weddingDate = weddingDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
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

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
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
                ", bookingStatus='" + bookingStatus + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", totalPrice=" + totalPrice +
                ", weddingDate=" + weddingDate +
                '}';
    }
}
