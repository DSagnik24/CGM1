package RideFareCalulationOOPS;

public class PremiumRide extends Ride{
    public PremiumRide(int rideId, String customerName, float distance, double fare, double finalFare) {
        super(rideId, customerName, distance, fare, finalFare);
    }
    public void calculateCharge()throws DistanceLimitException{
        if(getDistance() > 50){
            throw  new DistanceLimitException("Distance exceeds allowed limit.");
        }
        double finalFare = 40+(8*getDistance());
        setFinalFare(finalFare);
    }
}
