package Level2.com.VehicleRentalSystem;

public class Rental {
    public void rent(String type, String name, String user, String color, int Days) {
        Vehicle v = VehicleFactory.getInstance().create(type, name, color);
        
        System.out.println("User" + user);
        System.out.println("Vehicle Type" + type);
        System.out.println("Vehicle Name" + name);
        System.out.println("Total Cost" + Days * v.getRatePerDay());


    }

    
}
