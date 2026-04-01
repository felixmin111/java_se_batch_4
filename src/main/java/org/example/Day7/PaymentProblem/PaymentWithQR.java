package org.example.Day7.PaymentProblem;

public class PaymentWithQR extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Making QR Payment");
        System.out.println("Processing Payment");
        System.out.println("Payment Successful "+ amount);
    }
}
