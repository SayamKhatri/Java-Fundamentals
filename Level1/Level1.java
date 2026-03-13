package Level1;

// Q2.
// Create a Vehicle[] array of size 3 — put one Car, one Truck, and another Car in it. 
// Loop through the array and call describe() on each. Notice what happens.

public class Level1 {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Range Rover", 2027, true);
        Vehicle v2 = new Truck("TATA", 2020, 20000);
        Vehicle v3 = new Car("Audi", 2027, true);
        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle vehicle : vehicles) {
            vehicle.describe();
        }

        Car c1 = new Car("Range Rover", 2027, true);
        System.out.println(c1.getInsuranceType());
        System.out.println(c1.calculatePremium());

        Insurable i = new Car("Range Rover", 2027, true);
        Trackable t = new Car("Range Rover", 2027, true);
        System.out.println(t.getTrackingId());
        System.out.println(c1.getTrackingId());
        System.out.println(Car.totalCarsCreated);

        Car c = new CarBuilder().setBrand("AUDI").getCar();
        
        

    }
}

