package org.example.assigment.yuki.Day20.controller;

import org.example.assigment.yuki.Day20.model.User;
import org.example.assigment.yuki.Day20.service.UserService;
import org.example.assigment.yuki.Day20.view.UserView;

public class UserController {
    private UserView view;
    private UserService userService;
    public UserController(UserView view, UserService userService) {
        this.userService = userService;
        this.view = view;
        this.view.saveButton.addActionListener(e -> saveUser());
    }

    private void saveUser(){
        System.out.println("Save User is processing ");
        String age=view.ageField.getText();
        String name=view.nameField.getText();
        String phone=view.phoneField.getText();
        String address=view.addressField.getText();

        User user=new User(name,Integer.parseInt(age),phone,address);
        userService.save(user);
    }
}
