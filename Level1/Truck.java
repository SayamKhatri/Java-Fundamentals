package Level1;
public class Truck extends Vehicle{
    private int payloadCapacity;

    public Truck(String brand, int year, int payloadCapacity) {
            super(brand, year);
            this.payloadCapacity = payloadCapacity;
        }
    
    public int getPayloadCapacity() {
        return payloadCapacity;
    }
    
    @Override
    public void describe() {
        System.out.println("Brand: " + getBrand() + " and Year: " + getYear() 
        + " and running: " + this.getPayloadCapacity() + " And runs on: " + fuelType());
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }

}
