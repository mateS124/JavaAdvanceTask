package pl.sdacademy.java.advance.day3.Task34;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("[" + getName() + "]" + "Początek wątku");
        System.out.println("[" + getName() + "]" + "Idę sobie spać");
        try{
            Thread.sleep(10000);

        }catch(InterruptedException e){
            System.out.println("[" + getName() + "]" + "ktoś mi przeszkodził");
        }

        System.out.println("[" + getName() + "]" + "Wstałem") ;
    }

}
