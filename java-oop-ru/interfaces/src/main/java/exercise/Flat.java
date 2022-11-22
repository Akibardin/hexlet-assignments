package exercise;

import exercise.Home;
// BEGIN
public class Flat implements Home{
    private Double area;
    private Double balconyArea;
    private int floor;

    public Flat (double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + String.format("%.1f", area + balconyArea).replace(',', '.') + " метров на " + floor + " этаже";
    }

    @Override
    public int compareTo(Home another) {
        return area.compareTo(another.getArea());
    }

    @Override
    public double getArea() {
        return area;
    }
}
// END
