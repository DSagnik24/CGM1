package EmployeeBonusCalculationSystem;

interface Employee {
    double calculateBonus();
}
class PermanentEmployee implements Employee{
    double salary;

    PermanentEmployee(double salary){
        this.salary=salary;
    }
    @Override
    public double calculateBonus() {
        return 0.1*salary;
    }
}
class ContractEmployee implements Employee{
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(double hourlyRate, int hoursWorked){
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateBonus() {
        return 0.05*(hourlyRate * hoursWorked);
    }
}

class SeniorPermanentEmployee extends PermanentEmployee{

    SeniorPermanentEmployee(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus(){
        return 0.2*salary;
    }
}
