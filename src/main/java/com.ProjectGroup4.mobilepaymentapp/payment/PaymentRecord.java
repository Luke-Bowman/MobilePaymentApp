package com.ProjectGroup4.mobilepaymentapp.payment;

public class PaymentRecord {
    private final Integer transactionID;

    public PaymentRecord(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public void getPaymentID() {
        System.out.println("Payment ID: " + this.transactionID);
    }
}
