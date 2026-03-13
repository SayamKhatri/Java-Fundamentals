package Level1;

public class CarBuilder {
    private String brand;
    private int year;
    private boolean isRunning;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }
    public CarBuilder setRunning(boolean isRunning) {
        this.isRunning = isRunning;
        return this;
    }
    public Car getCar() {
        return new Car(brand, year, isRunning);
    }
    
}