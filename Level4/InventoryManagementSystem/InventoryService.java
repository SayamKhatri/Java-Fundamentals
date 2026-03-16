package Level4.InventoryManagementSystem;

public class InventoryService {
    private static InventoryService instance = new InventoryService();
    private InventoryService(){};

    public static InventoryService getInstance(){
        return instance;
    }

    public void purchaseProduct(Product p, int qty, User u){
        p.purchase(qty, u);        
    }
}
