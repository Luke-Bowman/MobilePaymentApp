package src.payment;

public class PaymentRecord {
    private Integer transactionID;

    public PaymentRecord(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public void getPaymentID() {
        System.out.println("Payment ID: " + this.transactionID);
    }
}
