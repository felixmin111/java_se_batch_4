package org.example.Day8.PaymentProblem;

public class PaymentService {
    OnlinePayment onlinePayment;
    public PaymentService(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
        this.onlinePayment.pay(onlinePayment.amount);
    }
}
