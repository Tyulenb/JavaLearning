package lesson5.vehicles;

abstract public class Vehicle {
    private String model;
    private String License;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;
    private String engineType;

    public Vehicle(String engineType, String insuranceNumber, String ownerName, int year, String color, String license, String model) {
        this.engineType = engineType;
        this.insuranceNumber = insuranceNumber;
        this.ownerName = ownerName;
        this.year = year;
        this.color = color;
        License = license;
        this.model = model;
    }

    abstract public String vehicleType();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return License;
    }

    public void setLicense(String license) {
        License = license;
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
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", License='" + License + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", ownerName='" + ownerName + '\'' +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
