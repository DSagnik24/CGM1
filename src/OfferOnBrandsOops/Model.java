package OfferOnBrandsOops;

public class Model {
    private String modelName;
    private int carSpeed;

    public Model(String modelName, int carSpeed){
        this.modelName = modelName;
        this.carSpeed = carSpeed;
    }

    public String getModelName(){
        return  modelName;
    }

    public int getCarSpeed(){
        return carSpeed;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }
}
