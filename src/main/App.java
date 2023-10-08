package main;

import authentication.AuthLogin;
import authentication.AuthRegister;
import authentication.AuthService;
import payment.PaymentGateway;
import payment.PaymentInfo;
import payment.PaymentRecord;
import payment.PaymentService;
import transaction_history.TransactionHistory;
import user_management.UserManager;

public class App { //changed main class to this now
    public static void main(String[] args) {
        // Instantiate services and classes
        AuthService authService = new AuthService();
        AuthLogin authLogin = new AuthLogin(authService);
        AuthRegister authRegister = new AuthRegister();
        PaymentService paymentService = new PaymentService();
        PaymentGateway paymentGateway = new PaymentGateway();
        UserManager userManager = new UserManager();
        TransactionHistory transactionHistory = new TransactionHistory();

        // Example usage of services and classes

        // 1. User Registration and Login
        String username = "user1";
        String password = "pass1";

        if(authRegister.registerUser(username, password)) {
            System.out.println("User registered successfully!");
        }

        if(authLogin.loginUser(username, password)) {
            System.out.println("User logged in successfully!");
        }

        // 2. Payment Processing
        PaymentInfo paymentInfo = new PaymentInfo("1234567812345678", "12/23", 123);
        String transactionId = paymentService.processPayment(1, 100.0, paymentInfo);

        if (!"Error".equals(transactionId)) {
            System.out.println("Payment processed successfully! Transaction ID: " + transactionId);
        } else {
            System.out.println("Payment processing failed!");
        }

        // 3. Retrieve Transaction Details
        PaymentRecord record = transactionHistory.getTransactionDetails(Integer.parseInt(transactionId));
        if (record != null) {
            System.out.println("Retrieved transaction details for ID: " + record.getPaymentID());
        } else {
            System.out.println("No transaction details found for ID: " + transactionId);
        }

        // Additional logic and flow would go here, based on your application's requirements.
    }
}
