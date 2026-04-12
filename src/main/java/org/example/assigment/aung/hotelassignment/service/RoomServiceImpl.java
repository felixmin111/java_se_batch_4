package org.example.assigment.aung.hotelassignment.service;
import org.example.assigment.aung.hotelassignment.exception.RoomAlreadyBookedException;
import org.example.assigment.aung.hotelassignment.exception.RoomNotBookedException;
import org.example.assigment.aung.hotelassignment.exception.RoomNotFoundException;
import org.example.assigment.aung.hotelassignment.model.Room;

public class RoomServiceImpl implements RoomService {
    private Room[] hotelrooms = new Room[10];

    public RoomServiceImpl() {
        hotelrooms[0] = new Room(1, "Standard", 50.0, false, "-");
        hotelrooms[1] = new Room(2, "Deluxe", 100.0, true, "Aung");
        hotelrooms[2] = new Room(3, "Standard", 50.0, false, "-");
        hotelrooms[3] = new Room(4, "Standard", 50.0, true, "Myin");
        hotelrooms[4] = new Room(5, "Deluxe", 100.0, false, "-");
        hotelrooms[5] = new Room(6, "Deluxe", 100.0, true, "Tun");
        hotelrooms[6] = new Room(7, "Deluxe", 100.0, false, "-");
        hotelrooms[7] = new Room(8, "Standard", 50.0, true, "Soe");
        hotelrooms[8] = new Room(9, "Deluxe", 100.0, false, "-");
        hotelrooms[9] = new Room(10, "Standard", 50.0, false, "-");
    }

    @Override
    public void displayAllRooms() {
        for (Room room : hotelrooms) {
            System.out.println(room);
        }
    }

    @Override
    public void bookRoom(int roomNumber, String guestName) throws RoomNotFoundException,  RoomAlreadyBookedException {
        for (Room room : hotelrooms) {
            if (room.getNumber() == roomNumber) {
                if (room.isBooked()) {
                    throw new RoomAlreadyBookedException("Room "+roomNumber+" is already booked");
                }
                room.setBooked(true);
                room.setGuestName(guestName);
                System.out.println("Room " + roomNumber + " booked successfully for "+guestName);
                return;
            }
        }
       throw new RoomNotFoundException("Error: Room was not found");
    }

    @Override
    public void cancelBooking(int roomNumber) throws RoomNotFoundException,  RoomNotBookedException {
        for (Room room : hotelrooms) {
            if (room.getNumber() == roomNumber) {
                if (!room.isBooked()) {
                    throw new RoomNotBookedException("Room "+roomNumber+" is not currently booked");
                }
                room.setBooked(false);
                room.setGuestName("-");
                System.out.println("Booking for Room "+roomNumber+" has been cancelled");
                return;
            }
        }
        throw new RoomNotFoundException("Error: Room was not found");
    }

    @Override
    public void searchRoom(int roomNumber) throws RoomNotFoundException {
        for (Room room : hotelrooms) {
            if (room.getNumber() == roomNumber) {
                System.out.println("Room number: " + roomNumber+
                        "\nRoom Type: "+ room.getType()+
                        "\nPrice: "+ room.getPrice()
                        );
                if (room.isBooked()) {
                    System.out.println("Status: Booked\nGuest Name: "+room.getGuestName());
                }
                else {
                    System.out.println("Status: Available");
                }
                return;
            }
        }
        throw new RoomNotFoundException("Error: Room was not found");

    }

    @Override
    public int getAvailableRoomCount() {
        int count = 0;
        for (Room room : hotelrooms) {
            if (!room.isBooked()) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int getBookedRoomCount() {
        int count = 0;
        for (Room room : hotelrooms) {
            if (room.isBooked()) {
                count++;
            }
        }
        return count;
    }
}
