package Level3.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryItem i1 = new Book("Machine Learning", "1", "Chip Huyein");
        LibraryItem i2 = new Book("AI", "2", "Sayam");
        LibraryItem i3 = new Magazine("Improve health", "3", "AXE3411");

        LibraryItem[] items = {i1, i2, i3};
        for (LibraryItem libraryItem : items) {
            libraryItem.getSummary();
        }

        i1.checkoutBook("Dinky");
        i1.checkoutBook("Sayam");

        i2.checkoutBook("Sayam");
        i2.returnBook("Sayam");
        i2.checkoutBook("Dinky");


    }
}
