package org.example.assigment.thiri.Day9_12.OldHotelBookingSystem;

public class BookingService {
        HotelData hotelData;

        public BookingService(HotelData hotelData) {
            this.hotelData = hotelData;
            hotelData.execute();
        }
}