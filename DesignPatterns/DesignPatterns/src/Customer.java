public class Customer {
    public static void main(String[] args) {
        LaundryBasket basket = new LaundryBasket();

        basket.setPaymentStrategyin(new CardPayment());
        basket.checkout(500);

        basket.setPaymentStrategyin(new CashOnDelivery());
        basket.checkout(1000);
    }
}
