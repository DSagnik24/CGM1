package Movie_Ticket_Booking;

import java.util.ArrayList;
import java.util.HashMap;

public class BookingServiceImpl implements BookingService{
    ArrayList<Movie> movieList = new ArrayList<>();
    HashMap<String, Integer>customerMap =new HashMap<>();

    @Override
    public void addMovie(Movie movie) {

        movieList.add(movie);
    }

    @Override
    public String bookingTicket(String customerName, int movieId)
            throws MovieNotFoundException, SeatsNotAvailableException {

        Movie m = findMovieById(movieId);

        if(m == null){
            throw  new MovieNotFoundException(movieId);
        }
        if(m.getAvailableSeats() ==0){
            throw new SeatsNotAvailableException(m.getMovieName());
        }

        int count = customerMap.getOrDefault(customerName,0);

        if(count ==3){
            return "Customer "+customerName+" has reached booking limit.";
        }
        m.setAvailableSeats(m.getAvailableSeats()-1);
        customerMap.put(customerName,count+1);

        return "Ticket booked for " + customerName + " for movie " + m.getMovieName();
    }

    private Movie findMovieById(int movieId) {

        for (Movie m : movieList){
            if(m.getMovieId() == movieId){
                return m;
            }
        }
        return null;
    }

    @Override
    public void displayMovie() {
        for(Movie m: movieList){
            System.out.println(m);
        }
    }
}
