package com.hotelreservation;
import com.hotelreservation.com.hotelreservation.Hotel;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
   List<Hotel> hotellList = new ArrayList<>();

   public boolean addHotel(){
       Hotel hotel = new Hotel();
       boolean isAdded = hotellList.add(hotel);
       return isAdded;
   }

    public static void main(String[] args) {
        System.out.println("Welcome to the hotel Reservatiomn System");
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
    }

    public boolean addHotel(String lakewood,double rates) {
        Hotel hotel = new Hotel();
        boolean isAdded = hotellList.add(hotel);
        return isAdded;

    }
}



