package org.example.Day24;

public class AccountType {

    private String id;
    private String name;
    private double minimumBalance;
    private double interestRate;
    private double dailyWithdrawLimit;
    private boolean allowOverdraft;

    public AccountType(
            String id,
            String name,
            double minimumBalance,
            double interestRate,
            double dailyWithdrawLimit,
            boolean allowOverdraft
    ) {
        this.id = id;
        this.name = name;
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
        this.dailyWithdrawLimit = dailyWithdrawLimit;
        this.allowOverdraft = allowOverdraft;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getDailyWithdrawLimit() {
        return dailyWithdrawLimit;
    }

    public boolean isAllowOverdraft() {
        return allowOverdraft;
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", minimumBalance=" + minimumBalance +
                ", interestRate=" + interestRate +
                ", dailyWithdrawLimit=" + dailyWithdrawLimit +
                ", allowOverdraft=" + allowOverdraft +
                '}';
    }
}