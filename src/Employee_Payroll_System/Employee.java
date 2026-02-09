package Employee_Payroll_System;

public class Employee {
    private int empId;
    private String empName;
    private double basicSalary;

    public Employee(int empId, String empName, double basicSalary){
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }
    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public double getBasicSalary(){
        return basicSalary;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public void setBasicSalary(double BasicSalary){
        this.basicSalary = basicSalary;
    }
    public String toString(){
        return empId +" | "+empName+" | "+"Basic Salary: " + basicSalary;
    }
}
