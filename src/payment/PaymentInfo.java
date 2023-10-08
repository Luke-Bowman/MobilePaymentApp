package src.payment;

public class PaymentInfo {
    private String creditCardNumber;
    private String expirationDate;
    private Integer securityNum;

    public PaymentInfo(String s, String s1, int i) {
        this.creditCardNumber = s;
        this.expirationDate = s1;
        this.securityNum = i;
    }

    // Constructor, getters, and setters...
}

