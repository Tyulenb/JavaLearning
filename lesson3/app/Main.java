package lesson3.app;

import lesson3.vehicles.Car;
import lesson3.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setOwnerName("Igor");
        car.setEngineType("Diesel");
        car.setInsuranceNumber("A123BC");

        System.out.println("Owner is " + car.getOwnerName());
        System.out.println("Engine type is " + car.getEngineType());
        System.out.println("Insurance is " + car.getInsuranceNumber());

        ElectricCar eCar = new ElectricCar();
        eCar.setBatteryCapacity(100);
        System.out.println("Engine type is " + eCar.getEngineType());
        System.out.println("Battery capacity is " + eCar.getBatteryCapacity());
    }
}
