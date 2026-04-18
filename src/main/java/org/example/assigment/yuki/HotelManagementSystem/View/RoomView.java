package org.example.assigment.yuki.HotelManagementSystem.View;
import org.example.assigment.yuki.HotelManagementSystem.Model.Room;
import java.util.Scanner;
public class RoomView {
    Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("1. Display All Rooms");
        System.out.println("2. Display Room");
        System.out.println("3. Book Room");
        System.out.println("4. Cancel Booking");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public int getRoomNumber() {
        System.out.print("Enter Room Number: ");
        return sc.nextInt();
    }

    public String getGuestName() {
        System.out.print("Enter Guest Name: ");
        return sc.nextLine();
    }

    public void displayAllRooms(Room[] rooms) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isBooked()) {
                System.out.println("Room " + rooms[i].getRoomNumber()
                        + " | " + rooms[i].getRoomType()
                        + " | Price: " + rooms[i].getPrice()
                        + " | Booked by " + rooms[i].getGuestName());
            }else{
                System.out.println("Room " + rooms[i].getRoomNumber()
                        + " | " + rooms[i].getRoomType()
                        + " | Price: " + rooms[i].getPrice()
                        + " | Available");
            }
        }
    }

    public void displayRoom(Room room) {
        if (room == null){
            System.out.println("Room not found");
        }else{
            System.out.println("Room Number: " + room.getRoomNumber());
            System.out.println("Room Type: " + room.getRoomType());
            System.out.println("Price: " + room.getPrice());
            System.out.println("Guest Name: " + room.getGuestName());
        }


    }

    public void displayAvailableRoomsCount(int availableRooms) {
        System.out.println("Available Rooms: " + availableRooms);
    }

    public void displayBookedRoomsCount(int bookedRooms) {
        System.out.println("Booked Rooms: " + bookedRooms);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }



}
