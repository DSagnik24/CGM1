package Employee_Payroll_System;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(int id){
        super("Employee with empId "+ id+ " not found");
    }
}

