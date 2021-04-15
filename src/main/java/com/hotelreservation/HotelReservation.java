package com.hotelreservation;
import com.hotelreservation.com.hotelreservation.Hotel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class HotelReservation {
    List<Hotel> hotelList = new ArrayList<>();

    public boolean addHotel() {
        Hotel hotel = new Hotel();
        boolean isAdded = hotelList.add(hotel);
        return isAdded;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the hotel Reservatiomn System");
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
    }

    public boolean addHotel(String lakewood, double rates) {
        Hotel hotel = new Hotel();
        boolean isAdded = hotelList.add(hotel);
        return isAdded;

    }

    /* @Description- To find the cheapest rates for the hotel. */

    public String findCheapestHotel(Date[] dates) {
        ArrayList<Double> cheapRateHotels = new ArrayList<>();
        for (Hotel hotel : hotelList) {
            Double rate = 0.0;
            for (Date date : dates) {
                rate = hotel.getRate();
            }
            cheapRateHotels.add(rate);
        }
        Double cheap = cheapRateHotels.stream().min(Comparator.comparing(Double::doubleValue)).orElse(null);
        int index = cheapRateHotels.indexOf(cheap);
        return hotelList.get(index).getName();

    }

}

