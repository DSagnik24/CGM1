package Capgemini_DSA.Stacks;

import java.util.Stack;

public class PostFixPrefixConversion {

    public static void main(String[] args) {
        String s = "52 12 * 10 +";
        Stack<Integer> stack = new Stack<>();
        String[]arr = s.split(" ");

        for (String c:arr){
            if(c.matches("-?\\d+")){
                stack.push(Integer.parseInt(c));
            }
                else {
                int b = stack.pop();
                int a = stack.pop();

                switch (c) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }

        System.out.println("Output: " + stack.peek());
    }
}
