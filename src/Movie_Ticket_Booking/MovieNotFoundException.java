package Movie_Ticket_Booking;

public class MovieNotFoundException extends Exception {
    public MovieNotFoundException(int movieId){
        super("Movie with ID "+movieId+" not found.");
    }
}
