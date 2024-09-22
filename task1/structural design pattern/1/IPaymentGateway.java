public interface IPaymentGateway {
    boolean processPayment(double amount);

    String getTransactionDetails();
}