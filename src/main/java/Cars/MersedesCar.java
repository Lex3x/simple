package Cars;

import Cars.Cars;

/**
 * Created by PK on 14.05.2017.
 */
public class MersedesCar extends Cars {
    protected Boolean climateControl;

    public MersedesCar(String mark, String cost, String color, Boolean climateControl) {
        super(mark, cost, color);
        this.climateControl = climateControl;
    }

    @Override
    public String toString() {
        return "MersedesCar{" +
                "mark='" + mark + '\'' +
                ", cost='" + cost + '\'' +
                ", climateControl=" + climateControl +
                ", color='" + color + '\'' +
                '}';
    }
}
