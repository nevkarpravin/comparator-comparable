package main;

public class ThreadEx extends Thread {

    Sample sample;

    public ThreadEx(Sample sample, String name){
        this.sample = sample;
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " starts ");
       synchronized (sample) {
           try {
               sample.addition();
           sample.deletion();
           sample.substraction();

           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
