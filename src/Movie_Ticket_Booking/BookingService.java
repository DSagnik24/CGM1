package Movie_Ticket_Booking;

public interface BookingService {
    void addMovie(Movie movie);
    String bookingTicket(String customerName, int movieId)
        throws  MovieNotFoundException, SeatsNotAvailableException;
    void displayMovie();
}
