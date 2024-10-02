package lesson5.vehicles;

public class Car extends Vehicle{

    public Car(String insuranceNumber, String ownerName, int year, String color, String license, String model){
        super("Combustion", insuranceNumber, ownerName, year, color, license, model);
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
