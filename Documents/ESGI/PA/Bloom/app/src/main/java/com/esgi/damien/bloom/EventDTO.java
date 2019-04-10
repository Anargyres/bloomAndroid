package com.esgi.damien.bloom;

import com.google.gson.annotations.SerializedName;

class EventDTO {

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
}
