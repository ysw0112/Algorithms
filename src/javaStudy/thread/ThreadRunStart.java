package javaStudy.thread;

public class ThreadRunStart extends Thread{
    private String name;

    public ThreadRunStart(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<3; i++) {
            System.out.println(" 스레드 - " + name );
            try {
                // sleep 메서드는 쓰레드를 ms 단위로 대기시키는 메서드 입니다.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadRunStart threadRunStart1 = new ThreadRunStart("threadRunStart1");
        ThreadRunStart threadRunStart2 = new ThreadRunStart("threadRunStart2");
        ThreadRunStart threadRunStart3 = new ThreadRunStart("threadRunStart3");

        long beforeTime = System.currentTimeMillis();
//        threadRunStart1.run();
//        threadRunStart2.run();
//        threadRunStart3.run();

        threadRunStart1.start();
        threadRunStart2.start();
        threadRunStart3.start();
        threadRunStart1.join();
        threadRunStart2.join();
        threadRunStart3.join();

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
//        Worker worker1 = new Worker();
//        Worker worker2 = new Worker();
//        RunWorker runWorker1 = new RunWorker();
//        RunWorker runWorker2 = new RunWorker();
//        System.out.println("Runner : " + Thread.currentThread().getName());
//        worker1.start();
//        worker1.run();
//        worker2.start();
//        worker2.run();
//
//        runWorker1.run();
//        runWorker2.run();
    }

    public static class Worker extends Thread {

        @Override
        public void run() {
            System.out.println("Worker : " + Thread.currentThread().getName());
        }
    }

    public static class RunWorker implements Runnable {

        @Override
        public void run() {
            System.out.println("RunWorker : " + Thread.currentThread().getName());
        }
    }
}
