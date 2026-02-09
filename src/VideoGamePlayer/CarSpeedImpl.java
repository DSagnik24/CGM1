package VideoGamePlayer;

public class CarSpeedImpl {
    public String setCarSpeed(CarSpeed sp, int spd){
        try{
            if(spd<30 || spd>90){
                throw new SpeedInvalidException("Exception in Speed Validation");
            }
            sp.speed = "valid";
        }catch(SpeedInvalidException e){
            sp.speed = e.getMessage();
        }
        return sp.speed;
    }

}
