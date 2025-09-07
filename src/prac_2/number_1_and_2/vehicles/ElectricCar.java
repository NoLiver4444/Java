package prac_2.number_1_and_2.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar() {
        super(); //Вызлв конмтруктора родительского класса
        this.engineType = "Electric";
    }

    public ElectricCar(String ownerName, String insuranceNumber, int batteryCapacity) {
        super(ownerName, insuranceNumber, "Electric"); // Вызываем конструктор родительского класса
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "ownerName - " + getOwnerName() + "\ninsuranceNumber - " + getInsuranceNumber() + "\nengineType - " + getEngineType() + "\nbatteryCapacity - " + this.batteryCapacity;
    }
}
