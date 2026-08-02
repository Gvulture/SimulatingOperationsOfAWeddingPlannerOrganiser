package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

public class Invitation {
    private int invitationId, tableNumber;
    private String guestName, email, phone;

    public Invitation(int invitationId, int tableNumber, String guestName, String email, String phone) {
        this.invitationId = invitationId;
        this.tableNumber = tableNumber;
        this.guestName = guestName;
        this.email = email;
        this.phone = phone;
    }

    public int getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(int invitationId) {
        this.invitationId = invitationId;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
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

    @Override
    public String toString() {
        return "Invitation{" +
                "invitationId=" + invitationId +
                ", tableNumber=" + tableNumber +
                ", guestName='" + guestName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
