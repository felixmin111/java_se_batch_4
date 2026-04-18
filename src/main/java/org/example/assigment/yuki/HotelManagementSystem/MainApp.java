package org.example.assigment.yuki.HotelManagementSystem;
import org.example.assigment.yuki.HotelManagementSystem.Controller.MainControl;
import org.example.assigment.yuki.HotelManagementSystem.Service.RoomService;
import org.example.assigment.yuki.HotelManagementSystem.View.RoomView;
public class MainApp {
    public static void main(String[] args) {
        RoomView view = new RoomView();
        RoomService service = new RoomService();
        MainControl controller = new MainControl(view, service);

        controller.start();
    }
}
