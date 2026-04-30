package org.example.assigment.yuki.HotelManagementSystem;
import org.example.assigment.yuki.HotelManagementSystem.Controller.MainControl;
import org.example.assigment.yuki.HotelManagementSystem.Service.RoomServiceImpl;
import org.example.assigment.yuki.HotelManagementSystem.View.RoomView;
public class MainApp {
    public static void main(String[] args) {
        RoomView view = new RoomView();
        RoomServiceImpl service = new RoomServiceImpl();
        MainControl controller = new MainControl(view, service);

        controller.start();
    }
}
