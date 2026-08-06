package com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.NonUser;

import java.time.LocalDate;

public class Invitation {
    private int invitationId;
    private int guestId;
    private int eventId;
    private LocalDate sendDate;
    private String status;

    public Invitation(int invitationId, int guestId, int eventId, LocalDate sendDate, String status) {
        this.invitationId = invitationId;
        this.guestId = guestId;
        this.eventId = eventId;
        this.sendDate = sendDate;
        this.status = status;
    }

    public int getInvitationId() {
        return invitationId;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "invitationId=" + invitationId +
                ", guestId=" + guestId +
                ", eventId=" + eventId +
                ", sendDate=" + sendDate +
                ", status=" + status +
                '}';
    }

    public void setInvitationId(int invitationId) {
        this.invitationId = invitationId;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public LocalDate getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
