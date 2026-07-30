package org.example.assigment.aung.ATM;

public class Account {
    private String accNo;
    private String name;
    private String pin;
    private double balance;

    private String accountTypeID;

    public Account(String accNo, String name, String pin, double balance, String accountTypeID) {
        this.accNo = accNo;
        this.name = name;
        this.pin = pin;
        setBalance(balance);

        this.accountTypeID=accountTypeID;
    }

    public Account() {}

    public String getPin() {
        return pin;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountTypeID() {
        return accountTypeID;
    }

    public void setBalance(double balance) {
        if (balance>=0){
            this.balance=balance;
        } else {
            System.out.println("Error : Balance can't be negative");
        }
    }

    public void withdraw(double amount){
        if (amount>0 && amount <=balance) {
            balance-=amount;
        } else {
            System.out.println("Error : Invalid input or Insufficient Balance");
        }
    }

    public void deposit(double amount) {
        if (amount>0){
            balance +=amount;
        } else {
            System.out.println("Error : Invalid input");
        }
    }

    @Override
    public String toString() {
        return "[Account Number '" + accNo + '\'' +
                ", name='" + name + '\'' +
                ", Balance='" + balance + '\'' +
                ", Account Type='" + accountTypeID + '\'' +
                ']';
    }
}
