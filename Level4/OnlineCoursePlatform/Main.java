package Level4.OnlineCoursePlatform;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sam", "1");
        Course c1 = new VideoCourse("C1", "ML", "ANdrew", 100, 5);
        Course c2 = new LiveCourse("C2", "AI", "Chip", 1000, "30march2026", 1);
        Course c3 = new VideoCourseCertifiable("C3", "Data", "Sayam", 10, 10);

        CourseService service = CourseService.getInstance();
        service.enrollStudent(s1, c1);
        service.enrollStudent(s1, c2);
        service.enrollStudent(s1, c3);

        Student s2 = new Student("Dinky", "2");
        service.enrollStudent(s2, c2);
        service.updateStudentProgress(s1, c1, 2);
        service.showStudentProgress(s1, c1);

    }
}
