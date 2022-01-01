package javaStudy.thread;

import javax.swing.JOptionPane;

public class InterruptThread {

    public static void main(String[] args) {
        InterrupThread interrupThread = new InterrupThread();
        interrupThread.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력값: "+input);
        interrupThread.interrupt();
        System.out.println("isInterrupted() : "+interrupThread.isInterrupted());
    }

    static class InterrupThread extends Thread {

        @Override
        public void run() {
            int i = 10;

            while (i != 0 && !isInterrupted()){
                System.out.println(i--);
//                for (long x=0; x<25000000000L; x++);

                try {
                    //InterruptedException이 발생되고 스레드의 interrupted상태는 false로 자동 초기화 된다.
                    //해결방안- catch문에 interrupt()추가
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("카운트 종료");
        }
   }
}
