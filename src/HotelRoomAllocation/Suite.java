package HotelRoomAllocation;

public class Suite extends Booking{
    public Suite(int id,String name,int nights )throws InvalidStayDurationException{
        super(id,name,"Suite",nights);
    }
    public void calculateCharges(){
        double charges = getNumberOfNights()*7000;

        if(getNumberOfNights() > 5){
            charges *= 0.9;
        }
        setTotalCharges(charges);
    }
}
