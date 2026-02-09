package ElectricityBillSystem;

import javax.naming.directory.InvalidSearchControlsException;

public class DomesticConsumer extends Consumer{

    public DomesticConsumer(int consumerId, String consumerName, String consumerType, int units) throws LoadExceededException, InvalidSearchControlsException {
        super(consumerId, consumerName, consumerType, units);
    }

    @Override
    public void calculations() throws LoadExceededException {
        if(getUnits() >500){
            throw new LoadExceededException("Domestic load Exceeded");
        }
        double bill;

        if(getUnits() < 100){
            bill = 3*getUnits();
        }else{
            bill = (100*3)+ ((getUnits() - 100)*6);
        }
        setBillAmount(bill);
    }
}
