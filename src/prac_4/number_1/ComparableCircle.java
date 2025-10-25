package prac_4.number_1;

public class ComparableCircle extends Circle implements Comparable<GeometricObject> {
    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    // Реализация compareTo (уже наследуется от GeometricObject, но можно переопределить)
    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
