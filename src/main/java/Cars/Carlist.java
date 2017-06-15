package Cars;

import java.util.*;

/**
 * Created by PK on 14.05.2017.
 */
public class Carlist {
    public static List<Cars> getCarList(){
        List<Cars> cars=new ArrayList<Cars>();
        cars.add(new MersedesCar("e150","5000","Black",true));
        cars.add(new ToyotaCar("prius","1000","Blue",true));
        cars.add(new MersedesCar("s500","3000","Green",true));
        cars.add(new ToyotaCar("yaris","500","Black",true));
        return cars;
    }

}