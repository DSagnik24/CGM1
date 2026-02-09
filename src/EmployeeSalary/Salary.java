package EmployeeSalary;

import java.util.HashMap;

public class Salary {
    HashMap<String,Integer> empList = new HashMap<>();

    public int totalSalary(){
        int totalSalary = 0;
        for(int i:empList.values()) {
            totalSalary += i;
        }
        return totalSalary;
    }
    public String getSalary(String designation){
        if(empList.containsKey(designation))
            return "Salary is "+empList.get(designation);
        else
            return "No designation match";
    }
    public void updateSalary(String designation, int newSalary){
        empList.put(designation,newSalary);

    }
}
