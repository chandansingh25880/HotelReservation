package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {

   HotelReservation hotelReservation = new HotelReservation();
    @Test
    public void givenHotelWhenAddedShouldReturnTrue() {
        boolean result = hotelReservation.addHotel("Lakewood" ,110);
        Assertions.assertTrue(result);

    }
}
