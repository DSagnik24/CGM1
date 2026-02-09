package Try;

class Base {
    Base() {
        System.out.print("Base ");
    }
}

class Derived extends Base {
    Derived() {
        System.out.print("Derived");
    }
}

public class Q47_ConstructorChain {
    public static void main(String[] args) {
        new Derived();
    }
}
