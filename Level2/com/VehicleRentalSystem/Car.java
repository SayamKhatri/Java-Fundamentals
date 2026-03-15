package Level2.com.VehicleRentalSystem;

public class Car extends Vehicle {
    
    Car(String name, String color) {
            super(name, color);
        }

    @Override
    protected double getRatePerDay() {
        return 50.0;
    }


}
