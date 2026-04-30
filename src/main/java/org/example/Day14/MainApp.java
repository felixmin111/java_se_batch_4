package org.example.Day14;

public class MainApp {
    public static void main(String[] args) {
        UserView userView = new UserView();
        UserService userService = new UserService();
        new UserController(userView, userService);
        userView.show();
    }
}
