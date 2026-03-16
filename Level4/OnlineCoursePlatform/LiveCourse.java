package Level4.OnlineCoursePlatform;

public class LiveCourse extends Course{
    private String scheduledDate;
    private int maxSeats;
    private int currentlyEnrolled;

    public LiveCourse(String courseId, String title, String instructor, double price, String scheduledDate,
                      int maxSeats) {
        super(courseId, title, instructor, price);
        this.scheduledDate = scheduledDate;
        this.maxSeats = maxSeats;
    }

    public void trackProgress(Student s){
        System.out.println("Class is Scheduled at: " + scheduledDate);
    }

    public int getCurrentlyEnrolled() {
        return currentlyEnrolled;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void enroll(Student s){
        this.currentlyEnrolled += 1;
    }

    public void unEnroll(Student s){
        this.currentlyEnrolled -= 1;
    }
}
