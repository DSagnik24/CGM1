package Employee_Payroll_System;

public interface PayrollService {

    void addEmployee(Employee employee);
    String creditSalary(int empId)
        throws EmployeeNotFoundException, SalaryAlreadyCreditedException;
    void displayEmployees();
}
