package com.example.bloomandroid.event.domain.data;

import com.google.gson.annotations.SerializedName;

public class EventDTO {

    @SerializedName("title")
    String title;
    @SerializedName("description")
    String descripttion;
    @SerializedName("longitude")
    String longitude;
    @SerializedName("lattitude")
    String lattitude;
    @SerializedName("image")
    String image;
    @SerializedName("promotionalCode")
    String promotionalCode;

    public EventDTO(String title, String descripttion, String longitude, String lattitude, String image, String promotionalCode) {
        this.title = title;
        this.descripttion = descripttion;
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.image = image;
        this.promotionalCode = promotionalCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripttion() {
        return descripttion;
    }

    public void setDescripttion(String descripttion) {
        this.descripttion = descripttion;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPromotionalCode() {
        return promotionalCode;
    }

    public void setPromotionalCode(String promotionalCode) {
        this.promotionalCode = promotionalCode;
    }
}
