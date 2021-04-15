package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservationTest {

    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void givenHotelWhenAddedShouldReturnTrue() {
        boolean result = hotelReservation.addHotel("Lakewood", 110);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenDateRange_whenSearched_shouldReturnCheapestHotelBasedOnWeekdayAndWeekend() {
       // public void givenBookingDate_ShouldReturn_CheapestHotel ()
        {
            SimpleDateFormat df = new SimpleDateFormat("ddMMMMYYYY");
            String inputDateString[] = {"10sep2020", "11sep2020"};

            Date[] inputDate = null;
            try {
                inputDate = new Date[]{df.parse(inputDateString[0]), df.parse(inputDateString[1])};
            } catch (ParseException e) {
                System.out.println("Invalid Date Formate");
                if (!df.format(inputDateString).equals(inputDate)) {
                    System.out.println("Invalid Date!!");
                } else
                    System.out.println("Valid Date");
            }
            boolean result = hotelReservation.addHotel("Lakewood", 220.00) &&
                    hotelReservation.addHotel("Ridgewood", 1200.00);
            if (result)
                Assertions.assertEquals("Lakewood", hotelReservation.findCheapestHotel(inputDate));
        }
    }
}