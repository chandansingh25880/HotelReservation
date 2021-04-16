package com.hotelreservation.com.hotelreservation ;

public class Hotel {
    private String hotelName;
    private double weekday;
    private double Weekend;
    public String name;
    public Double rates;
    public int rating;

    public Hotel() {
        this.name = name;
        this.rates = rates;
    }

    public Hotel(String hotelName, double weekday, double weekend) {
        this.hotelName = hotelName;
        this.weekday = weekday;
        this.Weekend = weekend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rates;
    }

    public void setRate(double rates) {
        this.rates = rates;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}