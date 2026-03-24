public class CashOnDelivery implements PaymentStrategyin{
    @Override
    public void pay(double amount) {
        System.out.println(amount + " to be paid by cash on delivery");
    }
}
