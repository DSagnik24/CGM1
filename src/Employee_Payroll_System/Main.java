package Employee_Payroll_System;

public class Main {
    public static void main(String[] args) {

        PayrollService service = new PayrollServiceImpl();

        service.addEmployee(new Employee(101,"S",100000));
        service.addEmployee(new Employee(102,"A",200000));
        service.addEmployee(new Employee(103,"B",300000));


        try{
            System.out.println(service.creditSalary(101));
            System.out.println(service.creditSalary(102));
            System.out.println(service.creditSalary(103));
            System.out.println(service.creditSalary(101));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        service.displayEmployees();

    }
}
