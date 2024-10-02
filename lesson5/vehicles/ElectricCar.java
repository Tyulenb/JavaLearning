package lesson5.vehicles;

public class ElectricCar extends Car implements ElectricVehicle{

    private String batteryCapacity;

    public ElectricCar(String insuranceNumber, String ownerName, int year, String color, String license, String model, String batteryCapacity) {
        super(insuranceNumber, ownerName, year, color, license, model);
        this.batteryCapacity = batteryCapacity;
        this.setEngineType("Electric");
    }

    @Override
    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
