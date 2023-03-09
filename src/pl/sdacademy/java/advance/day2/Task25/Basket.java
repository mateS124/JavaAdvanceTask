package pl.sdacademy.java.advance.day2.Task25;

import pl.sdacademy.java.advance.day2.Task24.BasketEmptyException;
import pl.sdacademy.java.advance.day2.Task24.BasketFullException;

public class Basket {
    private int numersOfItems;

    public Basket() {
        this.numersOfItems = 0;
    }

    public void addToBasket()throws BasketFullException{
        if (numersOfItems == 10){
            throw new BasketFullException("To many items in the basket");
        }
        numersOfItems++;
    }

    public void removefromBasket() throws BasketEmptyException{
        if (numersOfItems == 0){
            throw new BasketEmptyException("Basket is empty");
        }
        numersOfItems--;
    }
}
