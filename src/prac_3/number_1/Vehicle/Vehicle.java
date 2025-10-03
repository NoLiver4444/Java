package prac_3.number_1.Vehicle;

public abstract class Vehicle {
    protected String model;
    protected String license;
    protected String color;
    protected int year;
    protected String ownerName;
    protected String insuranceNumber;
    protected String engineType;

    public Vehicle() {
        this.model = "Unknown";
        this.license = "Unknown";
        this.color = "Unknown";
        this.year = 0;
        this.ownerName = "Unknown";
        this.insuranceNumber = "Unknown";
        this.engineType = "Unknown";
    }

    public Vehicle(String model, String license, String color, int year,
                   String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public abstract String vehicleType();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
        return "Vehicle Type: " + vehicleType() + "\n" +
                "Model: " + model + "\n" +
                "License: " + license + "\n" +
                "Color: " + color + "\n" +
                "Year: " + year + "\n" +
                "Owner: " + ownerName + "\n" +
                "Insurance: " + insuranceNumber + "\n" +
                "Engine: " + engineType;
    }
}
