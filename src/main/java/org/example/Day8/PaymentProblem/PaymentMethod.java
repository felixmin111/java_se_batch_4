package org.example.Day8.PaymentProblem;

public interface PaymentMethod {
    public void pay(double amount);
    public boolean validatePayment(double amount);
}
