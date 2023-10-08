package main;

public class App {  // This is the main

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


