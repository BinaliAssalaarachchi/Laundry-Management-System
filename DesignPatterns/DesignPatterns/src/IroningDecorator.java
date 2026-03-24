public class IroningDecorator extends LaundryDecorator {
    public IroningDecorator(LaundryService service) {
        super(service);
    }

    public String getDescription() {
        return service.getDescription() + ", Ironing";
    }

    public double getCost() {
        return service.getCost() + 50.0;
    }
}
