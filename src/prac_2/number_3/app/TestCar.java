package prac_2.number_3.app;

import prac_2.number_3.vehicles.Car;
import prac_2.number_3.vehicles.ElectricCar;
import prac_2.number_3.vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        // Демонстрация полиморфизма - работа через ссылки на родительские классы

        // Создание объектов через ссылку на Vehicle
        Vehicle car1 = new Car("Toyota Camry", "ABC123", "Black", 2020,
                "John Doe", "INS12345", "Gasoline");

        Vehicle electricCar1 = new ElectricCar("Tesla Model 3", "TESLA001", "White", 2023,
                "Jane Smith", "INS67890");

        // Создание объектов через ссылку на Car
        Car car2 = new Car("Honda Civic", "DEF456", "Blue", 2019,
                "Bob Johnson", "INS11111", "Gasoline");

        Car electricCar2 = new ElectricCar("Nissan Leaf", "NIS002", "Red", 2022,
                "Alice Brown", "INS22222");

        // Использование полиморфизма - вызов методов через родительские ссылки
        System.out.println("=== Vehicle Type Demonstration ===");
        displayVehicleType(car1);
        displayVehicleType(electricCar1);
        displayVehicleType(car2);
        displayVehicleType(electricCar2);

        System.out.println("\n=== Original Car Information ===");
        System.out.println(car1);
        System.out.println("\n");
        System.out.println(electricCar1);

        // Изменение свойств с помощью сеттеров
        System.out.println("\n=== After Modifying Properties ===");

        car1.setColor("Red");
        car1.setOwnerName("Mike Wilson");// Приведение типа для доступа к специфичным методам

        electricCar1.setInsuranceNumber("INS_NEW_123");// Приведение типа

        car2.setYear(2021);

        electricCar2.setModel("Nissan Leaf Plus");

        // Вывод измененной информации
        System.out.println(car1);
        System.out.println("\n");

        System.out.println(electricCar1);
        System.out.println("\n");

        System.out.println(car2);
        System.out.println("\n");

        System.out.println(electricCar2);
        System.out.println("\n");

        // Демонстрация работы с массивом Vehicle (полиморфизм)
        System.out.println("\n=== Processing Vehicle Array ===");
        Vehicle[] vehicles = {car1, electricCar1, car2, electricCar2};

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.vehicleType());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Engine: " + vehicle.getEngineType());
            System.out.println("-----------");
            System.out.println("\n");
        }
    }

    // Метод, демонстрирующий полиморфизм
    public static void displayVehicleType(Vehicle vehicle) {
        System.out.println("This vehicle is a: " + vehicle.vehicleType());
    }
}