package Exceptions_Handeling;

public class Main {


    public static void main(String[] args) {
        try{
            int myInt = Integer.parseInt("Sagnik");
        }catch (NumberFormatException e){
            System.out.println("You cant convert String to int "+ e);
        }
        System.out.println("END");
    }
//    public static void main(String[] args) {
//        int[]num = {100,20,30,40};
//        int[]den = {1,2,0,4};
//
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(div(num[i],den[i]));
//        }
//    }
//
//    public static int div(int a,int b){
//        try{
//            return a/b;
//        }catch(ArithmeticException e){
//            System.out.println(e);
//            return -1;
//        }
//    }
}
