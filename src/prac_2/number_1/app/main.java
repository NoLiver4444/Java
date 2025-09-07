package prac_2.number_1.app;

import prac_2.number_1.vehicles.Car;
import prac_2.number_1.vehicles.ElectricCar;

public class main {
    public static void main(String[] args) {
        Car car = new Car("qwer", "asdf", "zxcv");

        System.out.println(car.getOwnerName() + " " + car.getInsuranceNumber() + " " + car.getEngineType());
        System.out.println(car.toString());
        System.out.println("\n");

        car.setOwnerName("tyui");
        car.setInsuranceNumber("ghjk");
        car.setEngineType("vbnm");

        System.out.println(car.getOwnerName() + " " + car.getInsuranceNumber() + " " + car.getEngineType());
        System.out.println(car.toString());
        System.out.println("\n");

        ElectricCar electricCar = new ElectricCar("tyui", "gjhk", 100);

        System.out.println(electricCar.getOwnerName() + " " + electricCar.getInsuranceNumber() + " " + electricCar.getEngineType() + " " + electricCar.getBatteryCapacity());
        System.out.println(electricCar.toString());
        System.out.println("\n");

        electricCar.setOwnerName("qwer");
        electricCar.setInsuranceNumber("asdf");
        electricCar.setEngineType("zxcv");
        electricCar.setBatteryCapacity(50);

        System.out.println(electricCar.getOwnerName() + " " + electricCar.getInsuranceNumber() + " " + electricCar.getEngineType() + " " + electricCar.getBatteryCapacity());
        System.out.println(electricCar.toString());
        System.out.println("\n");
    }
}
