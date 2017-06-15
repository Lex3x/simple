package Cars;

import Cars.Cars;

/**
 * Created by PK on 14.05.2017.
 */
public class ToyotaCar extends Cars {
    protected Boolean heating;

    public ToyotaCar(String mark, String cost, String color, Boolean heating) {
        super(mark, cost, color);
        this.heating = heating;
    }

    @Override
    public String toString() {
        return "ToyotaCar{" +
                "mark='" + mark + '\'' +
                ", cost='" + cost + '\'' +
                ", heating=" + heating +
                ", color='" + color + '\'' +
                '}';
    }
}
