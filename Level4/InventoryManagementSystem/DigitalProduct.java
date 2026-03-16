package Level4.InventoryManagementSystem;

public class DigitalProduct extends Product{
    private double fileSize;
    private int downloadLimit;

    public DigitalProduct(String productId, String name, double price, double fileSize, int downloadLimit) {
        super(productId, name, price);
        this.fileSize = fileSize;
        this.downloadLimit = downloadLimit;
    }

    public int getDownloadLimit() {
        return downloadLimit;
    }

    @Override
    public void purchase(int qty, User u) {
        if (qty <= downloadLimit) {
            downloadLimit -= qty;
            System.out.println("Purchasing Digital Product: " + getName() + " at price :" + getPrice() + " by user: " + u.getName());
        }

        else {
            System.out.println("Not Enough download limit!");
        }

    }
    
}
