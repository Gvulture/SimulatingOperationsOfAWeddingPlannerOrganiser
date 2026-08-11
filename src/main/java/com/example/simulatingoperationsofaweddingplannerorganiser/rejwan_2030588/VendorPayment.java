package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import javafx.scene.control.Alert;

public class VendorPayment {
    private String vendor, amount, paymentMethod;

    public VendorPayment(String vendor, String amount, String paymentMethod) {
        this.vendor = vendor;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public VendorPayment() {
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "VendorPayment{" +
                "vendor='" + vendor + '\'' +
                ", amount='" + amount + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public void showVendorPayment(){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(toString());
        a.showAndWait();
    }
}
