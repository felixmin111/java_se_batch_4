package org.example.Day7.PaymentProblem;

public class PaymentWithCard extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Making Cash Payment");
        System.out.println("Processing Payment");
        System.out.println("Payment Successful "+ amount);
    }
}
