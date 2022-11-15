package main;

public  class SynchronizedExample {

    public static void main(String[] args) {

        Sample sample = new Sample();
        ThreadEx thread1 = new ThreadEx(sample, "Thread 1");
        ThreadEx thread2 = new ThreadEx(sample, "Thread 2");
        ThreadEx thread3 = new ThreadEx(sample, "Thread 3");
        ThreadEx thread4 = new ThreadEx(sample, "Thread 4");
        ThreadEx thread5 = new ThreadEx(sample, "Thread 5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        Sample sample1 = new Sample();
        Sample sample2 = new Sample();
        sample2 = sample1;
        sample1 = null;
        





    }


}
