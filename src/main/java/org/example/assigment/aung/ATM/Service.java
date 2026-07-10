package org.example.assigment.aung.ATM;

public class Service {


    public Account authenticate(Account[] accounts, String enteredAccNo, String enteredPass){
        for (Account currentAccount : accounts) {
            if (currentAccount.getAccNo().equals(enteredAccNo) && currentAccount.getPin().equals(enteredPass)) {
                return currentAccount;
            }
        }
        return null;
    }

    public void withdraw(Account account, double amount){
        if(amount > 0 && account.getBalance()>=amount){
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdraw Successful");
        }
        else {
            System.out.println("Insufficient Balance or invalid input");
        }
    }

    public void deposit(Account account, double amount){
        if (amount>0){
            account.setBalance(account.getBalance() + amount);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
