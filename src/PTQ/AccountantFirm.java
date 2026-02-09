package PTQ;

public class AccountantFirm implements Company{
    private int[]income;
    AccountantFirm(int n){
        income = new int[n];
    }

    @Override
    public void assignSalaries(int[] salaries) {
        int length = Math.min(salaries.length,income.length);
        for(int i=0;i<length;i++){
            income[i] = salaries[i];
        }
        System.out.println("Incomes of Accountant credited");
    }

    @Override
    public void averageSalary() {
        double sum = 0;
        for(int i:income){
            sum+=i;
        }
        double avg = sum/income.length;
        System.out.println("Average salary of Accountant: "+avg);
    }

    @Override
    public void maxSalary() {
        int max = income[0];
        for(int val: income){
            if(val>max){
                max = val;
            }
        }
        System.out.println("Max salary "+max);
    }

    @Override
    public void minSalary() {
        int min = income[0];
        for(int val : income){
            if(val<min){
                min = val;
            }
        }
        System.out.println("Min salary "+min);
    }
}
