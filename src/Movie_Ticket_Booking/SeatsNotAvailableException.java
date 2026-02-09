package Movie_Ticket_Booking;

public class SeatsNotAvailableException extends Exception {
    public SeatsNotAvailableException(String movieName){
        super("No seats available for movie "+movieName);
    }
}
