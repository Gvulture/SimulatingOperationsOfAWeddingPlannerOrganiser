package com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.NonUser;

import java.time.LocalDate;

public class RSVP {
    private int rsvpId;
    private int guestId;
    private String response;
    private LocalDate responseDate;

    @Override
    public String toString() {
        return "RSVP{" +
                "rsvpId=" + rsvpId +
                ", guestId=" + guestId +
                ", response='" + response + '\'' +
                ", responseDate=" + responseDate +
                '}';
    }

    public RSVP(int rsvpId, int guestId, String response, LocalDate responseDate) {
        this.rsvpId = rsvpId;
        this.guestId = guestId;
        this.response = response;
        this.responseDate = responseDate;
    }

    public int getRsvpId() {
        return rsvpId;
    }

    public void setRsvpId(int rsvpId) {
        this.rsvpId = rsvpId;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public LocalDate getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(LocalDate responseDate) {
        this.responseDate = responseDate;
    }
}
