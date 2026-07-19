package org.example.assigment.thiri.Bank;

import java.util.Scanner;

public class AccountView {

    public static void main(String[] args) {
        AccountController accountController = new AccountController();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your bank number: ");
            String bankNo = scanner.nextLine();
            System.out.println("Enter your pin: ");
            String pin = scanner.nextLine();

            Account loggedIn = accountController.login(bankNo, pin);

            if (loggedIn == null) {
                System.out.println("Authentication Failed. Invalid bank number or PIN.");
                continue;
            } else if (loggedIn != null) {
                System.out.println("Auth Successful !!!");

                while (true) {
                    System.out.println("1. Withdraw Money");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
                    System.out.println("Enter your choice: ");
                    String input = scanner.nextLine();

                    if (input.equals("1")) {
                        System.out.print("Enter amount that you want to widthdraw: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();

                        if (loggedIn.withdraw(amount)) {
                            System.out.println("WidthDrawProcess Success");
                        } else {
                            System.out.println("Insufficient funds.");
                        }

                    } else if (input.equals("2")) {
                        System.out.print("Enter amount that you want to Deposite: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();

                        loggedIn.deposit(amount);
                        System.out.println("Deposit Process Success");

                    } else if (input.equals("3")) {
                        System.out.println("Your Account have : RM " + loggedIn.getBalance());

                    } else if (input.equals("4")) {
                        break;

                    } else {
                        System.out.println("Invalid option.");
                    }
                }
            }
            scanner.close();
            break;
        }
    }
}