package org.example.Day7.PaymentProblem;

public class PaymentWithPaypal extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Making Paypal Payment");
        System.out.println("Processing Payment");
        System.out.println("Payment Successful "+ amount);
    }
}
