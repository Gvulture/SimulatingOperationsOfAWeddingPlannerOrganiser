package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

public class AssignVendor {
    private String weddingPlan, vendor, ServiceType;

    public AssignVendor(String weddingPlan, String vendor, String serviceType) {
        this.weddingPlan = weddingPlan;
        this.vendor = vendor;
        ServiceType = serviceType;
    }

    public AssignVendor() {
    }

    public String getWeddingPlan() {
        return weddingPlan;
    }

    public void setWeddingPlan(String weddingPlan) {
        this.weddingPlan = weddingPlan;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    @Override
    public String toString() {
        return "AssignVendor{" +
                "weddingPlan='" + weddingPlan + '\'' +
                ", vendor='" + vendor + '\'' +
                ", ServiceType='" + ServiceType + '\'' +
                '}';
    }
}
