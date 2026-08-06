package com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.NonUser;

import java.time.LocalDate;

public class WeddingEvent {
    private int eventId;
    private String eventName;
    private LocalDate date;
    private String time;
    private String venue;
    private String theme;

    @Override
    public String toString() {
        return "WeddingEvent{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", venue='" + venue + '\'' +
                ", theme='" + theme + '\'' +
                '}';
    }

    public WeddingEvent(int eventId, String eventName, LocalDate date, String time, String venue, String theme) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.theme = theme;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
