package prac_3.number_1.app;

import prac_3.number_1.Vehicle.Car;
import prac_3.number_1.Vehicle.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        // Создание экземпляров классов Car и ElectricCar
        Car regularCar = new Car("Toyota Camry", "ABC123", "Blue", 2020,
                "John Smith", "INS123456");

        ElectricCar electricCar = new ElectricCar("Tesla Model 3", "TES001", "Red",
                2022, "Alice Johnson", "INS789012", 75);

        // Вывод первоначальной информации
        System.out.println("=== ПЕРВОНАЧАЛЬНАЯ ИНФОРМАЦИЯ ===");
        System.out.println(regularCar.toString());
        System.out.println("\n" + electricCar.toString());

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Изменение года выпуска и имени владельца
        System.out.println("=== ИЗМЕНЕНИЕ ГОДА И ВЛАДЕЛЬЦА ===");
        regularCar.setYear(2021);
        regularCar.setOwnerName("Michael Brown");

        electricCar.setYear(2023);
        electricCar.setOwnerName("Emily Davis");

        System.out.println("Обновленная информация об обычной машине:");
        System.out.println("Год: " + regularCar.getYear() + ", Владелец: " + regularCar.getOwnerName());
        System.out.println("Обновленная информация об электромобиле:");
        System.out.println("Год: " + electricCar.getYear() + ", Владелец: " + electricCar.getOwnerName());

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Изменение страхового номера
        System.out.println("=== ИЗМЕНЕНИЕ СТРАХОВОГО НОМЕРА ===");
        regularCar.setInsuranceNumber("INS_NEW_123");
        electricCar.setInsuranceNumber("INS_NEW_456");

        System.out.println("Новый страховой номер обычной машины: " + regularCar.getInsuranceNumber());
        System.out.println("Новый страховой номер электромобиля: " + electricCar.getInsuranceNumber());

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Получение информации о емкости батареи у электромобиля
        System.out.println("=== ИНФОРМАЦИЯ О БАТАРЕЕ ЭЛЕКТРОМОБИЛЯ ===");
        System.out.println("Емкость батареи: " + electricCar.getBatteryCapacity() + " kWh");

        // Изменение емкости батареи
        electricCar.setBatteryCapacity(85);
        System.out.println("Обновленная емкость батареи: " + electricCar.getBatteryCapacity() + " kWh");

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Вывод полной информации о транспортных средствах
        System.out.println("=== ФИНАЛЬНАЯ ИНФОРМАЦИЯ ===");
        System.out.println("Обычная машина:");
        System.out.println(regularCar.toString());

        System.out.println("\nЭлектромобиль:");
        System.out.println(electricCar.toString());

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Дополнительная проверка типов транспортных средств
        System.out.println("=== ТИПЫ ТРАНСПОРТНЫХ СРЕДСТВ ===");
        System.out.println("Тип обычной машины: " + regularCar.vehicleType());
        System.out.println("Тип электромобиля: " + electricCar.vehicleType());
    }
}