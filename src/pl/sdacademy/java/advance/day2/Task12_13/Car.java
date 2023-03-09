package pl.sdacademy.java.advance.day2.Task12_13;

import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private double price;
    private int productionYear;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    public Car(String name, String model, double price, int productionYear, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", productionYear=" + productionYear +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getPrice(), getPrice()) == 0 && getProductionYear() == car.getProductionYear() && getName().equals(car.getName()) && getModel().equals(car.getModel()) && getManufacturers().equals(car.getManufacturers()) && getEngineType() == car.getEngineType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModel(), getPrice(), getProductionYear(), getManufacturers(), getEngineType());
    }
}
