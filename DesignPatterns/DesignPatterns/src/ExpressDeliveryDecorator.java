public class ExpressDeliveryDecorator extends LaundryDecorator {
    public ExpressDeliveryDecorator(LaundryService service) {
        super(service);
    }

    public String getDescription() {
        return service.getDescription() + ", Express Delivery";
    }

    public double getCost() {
        return service.getCost() + 100.0;
    }
}
