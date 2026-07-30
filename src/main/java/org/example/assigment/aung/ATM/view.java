package org.example.assigment.aung.ATM;

import java.util.Scanner;

public class view {
    private AccountController controller;
    private Scanner scanner;
    private boolean isRunning = true;

    public view(AccountController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void mainmenu() {
        System.out.println("=== Welcome to the ATM Management System ===\n");
        System.out.println("Enter your Bank No: ");
        String accNo = scanner.nextLine();

        System.out.println("Enter Pin: ");
        String pin = scanner.nextLine();

        Account user = controller.login(accNo, pin);
        if (user != null) {
            System.out.println("\nAuthentication Successful! Welcome, " + user.getName() + "!");
            while (isRunning) {
                System.out.println("\n1. Withdraw Money");
                System.out.println("2. Deposit Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("===============");
                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Amount to withdraw: ");
                        double withdrawal = scanner.nextDouble();
                        controller.withdraw(user, withdrawal);
                        break;

                    case 2:
                        System.out.print("Enter Amount to deposit: ");
                        double deposited = scanner.nextDouble();
                        controller.deposit(user, deposited);
                        break;

                    case 3:
                        System.out.println("Current Balance RM: " + user.getBalance());
                        break;

                    case 4:
                        System.out.println("Exiting.... Thank you!");
                        isRunning = false;
                        break;

                    default:
                        System.out.println("Invalid choice, Please try again.");
                }
            }
        } else {
            System.out.println("Authentication Failed. Invalid Bank No or PIN.");
        }
    }
}
