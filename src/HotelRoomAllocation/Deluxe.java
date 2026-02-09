package HotelRoomAllocation;

public class Deluxe extends Booking{
    public Deluxe(int id, String name, int nights)throws InvalidStayDurationException{
        super(id,name,"Deluxe",nights);
    }

    public void calculateCharges(){
        double charges = getNumberOfNights() * 4000;

        if(getNumberOfNights()>5){
            charges *= 0.9;
        }
        setTotalCharges(charges);
    }
}
