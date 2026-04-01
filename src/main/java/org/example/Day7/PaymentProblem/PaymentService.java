package org.example.Day7.PaymentProblem;

public class PaymentService {
    Payment payment;
    public PaymentService(Payment payment) {
        this.payment = payment;
    }
    public void paymentService(double amount) {
        payment.pay(amount);
    }
}
