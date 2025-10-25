package prac_4.number_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите целое число от 1 до 12: ");
                int monthNumber = input.nextInt();

                String monthName = months[monthNumber - 1];
                int days = dom[monthNumber - 1];

                System.out.println("Месяц: " + monthName);

                if (monthNumber == 2) {
                    System.out.print("Введите год для проверки високосного года: ");
                    int year = input.nextInt();

                    if (isLeapYear(year)) {
                        System.out.println("Количество дней: 29 (високосный год)");
                    } else {
                        System.out.println("Количество дней: " + days);
                    }
                } else {
                    System.out.println("Количество дней: " + days);
                }

                break;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Недопустимое число: введите число от 1 до 12");
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число");
                input.nextLine();
            }
        }

        input.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
