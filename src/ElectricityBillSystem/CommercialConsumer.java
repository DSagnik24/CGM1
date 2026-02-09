package ElectricityBillSystem;

import javax.naming.directory.InvalidSearchControlsException;

public class CommercialConsumer extends Consumer{

    public CommercialConsumer(int id, String name, int units) throws LoadExceededException, InvalidSearchControlsException {
        super(id,name,"Commercial",units);
    }
    @Override
    public void calculations() throws LoadExceededException {
        if(getUnits() > 1000){
            throw new LoadExceededException("Commercial Limit Exceeded");
        }
        double bill = getUnits()*8;
        setBillAmount(bill);
    }
}
