package pl.sdacademy.java.advance.day3.Task32;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L; //Trzeba przypisać jeśli przy wyświetlaniu pokarze takie pole  na ekranie
    private final String model;   //jeśli usuniemy lub dodamy pole np. String producer to przy deserializacji sobie poradzi
    private final double price;  // trzeba mieć odpowiedni konstruktor i toString
    private final boolean isNew;

    public Car(String model, double price, boolean isNew) {
        this.model = model;
        this.price = price;
        this.isNew = isNew;
    }


//    public String getModel() {   //gettery nie są potrzebne do deserializacji
//        return model;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public boolean isNew() {
//        return isNew;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }
}
