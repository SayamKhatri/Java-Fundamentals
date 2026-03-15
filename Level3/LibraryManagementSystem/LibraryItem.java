package Level3.LibraryManagementSystem;

public abstract class LibraryItem {
    private String title;
    private String id;
    private String borrowedBy;

    LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public void checkoutBook(String userName) {
        if (this.borrowedBy != null){
            System.out.println("Already checked out by: " + borrowedBy);
            return;
        }

        this.borrowedBy = userName;
    }

    public void returnBook(String userName) {
        this.borrowedBy = null;
    }

    public abstract void getSummary();

}
