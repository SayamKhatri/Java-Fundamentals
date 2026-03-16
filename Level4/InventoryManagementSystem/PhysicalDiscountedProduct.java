package Level4.InventoryManagementSystem;

public class PhysicalDiscountedProduct extends PhysicalProduct implements Discountable {
    private double discountPercent;

    @Override
    public double applyDiscount(double price) {
        System.out.println("Applying Discount: " + (discountPercent) + " on Physical product");
        return (price - (price*(discountPercent/100)));
    }

    public PhysicalDiscountedProduct(String productId, String name, double price, double weight, int stockCount,
                                     double discountPercent) {
        super(productId, name, price, weight, stockCount);
        this.discountPercent = discountPercent;
    }

    @Override
    public void purchase(int qty, User u){
        if (qty <= getStockCount()){
            reduceStockCount(qty);
            double discountedPrice = applyDiscount(getPrice());
            System.out.println("Purchasing Physical Product: " + getName() + " at price :" + discountedPrice + " by user: " + u.getName());
        }
        
        else {
            System.out.println("Not Enough qty with us!");
        }
    }

}
 