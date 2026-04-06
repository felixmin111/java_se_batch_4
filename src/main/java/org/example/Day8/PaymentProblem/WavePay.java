package org.example.Day8.PaymentProblem;

public class WavePay extends OnlinePayment{
    public WavePay(String accountName, String transactionId, double amount) {
        super(accountName, transactionId, amount);
    }

    @Override
    public void pay(double amount) {
       if(validatePayment(amount)){
           System.out.println("Verify with phone number code");
           System.out.println("Wave Payment Processing...!");
           super.printReceipt();
       }else{
           System.out.println("Payment failed..!");
       }
    }

    @Override
    public boolean validatePayment(double amount) {
        if(amount >= 100){
            return true;
        }
        return false;
    }
}
