package DeliveryChargeSystem;

import HotelRoomAllocation.InvalidStayDurationException;

public class ExpressDelivery extends Model{
    public ExpressDelivery(int packageId, String senderName, double distance, double weight) throws InvalidStayDurationException {
        super(packageId, senderName, distance, weight);
    }

    public void calculateCharge()throws  OverWeightException{
        if(getWeight() > 10){
            throw new OverWeightException("Weight limit exceeded");
        }
        double charge = 100+(15*getDistance());
        setDeliveryCharge(charge);
    }
}
