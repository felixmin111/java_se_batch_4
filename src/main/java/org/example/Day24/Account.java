package org.example.Day24;

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

    // Store only the ID
    private String accountTypeId;

    public Account(
            String id,
            String name,
            String email,
            String phone,
            String address,
            String nrc,
            String bankNo,
            String pin,
            double balance,
            String accountTypeId
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.nrc = nrc;
        this.bankNo = bankNo;
        this.accountTypeId = accountTypeId;

        setPin(pin);
        setBalance(balance);
    }

    public Account() {
    }

    public String getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(String accountTypeId) {
        this.accountTypeId = accountTypeId;
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
            System.out.println("PIN must contain at least 6 digits.");
            return;
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                System.out.println("PIN must contain digits only.");
                return;
            }
        }

        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getNrc() {
        return nrc;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", nrc='" + nrc + '\'' +
                ", bankNo='" + bankNo + '\'' +
                ", accountTypeId='" + accountTypeId + '\'' +
                ", balance=" + balance +
                '}';
    }

}