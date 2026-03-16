package Level4.OnlineCoursePlatform;

import java.util.HashMap;

public class VideoCourse extends Course{
    private int totalVideos;
    private HashMap<Student, Double> watchHistory = new HashMap<>();

    public VideoCourse(String courseId, String title, String instructor, double price, int totalVideos) {
        super(courseId, title, instructor, price);
        this.totalVideos = totalVideos;
    }
    
    public void trackProgress(Student s){
        System.out.println("Course: " + getTitle() + " " +  (watchHistory.get(s) / totalVideos) * 100 + " % complete! for student " + s.getName());
    }   

    public void updateProgress(Student s, double hrs){
        watchHistory.put(s, watchHistory.get(s) + hrs);
    }

    public void enroll(Student s){
        watchHistory.put(s, 0.0);
    }

    public void unEnroll(Student s){
        if (!watchHistory.containsKey(s)){
            System.out.println("Student was never part of the course!");
            return;
        }
        
        watchHistory.remove(s);
    }

}

