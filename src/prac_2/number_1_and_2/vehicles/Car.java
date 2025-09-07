package prac_2.number_1_and_2.vehicles;

public class Car {
    protected String engineType;
    private String ownerName;
    private String insuranceNumber;

    public Car() {
        this.ownerName = "Unknown";
        this.insuranceNumber = "Unknown";
        this.engineType = "Unknown";
    }

    public Car(String ownerName, String insuranceNumber, String engineType) {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "ownerName - " + this.ownerName + "\ninsuranceNumber - " + this.insuranceNumber + "\nengineType - " + this.engineType;
    }
}
