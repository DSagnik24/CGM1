package AppliancePowerConsumptionSystem;

public interface Appliance {
    double getPowerConsumption();
}

class Fan implements Appliance{
    double wattage;
    double hoursUsed;

    Fan(double wattage, double hoursUsed){
        this.wattage = wattage;
        this.hoursUsed = hoursUsed;
    }
    @Override
    public double getPowerConsumption(){
        return (wattage*hoursUsed)/1000;
    }
}
class AC implements Appliance{
    double ton;
    double hoursUsed;


    AC(double ton, double hoursUsed){
        this.ton = ton;
        this.hoursUsed = hoursUsed;
    }

    @Override
    public double getPowerConsumption() {
        return (ton*1200*hoursUsed)/1000;
    }
}

class SmartAc extends AC{
    boolean ecoMode;

    SmartAc(double ton, double hoursUsed, boolean ecoMode){
        super(ton, hoursUsed);
        this.ecoMode = ecoMode;
    }

    public double CheckConsumption(boolean ecoMode) {
        double power = super.getPowerConsumption();
        if(ecoMode){
            power = power*0.8;
        }
        return power;
    }
}
