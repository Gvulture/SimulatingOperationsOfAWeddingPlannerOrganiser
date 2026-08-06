package com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.NonUser;

import java.time.LocalDate;

public class Notification {
    private int notificationId;
    private String message;
    private LocalDate sendDate;
    private String status;

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId=" + notificationId +
                ", message='" + message + '\'' +
                ", sendDate=" + sendDate +
                ", status='" + status + '\'' +
                '}';
    }

    public Notification(int notificationId, String message, LocalDate sendDate, String status) {
        this.notificationId = notificationId;
        this.message = message;
        this.sendDate = sendDate;
        this.status = status;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
