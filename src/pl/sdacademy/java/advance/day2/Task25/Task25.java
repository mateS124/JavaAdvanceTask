package pl.sdacademy.java.advance.day2.Task25;

import pl.sdacademy.java.advance.day2.Task24.BasketEmptyException;
import pl.sdacademy.java.advance.day2.Task24.BasketFullException;

public class Task25 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        try{
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
        }catch (BasketFullException ex){
            System.out.println("ZLapany wyjatek" + ex);
        }

        try{
            basket.removefromBasket();
            basket.removefromBasket();
            basket.removefromBasket();
            basket.removefromBasket();
            basket.removefromBasket();
            basket.removefromBasket();
            basket.removefromBasket();
            basket.removefromBasket();
            basket.removefromBasket();
            basket.removefromBasket();
            basket.removefromBasket();
        }catch (BasketEmptyException ex){
            System.out.println("Ponownie złapany " + ex);
        }
    }
}
