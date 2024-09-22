public class ModernPaymentSystem implements IPaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using the modern payment system.");
        // Simulate payment processing
        return Math.random() < 0.95;
    }

    @Override
    public String getTransactionDetails() {
        return "Modern Payment System: Transaction processed at " + java.time.LocalDateTime.now();
    }
}