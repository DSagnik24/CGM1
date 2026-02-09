package OfferOnBrandsOops;

import java.util.List;
import java.util.stream.Collectors;

public class Implementation {
    public List<String > getModelName(List<Model>list){
        return list.stream().map(m->m.getModelName()).collect(Collectors.toList());
    }
    public Model getModelInfo(List<Model>list,String model,int carSpeed){
        return list.stream().filter(m->m.getModelName() == model && m.getCarSpeed() == carSpeed).findAny().get();
    }
}
