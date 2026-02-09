package Try;

class ParentH {
    static void display() {
        System.out.print("Parent");
    }
}

class ChildH extends ParentH {
    static void display() {
        System.out.print("Child");
    }
}

public class Q51_MethodHiding {
    public static void main(String[] args) {
        ParentH p = new ChildH();
        p.display();
    }
}
