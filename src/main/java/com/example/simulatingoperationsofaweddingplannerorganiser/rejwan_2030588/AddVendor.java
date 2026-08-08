package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

public class AddVendor {
    String VendorName, ServiceType;
    int Phone, Price;

    public AddVendor(String vendorName, String serviceType, int phone, int price) {
        VendorName = vendorName;
        ServiceType = serviceType;
        Phone = phone;
        Price = price;
    }

    public AddVendor(String vendorName, int phone, int price) {
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "AddVendor{" +
                "VendorName='" + VendorName + '\'' +
                ", ServiceType='" + ServiceType + '\'' +
                ", Phone=" + Phone +
                ", Price=" + Price +
                '}';
    }
}