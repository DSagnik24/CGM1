package Course_System;

interface EnrollmentService {
    void addCourse(Course course);
    String enrollStudent(String studentName,int courseId)
        throws CourseFullException,CourseNotFoundException;
    void displayCourses();
}
