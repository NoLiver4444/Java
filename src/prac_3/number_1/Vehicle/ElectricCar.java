package prac_3.number_1.Vehicle;

public class ElectricCar extends Car implements ElectricVehicle {
    private int batteryCapacity;

    public ElectricCar(String model, String license, String color, int year,
                       String ownerName, String insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.engineType = "Electric"; // Переопределяем тип двигателя
        this.batteryCapacity = batteryCapacity;
    }

    // Реализация методов интерфейса ElectricVehicle
    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(int capacity) {
        this.batteryCapacity = capacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return super.toString() + "\nBattery Capacity: " + batteryCapacity + " kWh";
    }
}