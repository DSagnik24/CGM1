package Movie_Ticket_Booking;

public class Main {
    public static void main(String[] args) {
        BookingService service = new BookingServiceImpl();

        service.addMovie(new Movie(1,"A",1,1000.0 ));

        try {
            System.out.println(service.bookingTicket("S",1));
            System.out.println(service.bookingTicket("S",1));
        } catch (SeatsNotAvailableException | MovieNotFoundException e) {
            System.out.println(e.getMessage());
        }
        service.displayMovie();

    }
}
