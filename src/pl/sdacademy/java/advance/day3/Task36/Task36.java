package pl.sdacademy.java.advance.day3.Task36;

import pl.sdacademy.java.advance.day3.Task34.MyThread;

public class Task36 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadPlaygrounRunnable("job_1"));
        Thread t2 = new Thread(new ThreadPlaygrounRunnable("job_2"));

        t1.start();
        t1.join();  //najpirw pierwszy wątek wykonuje zadania
        t2.start();
    }
}
