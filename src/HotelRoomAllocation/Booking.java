package HotelRoomAllocation;

abstract class Booking implements RoomService{
    private int bookingId;
    private String guestName;
    private String RoomType;
    private int numberOfNights;
    private double totalCharges;

    public Booking(int bookingId, String guestName,String type, int numberOfNights)throws InvalidStayDurationException{
        if(numberOfNights <= 0){
            throw new InvalidStayDurationException("Invalid stay");
        }

        this.bookingId = bookingId;
        this.guestName = guestName;
        this.RoomType = type;
        this.numberOfNights = numberOfNights;
    }
    public int getNumberOfNights(){
        return numberOfNights;
    }
    public void setTotalCharges(double totalCharges){
        this.totalCharges = totalCharges;
    }
    public void printDetails(){
        System.out.println("Total Charges: "+totalCharges);
    }

}
