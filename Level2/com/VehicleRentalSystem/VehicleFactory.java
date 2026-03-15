package Level2.com.VehicleRentalSystem;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VehicleFactory {
    static VehicleFactory instance  = new VehicleFactory();
    private VehicleFactory(){};

    public static VehicleFactory getInstance(){
        return instance;
    }

    public Vehicle create(String type, String name, String color) {
        if (type.equals("CAR")){
            return new Car(name, color);
        }
        else if (type.equals("TRUCK")) {
            return new Truck(name, color);
        }
        else if (type.equals("BIKE")) {
            return new Bike(name, color);
        }
        else {
            throw new IllegalArgumentException("Wrong vehicle kind");
        }
    }
    
}
