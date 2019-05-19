package com.example.bloomandroid.models;

public class Event {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPromotionalCode() {
        return promotionalCode;
    }

    public void setPromotionalCode(String promotionalCode) {
        this.promotionalCode = promotionalCode;
    }

    public String getImageURl() {
        return imageURl;
    }

    public void setImageURl(String imageURl) {
        this.imageURl = imageURl;
    }

    private String title;
    private String description;
    private String latitude;
    private String longitude;
    private String promotionalCode;
    private String imageURl;


}
