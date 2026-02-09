package HotelRoomAllocation;
import java.util.*;

public class HotelApp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter Booking id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Guest Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Room Type: ");
            String type = sc.nextLine().toUpperCase();

            System.out.println("Enter number of nights: ");
            int nights = sc.nextInt();

            RoomService booking = null;

            switch(type){

                case "STANDARD":
                    booking = new Standard(id, name, nights);
                    break;

                case "DELUXE":
                    booking = new Deluxe(id, name, nights);
                    break;

                case "SUITE":
                    booking = new Suite(id, name, nights);
                    break;

                default:
                    throw new RoomAllocationException("Invalid room type!");
            }

            booking.calculateCharges();

            // Downcasting to access print method
            ((Booking)booking).printDetails();

        }
        catch(InvalidStayDurationException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(RoomAllocationException e){
            System.out.println("Allocation Failed: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
        }
        finally{
            sc.close();
        }
     }
}

