package Encapsulation;
//Bundling of data and data hiding
public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();

        car.setPrice(1000);
        car.setCompany("Audi");
        car.setModel("Hot Wheels");

        System.out.println(car.getCompany());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
    }
}
