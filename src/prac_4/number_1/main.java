package prac_4.number_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Запрос данных у пользователя
        System.out.print("Введите сторону 1 треугольника: ");
        double side1 = input.nextDouble();

        System.out.print("Введите сторону 2 треугольника: ");
        double side2 = input.nextDouble();

        System.out.print("Введите сторону 3 треугольника: ");
        double side3 = input.nextDouble();

        System.out.print("Введите цвет треугольника: ");
        String color = input.next();

        System.out.print("Закрашен ли треугольник (true/false): ");
        boolean isFilled = input.nextBoolean();

        // Создание объекта треугольника
        Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);

        // Вывод результатов
        System.out.println("\n--- Информация о треугольнике ---");
        System.out.println("Описание: " + triangle.toString());

        input.close();
    }
}
