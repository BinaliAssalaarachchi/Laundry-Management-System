public class Main {
    public static void main(String[] args) {
        LaundryService order = new BasicWash();
        order = new IroningDecorator(order);
        order = new PerfumeDecorator(order);
        order = new ExpressDeliveryDecorator(order);

        System.out.println(order.getDescription()); // Basic Wash, Ironing, Perfume, Express Delivery
        System.out.println("Total Cost: " + order.getCost()); // 200 + 50 + 30 + 100 = 380

    }
}
