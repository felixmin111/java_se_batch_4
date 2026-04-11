package org.example.assigment.thiri.HotelBookingSystem;

public class BookingService {
        HotelData hotelData;

        public BookingService(HotelData hotelData) {
            this.hotelData = hotelData;
            hotelData.execute();
        }
}