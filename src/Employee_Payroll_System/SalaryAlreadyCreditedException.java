package Employee_Payroll_System;

public class SalaryAlreadyCreditedException extends Exception{
    public SalaryAlreadyCreditedException(String empName){
        super("Salary already credited for employee "+ empName);
    }
}
