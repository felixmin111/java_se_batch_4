package org.example.assigment.aung.ATM;

public class MainProgram {
    public static void main(String[] args) {
        AccountController accountController = new AccountController();
        view atmView = new view(accountController);

        atmView.mainmenu();
    }
}
