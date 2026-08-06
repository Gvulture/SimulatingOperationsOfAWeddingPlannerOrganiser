package com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.NonUser;

import java.time.LocalDate;

public class Photo {
    private int photoId;
    private String title;
    private String filePath;
    private LocalDate uploadDate;
    private String albumName;
    private String photoType;

    @Override
    public String toString() {
        return "Photo{" +
                "photoId=" + photoId +
                ", title='" + title + '\'' +
                ", filePath='" + filePath + '\'' +
                ", uploadDate=" + uploadDate +
                ", albumName='" + albumName + '\'' +
                ", photoType='" + photoType + '\'' +
                '}';
    }

    public Photo(int photoId, String title, String filePath, LocalDate uploadDate, String albumName, String photoType) {
        this.photoId = photoId;
        this.title = title;
        this.filePath = filePath;
        this.uploadDate = uploadDate;
        this.albumName = albumName;
        this.photoType = photoType;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getPhotoType() {
        return photoType;
    }

    public void setPhotoType(String photoType) {
        this.photoType = photoType;
    }
}
