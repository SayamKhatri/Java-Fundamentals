package Level4.OnlineCoursePlatform;

public class CourseService {
    private static CourseService instance = new CourseService();
    private CourseService(){};

    public static CourseService getInstance(){
        return instance;
    }

    public void enrollStudent(Student s, Course c){
        if (c instanceof LiveCourse lc){
            if (!(lc.getCurrentlyEnrolled() < lc.getMaxSeats())){
                System.out.println("Sorry the course has reached it's maximum capcaity!");
                return;
            }
        }
        s.enrollCourse(c);
        c.enroll(s);
    }

    public void unEnrollStudent(Student s, Course c){
        s.unEnrollCourse(c);
        c.unEnroll(s);
    }

    public void showStudentProgress(Student s, Course c){
        c.trackProgress(s);
    }

    public void updateStudentProgress(Student s, Course c, double hrs){
        ((VideoCourse) c).updateProgress(s, hrs);
    }
}
