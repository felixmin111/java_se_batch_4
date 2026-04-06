package org.example.Day8.PaymentProblem;

public class KBZPay extends OnlinePayment{
    public KBZPay(String accountName, String transactionId, double amount) {
        super(accountName, transactionId, amount);
    }

    @Override
    public void pay(double amount) {
        if(validatePayment(amount)){
            System.out.println("Verify with NRC and Phone");
            System.out.println("KBZ Payment Processing...!");
            super.printReceipt();
        }else{
            System.out.println("Payment failed..!");
        }
    }

    @Override
    public boolean validatePayment(double amount) {
        if(amount >= 0){
            return true;
        }
        return false;
    }
}
