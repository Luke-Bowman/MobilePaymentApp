package test;

import src.authentication.AuthLogin;
import src.authentication.AuthRegister;
import src.authentication.AuthService;
import src.main.App;
import src.payment.PaymentGateway;
import src.payment.PaymentInfo;
import src.payment.PaymentRecord;
import src.payment.PaymentService;
import src.transaction_history.TransactionHistory;
import src.user_management.UserManager;

public class TestHarness {
    public static void main(String[] args) {
        // Instantiate services and classes
        App app = new App();

        // Test Variables
        String username = "user1";
        String password = "pass1";
        PaymentInfo paymentInfo = new PaymentInfo("1234567812345678", "12/23", 123);

        // Test 1: User Registration
        AuthRegister authRegister;
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
        PaymentRecord record = transactionHistory.getTransactionDetails(Integer.parseInt(transactionId));
        if (record != null) {
            record.getPaymentID();
            Integer.parseInt(transactionId);
        }
        boolean isTransactionRetrieved = false;
        printTestResult("Retrieve Transaction Details", isTransactionRetrieved);
    }

    private static void printTestResult(String testName, boolean result) {
        System.out.println(testName + ": " + (result ? "Passed" : "Failed"));
    }
}


}
