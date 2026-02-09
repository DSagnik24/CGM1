package Capgemini_DSA.Queues;

public class QueuesUsingArray {

    static int SIZE = 100;
    static int front = 0;
    static int rear = -1;

    public static void main(String[] args) {
        int[] queue = new int[SIZE];

        enqueue(queue, 10);
        enqueue(queue, 20);
        enqueue(queue, 30);

        System.out.println(dequeue(queue)); // 10
        System.out.println(dequeue(queue)); // 20
    }

    static void enqueue(int[] queue, int value) {
        if (rear == SIZE - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = value;
    }

    static int dequeue(int[] queue) {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }
}
