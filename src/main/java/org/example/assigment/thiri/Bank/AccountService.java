package org.example.assigment.thiri.Bank;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    public List<Account> accounts;

    public AccountService() {
        accounts = new ArrayList<>();
        accounts.add(new Account("123456789", "Abc@1234", 1000.0));
        accounts.add(new Account("123456780", "Abd@1234", 100.0));
        accounts.add(new Account("123456709", "Abe@1234", 8000.0));
    }

    public Account login(String username, String password) {
        for (Account account : accounts) {
            if (account.getBankNo().equals(username) && account.getPin().equals(password)) {
                return account;
            }
        }
        System.out.println("Invalid username or password.");
        return null;
   }

}

