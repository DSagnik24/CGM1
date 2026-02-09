package DeliveryChargeSystem;

import HotelRoomAllocation.InvalidStayDurationException;

public class StandardDelivery extends Model{
    public StandardDelivery(int id, String sender, double distance, double weight) throws InvalidStayDurationException {
        super(id,sender,distance,weight);
    }

    public void calculateCharge()throws  OverWeightException{
        if(getWeight()>20){
            throw new OverWeightException("Weight Limit Exceeded");
        }
        double charge = 50+(10*getDistance());
        setDeliveryCharge(charge);
    }
}
