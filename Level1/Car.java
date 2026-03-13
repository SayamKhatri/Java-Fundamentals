package Level1;

public class Car extends Vehicle implements Insurable, Trackable{
    private boolean isRunning;
    static int totalCarsCreated;


    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public boolean isRunning() {
        return isRunning;
    }

    Car (String brand, int year, boolean isRunning) {
        super(brand, year);
        this.isRunning = isRunning;
        totalCarsCreated += 1;
    }

    Car (String brand, int year) {
        super(brand, year);
        this.isRunning = false;
        totalCarsCreated += 1;
    }

    @Override
    public void describe() {
        System.out.println("Brand: " + getBrand() + " and Year: " + getYear() 
        + " and running: " + this.isRunning() + " on fuel type: " + fuelType());
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }

    @Override
    public double calculatePremium() {
        return 0.5 * getYear();
    }

    @Override
    public String getInsuranceType() {
        return "Comprehensive";
    }

    @Override
    public String getTrackingId() {
        return "1223456";
    }

    public static int getFleetSize() {
        
        return totalCarsCreated;
    }
}
