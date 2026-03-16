package Level4.OnlineCoursePlatform;

public class LiveCourseCertifiable extends LiveCourse implements Certifiable{

    public LiveCourseCertifiable(String courseId, String title, String instructor, double price, String scheduledDate,
            int maxSeats) {
        super(courseId, title, instructor, price, scheduledDate, maxSeats);
    }

    @Override
    public void provideCertificate(Student s) {
        System.out.println("Generating certificate for course: " + getTitle() + " with Student Name: " + s.getName());
    }
    
}
