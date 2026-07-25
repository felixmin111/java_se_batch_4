package org.example.assigment.thiri.Bank;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    public AccountRepository accountRepository;

    public AccountService() {

        accountRepository = new AccountRepository();
    }

    public Account login(String username, String password) {
        Account account = accountRepository.login(username, password);
        if (account != null) {
            return account;
        } else {
            return null;
        }
    }

    public boolean updateAmount(Account account, double amount, String transactionType) {
        if (amount <= 0) {
            return false;
        }

        if (transactionType.equalsIgnoreCase("withdraw")) {
            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
            } else {
                return false;
            }
        } else if (transactionType.equalsIgnoreCase("deposit")) {
            account.setBalance(account.getBalance() + amount);
        } else {
            return false;
        }

        accountRepository.updateAmount(account);
        return true;
    }

    public double getCurrentBalance(String bankNo, String pin) {
        return accountRepository.getCurrentBalance(bankNo, pin);
    }
}
