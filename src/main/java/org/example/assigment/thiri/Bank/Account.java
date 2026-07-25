package org.example.assigment.thiri.Bank;

public class Account {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String nrc;
    private String bankNo;
    private String pin;
    private double balance;

    public Account(String bankNo, String pin, double balance) {
        this.bankNo = bankNo;
        setPin(pin);
        setBalance(balance);
    }

    public Account(String id, String name, String email, String phone, String address, String nrc, String bankNo, String pin, double balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.nrc = nrc;
        this.bankNo = bankNo;
        this.pin = pin;
        this.balance = balance;
    }

    public Account() {
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
        if (pin == null || pin.length() < 6) {
            return;
        }
        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return;
            }
        }

        // 3. If it passes all checks, save the PIN
        this.pin = pin;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }
}
