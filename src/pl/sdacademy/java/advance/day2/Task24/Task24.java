package pl.sdacademy.java.advance.day2.Task24;

public class Task24 {
    public static void main(String[] args) {
        Basket basket = new Basket();
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
        basket.removefromBasket();
        try{
            basket.removefromBasket();
        }catch (BasketEmptyException ex){
            System.out.println("Złapałem unchecked exception");
        }catch(RuntimeException ex){
            System.out.println("jestem z RuntimeException");
        }
        System.out.println();
    }
}
