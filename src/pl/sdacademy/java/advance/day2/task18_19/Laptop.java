package pl.sdacademy.java.advance.day2.task18_19;

import java.util.Objects;

public class Laptop extends Computer{

    private String battery;

    public Laptop(String cpu, String ram, String graphicCard, String company, String model, String battery) {
        super(cpu, ram, graphicCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery='" + battery + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return getBattery().equals(laptop.getBattery());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBattery());
    }
}
