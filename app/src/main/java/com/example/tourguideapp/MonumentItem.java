package com.example.tourguideapp;

public class MonumentItem {

    private int monumentImage;
    private String monumentName;

    public MonumentItem(int monumentImage, String monumentName) {
        this.monumentImage = monumentImage;
        this.monumentName = monumentName;
    }

    public int getMonumentImage() {
        return monumentImage;
    }

    public String getMonumentName() {
        return monumentName;
    }
}
