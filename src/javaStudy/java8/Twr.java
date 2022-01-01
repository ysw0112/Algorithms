package javaStudy.java8;

public class Twr implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.printf("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}
