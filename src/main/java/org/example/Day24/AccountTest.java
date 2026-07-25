package org.example.Day24;

import java.util.HashMap;
import java.util.Map;

public class AccountTest {

    public static void main(String[] args) {
        Map<String, AccountType> accountTypeLookup = new HashMap<>();
        accountTypeLookup.put(
                "TYPE001",
                new AccountType(
                        "TYPE001",
                        "Saving Account",
                        100.00,
                        2.5,
                        1_000.00,
                        false
                )
        );

        accountTypeLookup.put(
                "TYPE002",
                new AccountType(
                        "TYPE002",
                        "Current Account",
                        500.00,
                        0.0,
                        5_000.00,
                        true
                )
        );

        accountTypeLookup.put(
                "TYPE003",
                new AccountType(
                        "TYPE003",
                        "Fixed Deposit Account",
                        1_000.00,
                        5.5,
                        0.00,
                        false
                )
        );

        Map<String, Account> accounts = new HashMap<>();

        Account account1 = new Account(
                "ACC001",
                "Min Maung",
                "min@gmail.com",
                "09111111111",
                "Bangkok",
                "12/ABC(N)123456",
                "BANK001",
                "123456",
                2_000.00,
                "TYPE001"
        );

        Account account2 = new Account(
                "ACC002",
                "Aung Aung",
                "aung@gmail.com",
                "09222222222",
                "Yangon",
                "9/XYZ(N)654321",
                "BANK002",
                "234567",
                10_000.00,
                "TYPE002"
        );

        accounts.put(account1.getBankNo(), account1);
        accounts.put(account2.getBankNo(), account2);

        for(Account account: accounts.values()){
            System.out.print("Account--> "+ account.toString());
            AccountType accountType =accountTypeLookup.get(account.getAccountTypeId());
            System.out.println("AccountType-->"+accountType.getName());
        }
    }
}