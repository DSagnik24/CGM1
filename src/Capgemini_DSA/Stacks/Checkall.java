package Capgemini_DSA.Stacks;

import java.util.Stack;

public class Checkall {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        if(st.isEmpty()){
            System.out.println("Stack Empty");
        }else{
            while (!st.isEmpty()){
                System.out.println(st.pop());
            }
        }

    }
}
