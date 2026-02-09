package Employee_Payroll_System;

import java.util.ArrayList;
import java.util.HashSet;

public class PayrollServiceImpl implements PayrollService{

    private ArrayList<Employee>EmployeeData = new ArrayList<>();
    private HashSet<Integer>SalaryData = new HashSet<>();

    @Override
    public void addEmployee(Employee employee) {
        EmployeeData.add(employee);
    }

    @Override
    public String creditSalary(int empId) throws EmployeeNotFoundException, SalaryAlreadyCreditedException {
        Employee emp = findEmployeeById(empId);

        if(emp == null){
            throw new EmployeeNotFoundException(empId);
        }
        if(SalaryData.contains(empId)){
            throw new SalaryAlreadyCreditedException(emp.getEmpName());
        }
        SalaryData.add(empId);
        return "Salary credited to "+emp.getEmpName();

    }

    private Employee findEmployeeById(int empId) {
        for(Employee e: EmployeeData){
            if(e.getEmpId() == empId){
                return e;
            }
        }
        return null;
    }

    @Override
    public void displayEmployees() {
        for(Employee ep:EmployeeData){
            System.out.println(ep);
        }
    }
}
