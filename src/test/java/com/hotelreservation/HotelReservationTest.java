package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.transform.Result;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class HotelReservationTest {

    HotelReservation hotelReservation = new HotelReservation();
    private Object lakewood;
    private int rating;

    @Test
    public void givenHotelWhenAddedShouldReturnTrue() {
        boolean result = hotelReservation.addHotel("Lakewood", 110);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenDateRangeWhenSearchedShouldReturnCheapestHotelBasedOnWeekdayAndWeekend() {
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

    @Test
    public void givenWeekDayAndWeekendRatesForHotelsWhenAddedShouldReturnTrue() {
        boolean result = HotelReservation.addHotelRates("Lakewood", 110.00, 90.00) &&
                HotelReservation.addHotelRates("Bridgewood", 150.00, 50.00) &&
                HotelReservation.addHotelRates("Ridgewood", 220.00, 150.00);
        Assertions.assertTrue(result);
    }
 @Test
 public void givenHotelWhenInvokedAddRatingShouldBeAbleToAdd() {
     Assertions.assertEquals(3, lakewood(3));
     
  }

    private int lakewood(int i) {
        return this.rating;
    }
}