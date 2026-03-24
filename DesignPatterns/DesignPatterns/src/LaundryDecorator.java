public abstract class LaundryDecorator implements LaundryService {
    protected LaundryService service;

    public LaundryDecorator(LaundryService service) {
        this.service = service;
    }

    public String getDescription() {
        return service.getDescription();
    }

    public double getCost() {
        return service.getCost();
    }
}
