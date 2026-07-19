package org.example.assigment.thiri.Bank;

import java.util.ArrayList;
import java.util.List;

public class AccountController {

        AccountService accountService = new AccountService();

        public AccountController() {
            this.accountService = new AccountService();
        }

        public Account login(String bankNo, String pin) {
            return accountService.login(bankNo, pin);
        }
    }
