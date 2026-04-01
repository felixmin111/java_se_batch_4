package org.example.Day7.PaymentProblem;

public class PaymentApi {
    public static void main(String[] args) {
        PaymentWithCard paymentWithCard = new PaymentWithCard();

        PaymentService paymentService = new PaymentService(paymentWithCard);
        paymentService.paymentService(2000);
    }
}
