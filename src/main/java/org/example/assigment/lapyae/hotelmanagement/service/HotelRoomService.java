package org.example.assigment.lapyae.hotelmanagement.service;

import org.example.assigment.lapyae.hotelmanagement.model.HotelRooms;
import org.example.assigment.lapyae.hotelmanagement.exception.*;
import java.util.List;

public interface HotelRoomService {
    List<HotelRooms> getAllRooms();
    void bookRoom(int roomNum, String name) throws BookedRoomException, NotFoundRoomsException;
    void cancelBooking(int roomNum) throws AvailableRoomsException, NotFoundRoomsException;
    HotelRooms searchRoom(int roomNum) throws NotFoundRoomsException;
    long countAvailable();
    long countBooked();
}
