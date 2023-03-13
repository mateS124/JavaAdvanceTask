package pl.sdacademy.java.advance.day3.task35;

import pl.sdacademy.java.advance.day3.Task34.MyThread;

public class Task35 {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        MyThread myThread = new MyThread();
        Thread thread = new Thread(new MyRunnable()); // Musimy wyjść z Thread
        thread.start();
        System.out.println(Thread.currentThread());
    }
}
