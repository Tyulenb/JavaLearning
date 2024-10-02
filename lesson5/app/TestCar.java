package lesson5.app;

import lesson5.vehicles.Car;
import lesson5.vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car(
                "ABC123456789", "Igor",
                2005, "yellow", "ABC 1234",
                "Daewoo Matiz"
        );

        ElectricCar eCar = new ElectricCar(
                "POL-987654321", "Elon Musk",
                2023, "space gray", "XYZ-5678",
                "Tesla Cybertruck","123kWh"
        );

        System.out.println(car+"\n");
        System.out.println(eCar+"\n");

        car.setOwnerName("v");
        car.setYear(2006);
        car.setInsuranceNumber("CBA123456789");
        System.out.println(car);

        System.out.println("The battery capacity of the electric car is: " + eCar.getBatteryCapacity());
    }
}
