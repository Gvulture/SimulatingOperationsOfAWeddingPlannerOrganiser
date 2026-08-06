package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import java.io.Serializable;
import java.time.LocalDate;

public class VenueSchedule implements Serializable {
    private String clientName;
    private LocalDate date;
    private String timeSlot;
    private String status;

    public VenueSchedule(String clientName, LocalDate date, String timeSlot, String status) {
        this.clientName = clientName;
        this.date = date;
        this.timeSlot = timeSlot;
        this.status = status;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VenueSchedule{" +
                "clientName='" + clientName + '\'' +
                ", date=" + date +
                ", timeSlot='" + timeSlot + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
