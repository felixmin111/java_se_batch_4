package org.example.Day8.PaymentProblem;

public abstract class OnlinePayment implements PaymentMethod {
    protected String accountName;
    protected String transactionId;
    protected double amount;
    public OnlinePayment(String accountName, String transactionId, double amount) {
        this.accountName = accountName;
        this.transactionId = transactionId;
        this.amount = amount;
    }
    public void printReceipt(){
        System.out.println("Account Name---->"+this.accountName);
        System.out.println("Transaction Id-->"+this.transactionId);
        System.out.println("Amount-->"+this.amount);
        System.out.println("--------------Payment Successful---------------");
    }
}
