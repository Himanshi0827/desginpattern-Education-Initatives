public class OldPaymentAdapter implements IPaymentGateway {
    private OldPaymentSystem oldSystem;

    public OldPaymentAdapter(OldPaymentSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public boolean processPayment(double amount) {
        return oldSystem.makePayment((float) amount);
    }

    @Override
    public String getTransactionDetails() {
        return oldSystem.getPaymentInfo();
    }
}