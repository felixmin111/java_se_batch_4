package org.example.assigment.thiri.Bank;
public class AccountController {

        AccountService accountService;

        public AccountController() {
            this.accountService = new AccountService();
        }

        public Account login(String bankNo, String pin) {
            return accountService.login(bankNo, pin);
        }
    }
