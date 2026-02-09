package Capgemini_DSA.Stacks;

import java.util.Stack;

public class ReduceString {
    public static void main(String[] args) {
        String s = "aaabbcccdd";
        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        if(st.isEmpty()){
            System.out.println("EMpty String");
        }

        System.out.println(st);
    }
}
