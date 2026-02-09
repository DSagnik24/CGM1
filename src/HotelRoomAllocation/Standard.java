package HotelRoomAllocation;

public class Standard extends Booking{
    public Standard(int id, String name, int nights)throws InvalidStayDurationException{
        super(id, name, "Standard", nights);
    }
    @Override
    public void calculateCharges() {
        double charges = getNumberOfNights()*2000;

        if(getNumberOfNights() > 5){
            charges *=0.9;
        }
        setTotalCharges(charges);
    }
}
