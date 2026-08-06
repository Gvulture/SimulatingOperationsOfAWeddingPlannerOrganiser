package com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.NonUser;

import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private int clintId;
    private int photographerId;
    private LocalDate bookingDate;
    private String Status;
    private int eventId;

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", clintId=" + clintId +
                ", photographerId=" + photographerId +
                ", bookingDate=" + bookingDate +
                ", Status='" + Status + '\'' +
                ", eventId=" + eventId +
                '}';
    }

    public int getBookingId() {
        return bookingId;
    }

    public Booking(int bookingId, int clintId, int photographerId, LocalDate bookingDate, String status, int eventId) {
        this.bookingId = bookingId;
        this.clintId = clintId;
        this.photographerId = photographerId;
        this.bookingDate = bookingDate;
        Status = status;
        this.eventId = eventId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getClintId() {
        return clintId;
    }

    public void setClintId(int clintId) {
        this.clintId = clintId;
    }

    public int getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(int photographerId) {
        this.photographerId = photographerId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}