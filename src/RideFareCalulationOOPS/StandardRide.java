package RideFareCalulationOOPS;

public class StandardRide extends Ride{
    public StandardRide(int rideId, String customerName, float distance, double fare, double finalFare) {
        super(rideId, customerName, distance, fare, finalFare);
    }

    public void calculateCharge()throws  DistanceLimitException{
        if (getDistance() > 100) {
            throw new DistanceLimitException("Distance exceeds allowed limit.");
        }
        double finalFare = 80+(12*getDistance());
        setFinalFare(finalFare);
    }
}
