package pl.sdacademy.java.advance.day3.Task34;

public class Task34 {
    public static void main(String[] args) throws InterruptedException {
      //  System.out.println(Thread.activeCount()); // Na początku mamy dwa wątki  Main oraz GarbageCollector
        MyThread myThread1 = new MyThread();
        myThread1.start();
        myThread1.join();

        System.out.println("[main] idę sobie spać");
        Thread.sleep(3000);
        System.out.println("[main] Wstałem");
        System.out.println("[main] Przeszkadzam pierwszemu wątkowi");
        myThread1.interrupt();
        System.out.println("[main] już poprzeszkadzałem pierwszemu wątkowi");

        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}
