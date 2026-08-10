package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import java.time.LocalDate;

public class GenerateSchedule {
    private String activity, time;
    private LocalDate selectDate;

    public GenerateSchedule(String activity, LocalDate selectDate, String time) {
        this.activity = activity;
        this.time = time;
        this.selectDate = selectDate;
    }

    public GenerateSchedule() {
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LocalDate getSelectDate() {
        return selectDate;
    }

    public void setSelectDate(LocalDate selectDate) {
        this.selectDate = selectDate;
    }

    @Override
    public String toString() {
        return "GenerateSchedule{" +
                "activity='" + activity + '\'' +
                ", time='" + time + '\'' +
                ", selectDate=" + selectDate +
                '}';
    }
}
