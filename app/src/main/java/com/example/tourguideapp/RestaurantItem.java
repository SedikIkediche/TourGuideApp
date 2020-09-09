package com.example.tourguideapp;

public class RestaurantItem {

    private int mRestaurantImage;
    private String mRestaurantName;
    private String mRestaurantLocation;
    private float mRestaurantRating;

    public RestaurantItem(int mRestaurantImage, String mRestaurantName, String mRestaurantLocation, float mRestaurantRating) {
        this.mRestaurantImage = mRestaurantImage;
        this.mRestaurantName = mRestaurantName;
        this.mRestaurantLocation = mRestaurantLocation;
        this.mRestaurantRating = mRestaurantRating;
    }

    public int getmRestaurantImage() {
        return mRestaurantImage;
    }

    public String getmRestaurantName() {
        return mRestaurantName;
    }

    public String getmRestaurantLocation() {
        return mRestaurantLocation;
    }

    public float getmRestaurantRating() {
        return mRestaurantRating;
    }
}
