package com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.NonUser;

import java.util.ArrayList;

public class Gallery {
    private int galleryId;
    private int eventId;
    private ArrayList<Photo> photos;

    @Override
    public String toString() {
        return "Gallery{" +
                "galleryId=" + galleryId +
                ", eventId=" + eventId +
                ", photos=" + photos +
                '}';
    }

    public Gallery(int galleryId, int eventId, ArrayList<Photo> photos) {
        this.galleryId = galleryId;
        this.eventId = eventId;
        this.photos = photos;
    }

    public int getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(int galleryId) {
        this.galleryId = galleryId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }
}
