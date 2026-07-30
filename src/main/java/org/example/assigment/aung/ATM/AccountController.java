package org.example.assigment.aung.ATM;

public class AccountController {
    private Service service;

    public AccountController() {
        this.service = new Service();
    }

    public Account login(String accNo, String pin) {
        return service.authenticate(accNo, pin);
    }

    public void withdraw(Account account, double amount) {
        service.withdraw(account, amount);
    }

    public void deposit(Account account, double amount) {
        service.deposit(account, amount);
    }
}
