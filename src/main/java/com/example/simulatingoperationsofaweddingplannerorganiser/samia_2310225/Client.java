package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.User;
import java.time.LocalDate;

public class Client extends User {
    private LocalDate weddingDate;
    private String bookingStatus;

    public Client(int id, String name, String role, int contact, String email, String password, LocalDate weddingDate, String bookingStatus) {
        super(id, name, role, contact, email, password);
        this.weddingDate = weddingDate;
        this.bookingStatus = bookingStatus;
    }

    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(LocalDate weddingDate) {
        this.weddingDate = weddingDate;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void searchVenue() {

    }

    public void bookVenue() {

    }

}
