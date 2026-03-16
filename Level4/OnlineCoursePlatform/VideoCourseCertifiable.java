package Level4.OnlineCoursePlatform;

public class VideoCourseCertifiable extends VideoCourse implements Certifiable{

    public VideoCourseCertifiable(String courseId, String title, String instructor, double price, int totalVideos) {
        super(courseId, title, instructor, price, totalVideos);
    }

    @Override
    public void provideCertificate(Student s) {
        System.out.println("Generating certificate for course: " + getTitle() + " with Student Name: " + s.getName());
    }
    
}
