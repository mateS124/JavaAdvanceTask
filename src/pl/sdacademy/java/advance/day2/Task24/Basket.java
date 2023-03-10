package pl.sdacademy.java.advance.day2.Task24;

public class Basket {
    private int numersOfItems;

    public Basket() {
        this.numersOfItems = 0;
    }

    public void addToBasket() {
        if (numersOfItems == 10) {
            throw new BasketFullException("To many items in the basket");
        }
        numersOfItems++;
    }

    public void removefromBasket() {
        if (numersOfItems == 0) {
            throw new BasketEmptyException("Basket is empty");
        }
        numersOfItems--;
    }
}

