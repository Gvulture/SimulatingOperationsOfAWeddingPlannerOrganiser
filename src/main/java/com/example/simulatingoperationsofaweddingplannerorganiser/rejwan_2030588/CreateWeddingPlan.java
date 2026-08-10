package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import java.time.LocalDate;

public class CreateWeddingPlan{
    private String clientName, theme;
    private LocalDate weddingDate;
    private Integer budget;

    public CreateWeddingPlan(String clientName, Integer budget) {
        this.clientName = clientName;
        this.theme = theme;
        this.weddingDate = weddingDate;
        this.budget = budget;
    }

    public CreateWeddingPlan(String text, String clientNameTextFieldText, LocalDate value, String themeComboBoxValue) {
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(LocalDate weddingDate) {
        this.weddingDate = weddingDate;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "CreateWeddingPlan{" +
                "clientName='" + clientName + '\'' +
                ", theme='" + theme + '\'' +
                ", weddingDate=" + weddingDate +
                ", budget=" + budget +
                '}';
    }
}

