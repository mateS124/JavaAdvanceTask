package pl.sdacademy.java.advance.day2.Task12_13;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private int goundedYear;
    private String country;

    public Manufacturer(String name, int goundedYear, String country) {
        this.name = name;
        this.goundedYear = goundedYear;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getGoundedYear() {
        return goundedYear;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", goundedYear=" + goundedYear +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer)) return false;
        Manufacturer that = (Manufacturer) o;
        return getGoundedYear() == that.getGoundedYear() && getName().equals(that.getName()) && getCountry().equals(that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGoundedYear(), getCountry());
    }
}
