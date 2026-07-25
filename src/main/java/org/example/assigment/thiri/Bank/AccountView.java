package org.example.assigment.thiri.Bank;

import java.sql.SQLException;
import java.util.Scanner;

public class AccountView {
    static AccountController accountController = new AccountController();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        try {
            if(DatabaseConnection.getConnection()!=null){
                System.out.println("Connection is successful!!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        bankApp();
    }

    private static void bankApp(){
        while (true) {
            //Step1 login
            Account loggedIn=login();

            if (loggedIn == null) {
                System.out.println("Authentication Failed. Invalid bank number or PIN.");
                continue;
            } else  {
                System.out.println("Auth Successful !!!");
                bankMenu(loggedIn);
            }
            scanner.close();
            break;
        }
    }
    private static Account login(){
        System.out.println("Enter your bank number: ");
        String bankNo = scanner.nextLine();
        System.out.println("Enter your pin: ");
        String pin = scanner.nextLine();
        return accountController.login(bankNo, pin);
    }
    private static void bankMenu(Account loggedIn){
        while (true) {
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Info");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                withdrawAmount(loggedIn);
            } else if (input.equals("2")) {
                depositeAmount(loggedIn);
            } else if (input.equals("3")) {
                showCurrentAmount(loggedIn);
            } else if (input.equals("4")) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
    private static void withdrawAmount(Account loggedIn){
        System.out.print("Enter amount that you want to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (accountController.updateAmount(loggedIn, amount, "withdraw")) {
            System.out.println("Withdraw Process Success");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    private static void depositeAmount(Account loggedIn){
        System.out.print("Enter amount that you want to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (accountController.updateAmount(loggedIn, amount, "deposit")) {
            System.out.println("Deposit Process Success");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private static void showCurrentAmount(Account loggedIn){
        double freshBalance = accountController.getCurrentBalance(loggedIn.getBankNo(), loggedIn.getPin());

        if (freshBalance != -1) {
            loggedIn.setBalance(freshBalance);
            System.out.println("Your Account has: RM " + freshBalance);
        } else {
            System.out.println("Error retrieving balance from the database.");
        }
    }

}