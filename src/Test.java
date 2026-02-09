public class Test {
    public static void main(String[] args) {
        Student s = new Student(); // new object is created and memory is allocated
        // s stores reference variable of the new object memory in heap

        String x = "Ram";
        String a = new String("Ram");
        String b = new String("Ram");
        String c = "Ram";
        String d = "Ram";

        System.out.println(a == d);// different memory locations
        System.out.println(c == d);// same memory locations
    }
}
