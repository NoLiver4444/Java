package prac_4.number_1;

class Square extends GeometricObject implements Colorable {
    private double side;

    // Безаргументный конструктор
    public Square() {
        this(0.0);
    }

    // Конструктор с указанной стороной
    public Square(double side) {
        super();
        this.side = side;
    }

    // Конструктор со всеми параметрами
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    // Getter и Setter для side
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Реализация метода howToColor() из интерфейса Colorable
    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }

    // Реализация абстрактных методов GeometricObject
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square: side = " + side + ", " + super.toString();
    }
}