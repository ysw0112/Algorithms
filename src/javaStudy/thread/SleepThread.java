package javaStudy.thread;

public class SleepThread {

    public static void main(String[] args) {
        SleepThread1 sleepThread1 = new SleepThread1();
        SleepThread2 sleepThread2 = new SleepThread2();

        sleepThread1.start();
        sleepThread2.start();

        try {
            //sleep()은 항상 현재 실행중인 스레드에 대해 작동하기 때문에 sleepThread1를 호출해도 실제로 영향받는 것은 main메서드를 실행하는 스레드이다.
            //그래서 sleep()은 static으로 선언되어 있으며, Thread.sleep 으로 해야 한다.
            sleepThread1.sleep(1000);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Main종료");
    }

    static class SleepThread1 extends Thread {

        @Override
        public void run() {
            for (int i=0; i<10; i++){
                System.out.print("-");
            }
            System.out.println("SleepThread1 종료");
        }
    }

    static class SleepThread2 extends Thread {

        @Override
        public void run() {
            for (int i=0; i<10; i++){
                System.out.print("|");
            }

            System.out.println("SleepThread2 종료");
        }
    }
}

