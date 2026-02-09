package RideFareCalulationOOPS;

public class Ride {
    private int rideId;
    private String customerName;
    private float distance;
    private double fare;
    private double finalFare;

    public Ride(int rideId, String customerName, float distance,
                double fare,double finalFare) {
        this.rideId = rideId;
        this.customerName = customerName;
        this.distance = distance;
        this.fare = fare;
        this.finalFare = finalFare;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public float getDistance(){
        return distance;
    }

    public void setFinalFare(double finalFare) {
        this.finalFare = finalFare;
    }
}
