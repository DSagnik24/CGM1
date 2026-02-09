package Course_System;

public class Course {
    private int courseId;
    private String courseName;
    private int availableSeats;

    public Course(int courseId, String courseName, int availableSeats){
        this.courseId = courseId;
        this.courseName = courseName;
        this.availableSeats = availableSeats;
    }
    public int getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getAvailableSeats(){
        return  availableSeats;
    }
    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }
    @Override
    public String toString(){
        return courseId + " | " + courseName +
                " | Available Seats: "+ availableSeats;
    }
}
