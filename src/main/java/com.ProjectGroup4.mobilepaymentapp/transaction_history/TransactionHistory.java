package com.ProjectGroup4.mobilepaymentapp.transaction_history;

import com.ProjectGroup4.mobilepaymentapp.payment.PaymentRecord;

public class TransactionHistory {

    public PaymentRecord getTransactionDetails(String transactionIdString) {
        // Ensure the transactionIdString is not null or empty before trying to parse it
        if (transactionIdString == null || transactionIdString.trim().isEmpty()) {
            System.err.println("Transaction ID cannot be null or empty");
            return null;
        }

        try {
            // Try to parse the transactionIdString as an Integer
            Integer transactionId = Integer.parseInt(transactionIdString.trim());

            // Stub: Implement logic to retrieve transaction details by ID
            System.out.println("Retrieving details for transaction: " + transactionId);
            return new PaymentRecord(transactionId); // Dummy return value
        } catch (NumberFormatException e) {
            // Handle the case where transactionIdString is not a valid integer
            System.err.println("Invalid transaction ID: " + transactionIdString);
            return null;
        }
    }
}


