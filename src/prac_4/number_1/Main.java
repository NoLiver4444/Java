package prac_4.number_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            // Часть 1-3: Тестирование треугольника
            System.out.println("=== Ввод данных для треугольника ===");
            System.out.print("Введите сторону 1: ");
            double side1 = input.nextDouble();

            System.out.print("Введите сторону 2: ");
            double side2 = input.nextDouble();

            System.out.print("Введите сторону 3: ");
            double side3 = input.nextDouble();

            System.out.print("Введите цвет: ");
            String color = input.next();

            System.out.print("Закрашен (true/false): ");
            boolean filled = input.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3, color, filled);

            System.out.println("\n=== Информация о треугольнике ===");
            System.out.println("Полное описание: " + triangle.toString());
        } catch (IllegalTriangleException e) {
            System.out.println("\nОшибка: " + e.getMessage());
            System.out.println("Правило треугольника: сумма любых двух сторон должна быть больше третьей стороны");
            System.out.println("и все стороны должны быть положительными числами.");
        } catch (Exception e) {
            System.out.println("\nОшибка ввода: " + e.getMessage());
        }

        // Часть 4-5: Тестирование метода max()
        System.out.println("\n=== Тестирование метода max() ===");

        // Создаем два круга
        Circle circle1 = new Circle(5.0, "red", true);
        Circle circle2 = new Circle(7.0, "blue", false);

        GeometricObject maxCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Круг 1: " + circle1);
        System.out.println("Круг 2: " + circle2);
        System.out.println("Наибольший круг: " + maxCircle);

        // Создаем два прямоугольника
        Rectangle rect1 = new Rectangle(4.0, 6.0, "green", true);
        Rectangle rect2 = new Rectangle(3.0, 8.0, "yellow", false);

        GeometricObject maxRect = GeometricObject.max(rect1, rect2);
        System.out.println("\nПрямоугольник 1: " + rect1);
        System.out.println("Прямоугольник 2: " + rect2);
        System.out.println("Наибольший прямоугольник: " + maxRect);

        // Часть 6: Тестирование ComparableCircle
        System.out.println("\n=== Тестирование ComparableCircle ===");

        ComparableCircle compCircle1 = new ComparableCircle(6.0, "purple", true);
        ComparableCircle compCircle2 = new ComparableCircle(8.0, "orange", false);

        // Сравнение двух кругов с помощью compareTo()
        int result1 = compCircle1.compareTo(compCircle2);
        System.out.println("ComparableCircle 1: " + compCircle1);
        System.out.println("ComparableCircle 2: " + compCircle2);

        if (result1 > 0) {
            System.out.println("Первый круг больше второго");
        } else if (result1 < 0) {
            System.out.println("Второй круг больше первого");
        } else {
            System.out.println("Круги равны по площади");
        }

        // Сравнение круга и прямоугольника
        Rectangle rectangle = new Rectangle(5.0, 10.0, "black", true);
        int result2 = compCircle1.compareTo(rectangle);

        System.out.println("\nComparableCircle: " + compCircle1);
        System.out.println("Rectangle: " + rectangle);

        if (result2 > 0) {
            System.out.println("Круг больше прямоугольника");
        } else if (result2 < 0) {
            System.out.println("Прямоугольник больше круга");
        } else {
            System.out.println("Круг и прямоугольник равны по площади");
        }


        System.out.println("\n\n\n\n\n\n\n");


        GeometricObject[] objects = new GeometricObject[5];

        objects[0] = new Square(5.0, "red", true);
        objects[1] = new Circle(3.0, "blue", false);
        objects[2] = new Rectangle(4.0, 6.0, "green", true);
        objects[3] = new Square(7.0, "yellow", false);
        objects[4] = new Circle(2.5, "purple", true);

        // Обрабатываем каждый объект в массиве
        System.out.println("=== Обработка массива GeometricObject ===");
        for (int i = 0; i < objects.length; i++) {
            System.out.println("\nОбъект " + (i + 1) + ": " + objects[i]);
            System.out.println("Площадь: " + String.format("%.2f", objects[i].getArea()));

            // Проверяем, можно ли раскрасить объект
            if (objects[i] instanceof Colorable) {
                System.out.print("Инструкция по раскрашиванию: ");
                Colorable colorable = (Colorable) objects[i];
                colorable.howToColor();
            } else {
                System.out.println("Этот объект нельзя раскрасить");
            }
        }

        // Дополнительная демонстрация работы Square
        System.out.println("\n=== Дополнительная демонстрация Square ===");
        Square square1 = new Square(); // безаргументный конструктор
        square1.setSide(10.0);
        square1.setColor("orange");
        square1.setFilled(true);

        System.out.println("Square 1: " + square1);
        System.out.println("Площадь: " + square1.getArea());
        System.out.println("Периметр: " + square1.getPerimeter());
        System.out.print("Инструкция по раскрашиванию: ");
        square1.howToColor();

        Square square2 = new Square(8.0, "pink", false); // конструктор с параметрами
        System.out.println("\nSquare 2: " + square2);
        System.out.print("Инструкция по раскрашиванию: ");
        square2.howToColor();
    }
}
