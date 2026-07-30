package org.example.assigment.aung.ATM;

public class AccountType {
    private String id;
    private String name;
    private double withDrawLimit;

    public AccountType(String id, String name, double withDrawLimit) {
        this.id = id;
        this.name = name;
        this.withDrawLimit = withDrawLimit;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWithDrawLimit() {
        return withDrawLimit;
    }
}
