package Try;
class TestException {
    TestException() throws Exception {
        throw new Exception("Error");
    }
}

public class Q54_ExceptionConstructor {
    public static void main(String[] args) {
        try {
            new TestException();
            System.out.print("No Exception");
        } catch (Exception e) {
            System.out.print("Exception");
        }
    }
}