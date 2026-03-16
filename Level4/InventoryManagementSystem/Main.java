package Level4.InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Sam", "1");
        Product p1 = new PhysicalProduct("P1", "Iphone", 1000, 2, 3);
        Product p2 = new PhysicalDiscountedProduct("P2", "MacBook-Air", 1000, 10, 10, 10);
        Product p3 = new DigitalProduct("P3", "HarryPotterMovie", 10, 10, 5);

        InventoryService service = InventoryService.getInstance();
        service.purchaseProduct(p1, 3, u1);
        service.purchaseProduct(p2, 1, u1);
        
    }
}
