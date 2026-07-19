package org.example.assigment.aung.ATM;
import java.util.Scanner;

public class view {
    private Service service;
    private Scanner scanner;
    private Account[] accounts;
    boolean isRunning = true;

    public view(Service service, Account[] accounts) {
        this.service = service;
        this.scanner = new Scanner(System.in);
        this.accounts = accounts;
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
            while(isRunning){
                System.out.println("\n1.Withdraw Money");
                System.out.println("2. Deposit Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("===============");

                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Enter Amount to withdraw: ");
                        double withdrawal = scanner.nextDouble();
                        service.withdraw(user, withdrawal);
                        break;

                    case 2:
                        System.out.println("Enter Amount to deposit: ");
                        double deposited = scanner.nextDouble();
                        service.deposit(user, deposited);
                        break;

                    case 3:
                        System.out.println("Current Balance RM: "+ user.getBalance());
                        break;

                    case 4:
                        System.out.println("Exiting....");
                        isRunning = false;
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
