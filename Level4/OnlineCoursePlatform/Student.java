package Level4.OnlineCoursePlatform;

import java.util.HashSet;

public class Student {
    private String name;
    private String id;
    private HashSet<Course> coursesEnrolled = new HashSet<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void enrollCourse(Course c){
        if (coursesEnrolled.contains(c)){
            System.out.println("Student: " + name + " already enrolled in the course!");
            return;
        }

        coursesEnrolled.add(c);
        System.out.println("Student: " + name + " Enrolled Successfully! in course: " + c.getTitle());
    }

    public void unEnrollCourse(Course c){
        if(!coursesEnrolled.remove(c)){
            System.out.println("Student was never Enrolled!");
        }
    }

    public String getName() {
        return name;
    }

}
