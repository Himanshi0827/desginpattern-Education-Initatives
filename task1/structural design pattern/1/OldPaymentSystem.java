public class OldPaymentSystem {
    public boolean makePayment(float amount) {
        System.out.println("Processing payment of $" + amount + " using the old payment system.");
        // Simulate payment processing
        return Math.random() < 0.8;
    }

    public String getPaymentInfo() {
        return "Old Payment System: Transaction processed at " + java.time.LocalDateTime.now();
    }
}