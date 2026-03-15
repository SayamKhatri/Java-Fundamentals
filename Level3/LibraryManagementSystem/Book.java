package Level3.LibraryManagementSystem;

public class Book extends LibraryItem { 
    private String author;

    Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public void getSummary() {
        System.out.println("Book: " + getTitle() + " by: " + author);
    }
    
}
