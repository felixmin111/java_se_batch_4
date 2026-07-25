package org.example.assigment.thiri.Bank;
public class AccountController {

        AccountService accountService;

        public AccountController() {
            this.accountService = new AccountService();
        }

        public Account login(String bankNo, String pin) {
            return accountService.login(bankNo, pin);
        }

    public boolean updateAmount(Account account, double amount, String transactionType) {
        return accountService.updateAmount(account, amount, transactionType);
    }

    public double getCurrentBalance(String bankNo, String pin) {
        return accountService.getCurrentBalance(bankNo, pin);
    }
}
