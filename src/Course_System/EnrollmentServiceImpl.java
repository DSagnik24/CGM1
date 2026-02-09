package Course_System;

import java.util.ArrayList;
import java.util.HashMap;

public class EnrollmentServiceImpl  implements EnrollmentService{

    private ArrayList<Course> courses = new ArrayList<>();
    private HashMap<String, Integer> studentEnrollCount = new HashMap<>();

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String enrollStudent(String studentName, int courseId) throws CourseFullException, CourseNotFoundException {
       Course course = findCourseById(courseId);

       if(course == null){
           throw new CourseNotFoundException(courseId);
       }
       if(course.getAvailableSeats() == 0){
           throw new CourseFullException(course.getCourseName());
       }

       int count = studentEnrollCount.getOrDefault(studentName,0);

       if(count ==2 ){
           return "Student "+ studentName +
                   " has reached maximum enrollment limit";
       }
       course.setAvailableSeats(course.getAvailableSeats() - 1);
       studentEnrollCount.put(studentName, count +1);

       return "Student "+ studentName + " enrolled in "+course.getCourseName();
    }

    @Override
    public void displayCourses() {
        for (Course c:courses){
                System.out.println(c);
        }
    }

    private Course findCourseById(int id){
        for(Course c: courses){
            if(c.getCourseId() == id){
                return c;
            }
        }
        return null;
    }
}
