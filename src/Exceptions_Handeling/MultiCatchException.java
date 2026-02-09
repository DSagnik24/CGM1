package Exceptions_Handeling;

public class MultiCatchException {
    public static void main(String[] args) {
         try{
             getInt();
         }catch (NumberFormatException | NullPointerException e){
             System.out.println("Cant convert String to int");
         }
         finally {
             //always executes
             System.out.println("in the finally block");
         }
        System.out.println("END");
    }
    private static void getInt(){
        int a = Integer.parseInt("Nik");

    }
}

