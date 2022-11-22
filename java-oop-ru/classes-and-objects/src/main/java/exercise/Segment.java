package exercise;

import exercise.Point;

// BEGIN
public class Segment {
    Point beginPoint;
    Point endPoint;

    Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getMidPoint() {
        return new Point((this.beginPoint.getX() + this.endPoint.getX()) / 2, (this.beginPoint.getY() + this.endPoint.getY()) / 2);
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Point beginPoint) {
        this.beginPoint = beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}
// END
