public class PerfumeDecorator extends LaundryDecorator {
    public PerfumeDecorator(LaundryService service) {
        super(service);
    }

    public String getDescription() {
        return service.getDescription() + ", Perfume";
    }

    public double getCost() {
        return service.getCost() + 30.0;
    }
}
