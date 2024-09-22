public class PaymentSystemDemo {
    public static void processPayment(IPaymentGateway gateway, double amount) {
        boolean success = gateway.processPayment(amount);
        System.out.println("Payment " + (success ? "successful" : "failed"));
        System.out.println(gateway.getTransactionDetails());
        System.out.println();
    }

    public static void main(String[] args) {
        // Modern payment system
        IPaymentGateway modernSystem = new ModernPaymentSystem();
        processPayment(modernSystem, 100.00);

        // Old payment system with adapter
        OldPaymentSystem oldSystem = new OldPaymentSystem();
        IPaymentGateway adaptedSystem = new OldPaymentAdapter(oldSystem);
        processPayment(adaptedSystem, 50.00);
    }
}