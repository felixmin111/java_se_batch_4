package org.example.assigment.thiri.OldHotelBookingSystem;

public class BookingService {
        HotelData hotelData;

        public BookingService(HotelData hotelData) {
            this.hotelData = hotelData;
            hotelData.execute();
        }
}