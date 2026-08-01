package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

public class Vendor {
    private  int vendorId;
    private String vendorName, serviceType, contact, bookingStatus;
    private double price;

    public Vendor(int vendorId, String vendorName, String serviceType, String contact, String bookingStatus, double price) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.serviceType = serviceType;
        this.contact = contact;
        this.bookingStatus = bookingStatus;
        this.price = price;
    }

    public int getVendorId() {
        return vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorId=" + vendorId +
                ", vendorName='" + vendorName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", contact='" + contact + '\'' +
                ", bookingStatus='" + bookingStatus + '\'' +
                ", price=" + price +
                '}';
    }
}
