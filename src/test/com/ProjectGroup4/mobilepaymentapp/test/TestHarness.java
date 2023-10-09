package com.ProjectGroup4.mobilepaymentapp.test;

import com.ProjectGroup4.mobilepaymentapp.authentication.AuthLogin;
import com.ProjectGroup4.mobilepaymentapp.authentication.AuthRegister;
import com.ProjectGroup4.mobilepaymentapp.authentication.AuthService;
import com.ProjectGroup4.mobilepaymentapp.payment.PaymentGateway;
import com.ProjectGroup4.mobilepaymentapp.payment.PaymentInfo;
import com.ProjectGroup4.mobilepaymentapp.payment.PaymentRecord;
import com.ProjectGroup4.mobilepaymentapp.payment.PaymentService;
import com.ProjectGroup4.mobilepaymentapp.transaction_history.TransactionHistory;
import com.ProjectGroup4.mobilepaymentapp.transaction_history.UserTransaction;
import com.ProjectGroup4.mobilepaymentapp.user_management.UserAccount;
import com.ProjectGroup4.mobilepaymentapp.user_management.UserManager;


public class TestHarness {
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
        UserAccount userAccount = new UserAccount();
        UserTransaction userTransaction = new UserTransaction();

        // Test Variables
        String username = "user1";
        String password = "pass1";

        // Test 1: User Registration
        boolean isUserRegistered = authRegister.registerUser(username, password);
        printTestResult("User Registration", isUserRegistered);

        // Test 2: User Login
        boolean isUserLoggedIn = authLogin.loginUser(username, password);
        printTestResult("User Login", isUserLoggedIn);

        // Test 3: Payment Processing
        String transactionId = paymentService.processPayment(1, 100.0, paymentInfo);
        boolean isPaymentProcessed = !"Error".equals(transactionId);
        printTestResult("Payment Processing", isPaymentProcessed);

        // Test 4: Retrieve Transaction Details
        PaymentRecord record = transactionHistory.getTransactionDetails(transactionId);
        boolean isTransactionRetrieved = record != null;
        printTestResult("Retrieve Transaction Details", isTransactionRetrieved);
    }

    private static void printTestResult(String testName, boolean result) {
        System.out.println(testName + ": " + (result ? "Passed" : "Failed"));
    }
}
