package org.example.assigment.lapyae.bankex.model;

public class Account {
    private String bankNo;
    private String pin;
    private double balance;

    public Account(String bankNo, String pin, double balance) {
        this.bankNo = bankNo;
        this.pin = pin;
        this.balance = balance;
    }

    public String getBankNo() { return bankNo; }
    public String getPin() { return pin; }
    public double getBalance() { return balance; }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
