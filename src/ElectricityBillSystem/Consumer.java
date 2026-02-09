package ElectricityBillSystem;

import javax.naming.directory.InvalidSearchControlsException;

abstract class Consumer implements BillingService{
    private int consumerId;
    private String consumerName;
    private String consumerType;
    private int units;
    private double billAmount;

    public Consumer(int consumerId, String consumerName,String consumerType,int units) throws  InvalidSearchControlsException {
        if(getUnits()<=0){
            throw new InvalidMeterReadingException("Invalid meter reading");
        }
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.consumerType = consumerType;
        this.units = units;
    }

    protected int getUnits(){
        return units;
    }
    protected void setBillAmount(double billAmount){
        this.billAmount = billAmount;
    }

    public void printBill(){
        System.out.println("Consumer: " + consumerName);
        System.out.println("Type: " + consumerType);
        System.out.println("Units: " + units);
        System.out.println("Bill: ₹" + billAmount);
        System.out.println("-------------------");
    }
}
