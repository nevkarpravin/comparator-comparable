package main;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Current Thread " + Thread.currentThread().getName());

        String resource1 = "ABC";
        String resource2 = "PQR";
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println("resource1 is locked by thread1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2){
                        System.out.println("Thread1 accessing resource2");
                    }
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                {
                    synchronized (resource2){
                        System.out.println("resource2 is locked by thread2");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (resource1){
                            System.out.println("Thread2 accessing resource1");
                        }
                    }

                }
            }
        });

        thread1.start();
        thread2.start();

    }

}
