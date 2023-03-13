package pl.sdacademy.java.advance.day3.Task36;

public class ThreadPlaygrounRunnable implements Runnable {
    private final String name;

    public ThreadPlaygrounRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i <= 10; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Exception!");
            }
            System.out.printf("[%s] [%s]: %d \n", threadName, name, i);
        }
    }
}
