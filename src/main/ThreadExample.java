package main;

public class ThreadExample implements Runnable{

    @Override
    public void run() {
        System.out.println("Starting Thread :" + Thread.currentThread().getName());
    }
}
