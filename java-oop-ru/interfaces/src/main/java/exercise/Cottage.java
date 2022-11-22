package exercise;

// BEGIN
public class Cottage implements Home {
    private Double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public int compareTo(Home another) {
        return area.compareTo(another.getArea());
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + String.format("%.1f", area).replace(',', '.') + " метров";
    }
}
// END
