package org.example.Day23.Bank;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    public List<Account> accounts;
    public AccountRepository accountRepository;

    public AccountService() {

        accountRepository=new AccountRepository();

        accounts = new ArrayList<>();
        accounts.add(new Account("123456789", "Abc@1234", 1000.0));
        accounts.add(new Account("123456780", "Abd@1234", 100.0));
        accounts.add(new Account("123456709", "Abe@1234", 8000.0));
    }

    public Account login(String username, String password) {
        Account account = accountRepository.login(username, password);
        if (account != null) {
            return account;
        } else {
            return null;
        }
    }

}

