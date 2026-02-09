package Movie_Ticket_Booking;

public class Movie {
    private int movieId;
    private String movieName;
    private int availableSeats;
    private double ticketPrice;

    public Movie(int movieId, String movieName, int availableSeats, double ticketPrice){
        this.movieId = movieId;
        this.movieName = movieName;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
    }
    public int getMovieId(){
        return  movieId;
    }
    public String getMovieName(){
        return  movieName;
    }
    public int getAvailableSeats(){
        return  availableSeats;
    }
    public double getTicketPrice(){
        return ticketPrice;
    }

    public void setMovieId(int movieId){
        this.movieId = movieId;
    }
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }
    public void setTicketPrice(int availableSeats){
        this.availableSeats = availableSeats;
    }

    public String toString(){
        return movieId+" | "+movieName+" | Seats: "+availableSeats+" | Price: "+ticketPrice;
    }
}
