package com.example.tourguideapp;

public class PlaceItem {

    private int mPlaceImage;
    private String mPlaceName;
    private String mPlaceDescription;

    public PlaceItem(int mPlaceImage, String mPlaceName, String mPlaceDescription) {
        this.mPlaceImage = mPlaceImage;
        this.mPlaceName = mPlaceName;
        this.mPlaceDescription = mPlaceDescription;
    }

    public int getmPlaceImage() {
        return mPlaceImage;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmPlaceDescription() {
        return mPlaceDescription;
    }
}
