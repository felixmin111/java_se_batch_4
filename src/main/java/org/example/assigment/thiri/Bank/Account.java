package org.example.assigment.thiri.Bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String bankNo;
    private String pin;
    private double balance;

    public Account(String bankNo, String pin, double balance) {
        this.bankNo = bankNo;
        this.pin = pin;
        this.balance = balance;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        if( pin == null || pin.length() < 8 ) {
            System.out.println("Error: PIN must be at least 8 character.");
        }

        boolean hasDigit = false;
        boolean hasLetter = false;
        boolean hasSymbol = false;

        for( int i = 0; i < pin.length(); i++ ) {
            if(Character.isDigit(pin.charAt(i))) {
                hasDigit = true;
            } else if(Character.isLetter(pin.charAt(i))) {
                hasLetter = true;
            } else if(Character.isLetter(pin.charAt(i))) {
                hasSymbol = true;
            }
        }

        if (hasDigit && hasLetter && hasSymbol) {
            this.bankNo = pin;
        } else {
            System.out.println("Error: PIN must contain at least 8 characters, including at least one letter, one digit, and one symbol.");
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative");
        }
    }

}
