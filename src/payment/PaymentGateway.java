package src.payment;

public class PaymentGateway {
    public boolean makePayment(payment.PaymentInfo paymentInfo, double amount) {
        // Stub: Make payment through external gateway
        System.out.println("Making payment of $" + amount);
        return true; // Dummy return value
    }
}

