class EMployeeAccessandPayroll {
   int EMployeeId;
    String Name;
    private double Salary;
    String role;

    public EMployeeAccessandPayroll(int EMployeeId, String Name, double Salary, String role) {
        this.EMployeeId = EMployeeId;
        this.Name = Name;
        this.Salary = Salary;
        this.role = role;
    }

    public double getSalary() {
        return Salary;
    }
    public double setSalary(double newSalary){
        this.Salary = newSalary;
        return Salary;
    }

    


}




