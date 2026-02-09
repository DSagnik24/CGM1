package NumericOperations_OOPS;

import java.util.ArrayList;

public class Source {
    public int sum(ArrayList<Integer> numbers){
        int totalSum = 0;
        for(int i:numbers){
            totalSum += i;
        }
        return totalSum;
    }
    public ArrayList<Integer> splitAndReverse(ArrayList<Integer>list){
        ArrayList<Integer> res = new ArrayList<>();

        int mid = (list.size()+1)/2;

        for(int i=mid-1;i>=0;i--){
            res.add(list.get(i));
        }
        for(int i=list.size()-1;i>=mid;i--){
            res.add(list.get(i));
        }
        return res;
    }
    public Integer getItemIndex(ArrayList<Integer> numbers,int index){
       if(index >= 0 && index <numbers.size()){
           return numbers.get(index);
       }
        return null;
    }
}
