package Level4.OnlineCoursePlatform;

public abstract class Course {
    private String courseId;
    private String title; 
    private String instructor;
    private double price;

    protected String getTitle() {
        return title;
    }

    public Course(String courseId, String title, String instructor, double price) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
        this.price = price;
    }

    public abstract void trackProgress(Student s);
    public abstract void enroll(Student s);
    public abstract void unEnroll(Student s);

}
