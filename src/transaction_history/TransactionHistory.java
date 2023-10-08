package transaction_history;

import payment.PaymentRecord;

public class TransactionHistory {
    public PaymentRecord getTransactionDetails(Integer transactionId) {
        // Stub: Implement logic to retrieve transaction details by ID
        System.out.println("Retrieving details for transaction: " + transactionId);
        return new PaymentRecord(transactionId); // Dummy return value
    }
}

