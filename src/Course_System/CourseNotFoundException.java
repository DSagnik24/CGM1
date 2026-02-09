package Course_System;

class CourseNotFoundException extends Exception{
    public CourseNotFoundException(int id){
        super("Course with Id: "+id+" not found");
    }
}
class CourseFullException extends Exception{
    public CourseFullException (String name){
        super("Course: "+ name + " is full");
    }
}
