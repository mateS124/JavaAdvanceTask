package pl.sdacademy.java.advance.day3.Task37;

import pl.sdacademy.java.advance.day3.Task36.ThreadPlaygrounRunnable;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Task37 {
    public static void main(String[] args)  {
//        Thread t1 = new Thread(new ThreadPlaygrounRunnable("job_1"));
//        t1.start();

        Executor executor = Executors.newFixedThreadPool(10); //Executor z pulą 2 wątków
        for (int i = 0; i <= 10; i++){
            executor.execute(new ThreadPlaygrounRunnable("job_1_" + i));
            System.out.println(executor);
            try {
                ((ExecutorService) executor).shutdown();
            }catch(RuntimeException e){
                System.out.println(e.toString());
            }
        }
    }
}
