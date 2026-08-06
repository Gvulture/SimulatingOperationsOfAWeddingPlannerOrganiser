package com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.User;

public class Guest {
    private int guestId;
    private String name;
    private String email;
    private String phone;
    private String attendanceStatus;
    private int tableNumber;
    private boolean notificationStatus;

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                ", tableNumber=" + tableNumber +
                ", notificationStatus=" + notificationStatus +
                '}';
    }

    public Guest(int guestId, String name, String email, String phone, String attendanceStatus, int tableNumber, boolean notificationStatus) {
        this.guestId = guestId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.attendanceStatus = attendanceStatus;
        this.tableNumber = tableNumber;
        this.notificationStatus = notificationStatus;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
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

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(boolean notificationStatus) {
        this.notificationStatus = notificationStatus;
    }
}
