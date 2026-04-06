package org.example.Day8.PaymentProblem;

public class MainApp {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService(new KBZPay("Felix","124434",344));
        PaymentService paymentServiceWave=new PaymentService(new WavePay("Felix","124434",344));
    }
}
