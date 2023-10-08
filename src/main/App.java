package src.main;

import src.authentication.AuthLogin;
import src.authentication.AuthRegister;
import src.authentication.AuthService;
import src.payment.PaymentGateway;
import src.payment.PaymentService;
import src.transaction_history.TransactionHistory;
import src.user_management.UserManager;


public class App { //NEW BRanch
    public static void main(String[] args) {
        // Instantiate services and classes
        AuthService authService = new AuthService();
        AuthLogin authLogin = new AuthLogin(authService);
        AuthRegister authRegister = new AuthRegister();
        PaymentService paymentService = new PaymentService();
        PaymentGateway paymentGateway = new PaymentGateway();
        UserManager userManager = new UserManager();
        TransactionHistory transactionHistory = new TransactionHistory();
    }
}



