package DeliveryChargeSystem;


import HotelRoomAllocation.InvalidStayDurationException;

public class Model {
    private int packageId;
    private String senderName;
    private double distance;
    private double weight;
    private double deliveryCharge;

    public Model(int packageId, String senderName, double distance, double weight) throws InvalidStayDurationException {
        if(distance <= 0||weight<=0){
            throw new InvalidStayDurationException("Invalid Package details");
        }
        this.packageId = packageId;
        this.senderName = senderName;
        this.distance = distance;
        this.weight = weight;
    }

    public double getDistance(){
        return distance;
    }
    public double getWeight(){
        return weight;
    }
   protected void setDeliveryCharge(double charge){
        this.deliveryCharge = charge;
   }
   public void printDetails(){
       System.out.println("Charge: "+deliveryCharge);
   }

}
