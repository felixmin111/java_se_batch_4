package org.example.assigment.thiri.Bank;

import java.util.Scanner;

public class AccountView {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bank number: ");
        String bankNo = scanner.nextLine();
        System.out.println("Enter your pin: ");
        String pin = scanner.nextLine();

        Account loggedIn = accountService.login(bankNo, pin);

        if (loggedIn != null) {
            System.out.println("Auth Successful !!!");
        } else {
            System.out.println("Failed.");
        }
    }



}

