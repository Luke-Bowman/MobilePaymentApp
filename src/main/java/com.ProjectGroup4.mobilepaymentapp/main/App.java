package com.ProjectGroup4.mobilepaymentapp.main;

import com.ProjectGroup4.mobilepaymentapp.authentication.AuthLogin;
import com.ProjectGroup4.mobilepaymentapp.authentication.AuthRegister;
import com.ProjectGroup4.mobilepaymentapp.authentication.AuthService;
import com.ProjectGroup4.mobilepaymentapp.authentication.User;
import com.ProjectGroup4.mobilepaymentapp.payment.PaymentGateway;
import com.ProjectGroup4.mobilepaymentapp.payment.PaymentInfo;
import com.ProjectGroup4.mobilepaymentapp.payment.PaymentRecord;
import com.ProjectGroup4.mobilepaymentapp.payment.PaymentService;
import com.ProjectGroup4.mobilepaymentapp.transaction_history.TransactionHistory;
import com.ProjectGroup4.mobilepaymentapp.transaction_history.UserTransaction;
import com.ProjectGroup4.mobilepaymentapp.user_management.UserAccount;
import com.ProjectGroup4.mobilepaymentapp.user_management.UserManager;
import com.ProjectGroup4.mobilepaymentapp.user_management.UserProfile;

public class App {
    public static void main(String[] args) {
        // Instantiate services and classes
        AuthService authService = new AuthService();
        AuthLogin authLogin = new AuthLogin(authService);
        AuthRegister authRegister = new AuthRegister();
        PaymentService paymentService = new PaymentService();
        PaymentGateway paymentGateway = new PaymentGateway();
        UserManager userManager = new UserManager();
        TransactionHistory transactionHistory = new TransactionHistory();
        PaymentInfo paymentInfo = new PaymentInfo("1234567812345678", "12/23", 123);
        PaymentRecord transactionRecord = new PaymentRecord(1);
        //UserProfile userProfile = new UserProfile();
        UserAccount userAccount = new UserAccount();
        UserTransaction userTransaction = new UserTransaction();

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

        // Instantiate User
        User user = new User(username, password);
        System.out.println("User created: " + user.getUsername());

        // 2. Payment Processing
        String transactionId = paymentService.processPayment(user.getUserId(), 100.0, paymentInfo);

        if (!"Error".equals(transactionId)) {
            System.out.println("Payment processed successfully! Transaction ID: " + transactionId);
        } else {
            System.out.println("Payment processing failed!");
        }

        // 3. Retrieve Transaction Details
        PaymentRecord record = transactionHistory.getTransactionDetails(transactionId);
        if (record != null) {
            record.getPaymentID();
        } else {
            System.out.println("No transaction details found for ID: " + transactionId);
        }
    }
}




