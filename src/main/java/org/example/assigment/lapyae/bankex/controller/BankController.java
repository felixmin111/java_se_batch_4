package org.example.assigment.lapyae.bankex.controller;


import org.example.assigment.lapyae.bankex.model.Account;

public class BankController {
    private Account currentAccount;

    public BankController() {
        this.currentAccount = new Account("123456789", "1234", 1000000.0);
    }

    public boolean authenticate(String bankNo, String pin) {
        return currentAccount.getBankNo().equals(bankNo) && currentAccount.getPin().equals(pin);
    }

    public boolean withdraw(double amount) {
        if (amount <= currentAccount.getBalance()) {
            currentAccount.withdraw(amount);
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        currentAccount.deposit(amount);
    }

    public double getBalance() {
        return currentAccount.getBalance();
    }
}