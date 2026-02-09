package Capgemini_DSA.Stacks;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        try {
            s.push(1);
            s.push(2);
            s.push(3);

            System.out.println(s);
            int a = s.pop();

            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        } catch (EmptyStackException e) {
            throw new RuntimeException("Stack Underflow");
        }finally {
            s.push(1234);
            System.out.println(s);
        }
    }
}
