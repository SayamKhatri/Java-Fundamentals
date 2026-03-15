package Level2.com.VehicleRentalSystem;

public class Truck extends Vehicle implements SpecialLisencse{

    Truck(String name, String color) {
        super(name, color);
    }

    @Override
    protected double getRatePerDay() {
        return 150.0;
    }

    @Override
    public boolean requireSpecialLisence() {
        return true;
    }

}
