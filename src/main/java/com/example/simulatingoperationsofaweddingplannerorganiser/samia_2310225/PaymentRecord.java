package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import java.io.Serializable;

public class PaymentRecord implements Serializable {
    private String bookingId;
    private String clientName;
    private double totalAmount;
    private double amountPaid;
    private double amountDue;
    private String paymentStatus;

    public PaymentRecord(String bookingId, String clientName, double totalAmount, double amountPaid, double amountDue, String paymentStatus) {
        this.bookingId = bookingId;
        this.clientName = clientName;
        this.totalAmount = totalAmount;
        this.amountPaid = amountPaid;
        this.amountDue = amountDue;
        this.paymentStatus = paymentStatus;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "PaymentRecord{" +
                "bookingId='" + bookingId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", totalAmount=" + totalAmount +
                ", amountPaid=" + amountPaid +
                ", amountDue=" + amountDue +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
