package Capgemini_DSA.Stacks;

public class StackUsingArray {

    static int top = -1;
    static int SIZE = 100;
    int[]stack;

    public static void main(String[] args) {
        int[] arr = new int[SIZE];

        push(arr, 1);
        push(arr, 2);
        push(arr, 3);

        System.out.println(pop(arr));
        System.out.println(pop(arr));
        System.out.println(pop(arr));

        push(arr, 5);
        System.out.println(peek(arr));
    }

    static void push(int[] arr, int value) {
        if (top == SIZE - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    static int pop(int[] arr) {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    static int peek(int[]arr){
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }
}
