package org.example.assigment.aung.ATM;
import java.util.Scanner;

public class view {
    private Service service;
    private Scanner scanner;
    private Account[] accounts;

    public view(Service service, Account[] accounts) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void mainmenu(){
        System.out.println("===Welcome to the ATM Management System===\n");
        System.out.println("Enter your Bank No: ");
        String accNo = scanner.nextLine();

        System.out.println("Enter Pin: ");
        String pin = scanner.nextLine();

        Account user = service.authenticate(accounts, accNo, pin);
        if (user != null) {
            System.out.println("Authentication Successful");
            while(true){
                System.out.println("\n1.Withdraw Money");
                System.out.println("\n2. Deposit Money");
                System.out.println("\n3. Check Balance");
                System.out.println("\n4. Exit");
                System.out.println("\n===============");

                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Enter Amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        service.withdraw(user, amount);

                    case 2:
                        System.out.println("Enter Amount to deposit: ");
                        amount = scanner.nextDouble();
                        service.deposit(user, amount);

                    case 3:
                        System.out.println("Current Balance RM: "+ user.getBalance());

                    case 4:
                        System.out.println("Exiting....");
                        break;

                    default:
                        System.out.println("Invalid choice, Please try again");
                }

            }
        }
        else {
            System.out.println("Authentication Failed");
        }
    }


}
