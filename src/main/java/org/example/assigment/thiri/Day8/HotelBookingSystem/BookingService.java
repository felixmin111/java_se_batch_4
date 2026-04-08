package org.example.assigment.thiri.Day8.HotelBookingSystem;

public class BookingService {
        HotelData hotelData;

        public BookingService(HotelData hotelData) {
            this.hotelData = hotelData;
            hotelData.displayInfo();
            hotelData.book();
            hotelData.cancel();
            hotelData.search();
            hotelData.countAvailableRoom();
            hotelData.countBookedRoom();
            hotelData.exit();
        }
}

