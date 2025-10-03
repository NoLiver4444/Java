package prac_2.number_3.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar() {
        super(); //Вызлв конмтруктора родительского класса
        this.engineType = "Electric";
    }

    public ElectricCar(String model, String license, String color, int year,
                       String ownerName, String insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber, "Electric"); // Вызываем конструктор родительского класса
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nbatteryCapacity - " + this.batteryCapacity;
    }
}
