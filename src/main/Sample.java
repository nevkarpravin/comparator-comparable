package main;

public class Sample {
    synchronized public void sampleMethod() throws InterruptedException {
        System.out.println("Inside sample method by " + Thread.currentThread().getName());
       Thread.sleep(60000);
    }

    public void addition() throws InterruptedException {
        System.out.println("Inside addition method by " + Thread.currentThread().getName());
        Thread.sleep(30000);
    }

    public void substraction() throws InterruptedException {
        System.out.println("Inside substraction method by " + Thread.currentThread().getName());
        Thread.sleep(30000);
    }

    public void deletion() throws InterruptedException {
        System.out.println("Inside deletion method by " + Thread.currentThread().getName());
        Thread.sleep(30000);
    }
}
