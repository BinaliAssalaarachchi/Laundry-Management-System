public class CardPayment implements PaymentStrategyin{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}
