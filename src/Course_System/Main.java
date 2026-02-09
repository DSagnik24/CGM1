package Course_System;

public class Main {
    public static void main(String[] args) {

        EnrollmentService service = new EnrollmentServiceImpl();

        service.addCourse(new Course(101,"Java",2));
        service.addCourse(new Course(102,"Python",1));
        service.addCourse(new Course(103,"Cloud",0));

        try{
            System.out.println(service.enrollStudent("Alice",101));
            System.out.println(service.enrollStudent("Alice",102));
            System.out.println(service.enrollStudent("Alice",101));
            System.out.println(service.enrollStudent("Bob",103));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Available Courses: ");
        service.displayCourses();
    }
}
