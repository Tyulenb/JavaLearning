package lesson2;

public class Car {
    private String model;
    private String license;
    private String color;
    int year;
    public Car(){}
    public Car(int year, String color, String license, String model) {
        this.year = year;
        this.color = color;
        this.license = license;
        this.model = model;
    }
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
}
