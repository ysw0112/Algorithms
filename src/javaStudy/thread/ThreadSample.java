package javaStudy.thread;

public class ThreadSample {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.run();
    }

    public static class MyThread1 extends Thread {

        @Override
        public void run() {
            System.out.println("Hello Word!");
        }
    }

    public static class MyThread2 implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello word!!");
        }
    }
}
