package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

public class Vendor {
    private final int vendorId;
    private String vendorName, serviceType;
    private double price;

    public Vendor(int vendorId, String vendorName, String serviceType, double price) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.serviceType = serviceType;
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
                ", price=" + price +
                '}';
    }
}
