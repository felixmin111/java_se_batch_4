package org.example.assigment.aung.ATM;

public class Account {
    private String accNo;
    private String pin;
    private double balance;

    public Account(String accNo, String pin, double balance) {
        this.accNo = accNo;
        this.pin = pin;
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public String getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
