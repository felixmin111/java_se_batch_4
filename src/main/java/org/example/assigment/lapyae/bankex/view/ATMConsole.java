package org.example.assigment.lapyae.bankex.view;

import org.example.assigment.lapyae.bankex.controller.BankController;
import java.util.Scanner;

public class ATMConsole {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        BankController controller = new BankController();

        System.out.print("Enter Your Bank No : ");
        String bankNo = scanner.nextLine();

        System.out.print("Enter Pin : ");
        String pin = scanner.nextLine();

        if (controller.authenticate(bankNo, pin)) {
            System.out.println("\nAuth Successful !!!");
            boolean running = true;

            while (running) {
                System.out.println("1. Withdraw Money");
                System.out.println("2. Deposit Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount that you want to withdraw: ");
                        double wAmount = scanner.nextDouble();
                        if (controller.withdraw(wAmount)) {
                            System.out.println("WithdrawProcess Success");
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter amount that you want to Deposit: ");
                        double dAmount = scanner.nextDouble();
                        controller.deposit(dAmount);
                        System.out.println("Deposit Process Success");
                        break;
                    case 3:
                        long displayBalance = (long) controller.getBalance();
                        System.out.println("Your Account have : " + displayBalance + "thb\n");
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                System.out.println();
            }
        } else {
            System.out.println("Authentication Failed.");
        }

        scanner.close();
    }
}
