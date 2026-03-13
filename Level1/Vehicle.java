package Level1;

public abstract class Vehicle {
    private String brand;
    private int year;
    
    public abstract String fuelType();

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void describe() {
        System.out.println("Brand: " + this.brand + " and Year: " + this.year);
    }
    
}
