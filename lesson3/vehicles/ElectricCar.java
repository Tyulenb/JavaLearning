package lesson3.vehicles;

public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar() {
        this.engineType = "Electric";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}

