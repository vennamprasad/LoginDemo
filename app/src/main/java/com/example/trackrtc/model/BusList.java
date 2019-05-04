package com.example.trackrtc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BusList {
    @SerializedName("BusName")
    @Expose
    private String BusName;

    @SerializedName("BusId")
    @Expose
    private String BusId;

    @SerializedName("BusContact")
    @Expose
    private String BusContact;

    @SerializedName("Lat")
    @Expose
    private String Lat;

    @SerializedName("Lan")
    @Expose
    private String Lan;

    @SerializedName("Message")
    @Expose
    private String Message;

    public String getBusName() {
        return BusName;
    }

    public void setBusName(String busName) {
        BusName = busName;
    }

    public String getBusId() {
        return BusId;
    }

    public void setBusId(String busId) {
        BusId = busId;
    }

    public String getBusContact() {
        return BusContact;
    }

    public void setBusContact(String busContact) {
        BusContact = busContact;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLan() {
        return Lan;
    }

    public void setLan(String lan) {
        Lan = lan;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
