public class LaundryBasket {
    private PaymentStrategyin paymentStrategyin;

    // set or switch the strategy at runtime
    public void setPaymentStrategyin(PaymentStrategyin paymentStrategyin) {
        this.paymentStrategyin = paymentStrategyin;
    }

    public void checkout(double amount) {
        if (paymentStrategyin == null) {
            throw new IllegalStateException("No payment method selected!");
        }

        paymentStrategyin.pay(amount);
    }
}
