package Level4.InventoryManagementSystem;

public class PhysicalProduct extends Product{
    private double weight;
    private int stockCount;

    public PhysicalProduct(String productId, String name, double price, double weight, int stockCount) {
        super(productId, name, price);
        this.weight = weight;
        this.stockCount = stockCount;
    }

    public int getStockCount() {
        return stockCount;
    }

    protected void reduceStockCount(int qty) {
        this.stockCount -= qty;
    }

    @Override
    public void purchase(int qty, User u) {
        if (qty <= stockCount){
            stockCount -= qty;
            System.out.println("Purchasing Physical Product: " + getName() + " at price :" + getPrice() + " by user: " + u.getName());
        }

        else {
            System.out.println("Not Enough Quanitiy!");
        }

    }

}
