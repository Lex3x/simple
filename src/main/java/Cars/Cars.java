package Cars;

/**
 * Created by PK on 14.05.2017.
 */
public class Cars {
     protected String mark;
     protected String cost;
     protected String color;

    public Cars(String mark, String cost, String color) {
        this.mark = mark;
        this.cost = cost;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "mark='" + mark + '\'' +
                ", cost='" + cost + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
