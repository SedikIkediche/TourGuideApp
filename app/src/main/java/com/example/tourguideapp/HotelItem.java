package com.example.tourguideapp;

public class HotelItem {

    private int hotelImage;
    private String hotelName;
    private String hotelLocation;
    private int hotelRating;

    public HotelItem(int hotelImage, String hotelName, String hotelLocation, int hotelRating) {
        this.hotelImage = hotelImage;
        this.hotelName = hotelName;
        this.hotelLocation = hotelLocation;
        this.hotelRating = hotelRating;
    }

    public int getHotelImage() {
        return hotelImage;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public int getHotelRating() {
        return hotelRating;
    }
}