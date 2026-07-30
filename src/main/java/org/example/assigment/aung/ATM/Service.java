package org.example.assigment.aung.ATM;

import java.util.Map;

public class Service {
    private AccountRepository repository;

    public Service() {
        this.repository = new AccountRepository();
    }

    public Account authenticate(String enteredAccNo, String enteredPass) {
        return repository.login(enteredAccNo, enteredPass);
    }

    public void withdraw(Account account, double amount) {
        Map<String, AccountType> accountTypes = repository.getAllAccountTypes();
        AccountType type = accountTypes.get(account.getAccountTypeID());

        if (type != null && amount > type.getWithDrawLimit()) {
            System.out.println("Error: Exceeds daily withdrawal limit of RM " + type.getWithDrawLimit());
            return;
        }
        
        if (amount > 0 && account.getBalance() >= amount) {
            account.withdraw(amount);
            repository.updateBalance(account.getAccNo(), account.getBalance()); // Save to DB!
            System.out.println("Withdraw Successful! New balance: RM " + account.getBalance());
        } else {
            System.out.println("Error: Insufficient balance or invalid input.");
        }
    }

    public void deposit(Account account, double amount) {
        if (amount > 0) {
            account.deposit(amount);
            repository.updateBalance(account.getAccNo(), account.getBalance()); // Save to DB!
            System.out.println("Deposit Successful! New balance: RM " + account.getBalance());
        } else {
            System.out.println("Error: Invalid deposit amount.");
        }
    }
}
