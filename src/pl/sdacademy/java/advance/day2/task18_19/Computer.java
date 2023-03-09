package pl.sdacademy.java.advance.day2.task18_19;

import java.util.Objects;

public class Computer {
    private String cpu;
    private String ram;
    private String graphicCard;
    private String company;
    private String model;


    public Computer(String processor, String ram, String graphicCard, String company, String model) {
        this.cpu = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.company = company;
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return getCpu().equals(computer.getCpu()) && getRam().equals(computer.getRam()) && getGraphicCard().equals(computer.getGraphicCard()) && getCompany().equals(computer.getCompany()) && getModel().equals(computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpu(), getRam(), getGraphicCard(), getCompany(), getModel());
    }
}
