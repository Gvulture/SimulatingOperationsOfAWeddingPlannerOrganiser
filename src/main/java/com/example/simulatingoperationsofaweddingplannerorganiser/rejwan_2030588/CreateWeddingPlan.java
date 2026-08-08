package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

public class CreateWeddingPlan {
    @Override
    public String toString() {
        return "CreateWeddingPlan{" +
                "ClientName='" + ClientName + '\'' +
                ", theme='" + theme + '\'' +
                ", Budget=" + Budget +
                '}';
    }

    String ClientName,theme;
    int Budget;

    public CreateWeddingPlan(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }


    public void setTheme(String theme) {
        this.theme = theme;
    }

    public CreateWeddingPlan(String clientName, int budget) {
        ClientName = clientName;
        Budget = budget;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int budget) {
        Budget = budget;
    }

}
