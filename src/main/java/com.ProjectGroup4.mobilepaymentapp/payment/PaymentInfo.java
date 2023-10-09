package com.ProjectGroup4.mobilepaymentapp.payment;

public class PaymentInfo {
    private final String creditCardNumber;
    private final String expirationDate;
    private final Integer securityNum;

    public PaymentInfo(String s, String s1, int i) {
        this.creditCardNumber = s;
        this.expirationDate = s1;
        this.securityNum = i;
    }

    // Constructor, getters, and setters...
}

