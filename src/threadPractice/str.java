package threadPractice;

import java.io.IOException;

public class str {

    public static void main(String[] args) throws IOException {
        MyThread th = new MyThread();

        Runnable runnable = new MyThread2();
        Thread t = new Thread(runnable);

        th.start();
        t.start();
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<=500;i++){
            System.out.print("1");
        }
    }
}


class MyThread extends Thread{
    public void run(){
        for(int i=0; i<=500;i++){
            System.out.print("0");
        }
    }
}