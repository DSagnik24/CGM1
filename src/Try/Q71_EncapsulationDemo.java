package Try;

class Encapsulated {
    private int data = 10;

    public int getData() {
        return data;
    }
}

public class Q71_EncapsulationDemo {
    public static void main(String[] args) {
        Encapsulated obj = new Encapsulated();
        System.out.println(obj.getData());
    }
}
