package Level3.LibraryManagementSystem;

public class Magazine extends LibraryItem{
    private String issueNumber;

    Magazine(String title, String id, String issueNumber) {
        super(title, id);
        this.issueNumber = issueNumber;
    }

    @Override
    public void getSummary() {
        System.out.println("Magazine: " + getTitle() + "Issue: " + issueNumber);
    }

}
