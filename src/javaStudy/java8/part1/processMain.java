package javaStudy.java8.part1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class processMain {
    public static void main(String[] args) throws IOException {
        String lineOne = Process.processFile();
        String lineTwo = Process.processFile(br -> br.readLine() + br.readLine());
        String lineThree = Process.processFile(br -> br.readLine() + br.readLine() + br.readLine());

        System.out.println(lineOne);
        System.out.println(lineTwo);
        System.out.println(lineThree);

        Integer a = new Integer(1);
        Integer b = new Integer(1);
        System.out.println("@@@@@@@@@" + a.compareTo(2));
        Integer c = 1;
        Integer d = 1;

        System.out.println(a == b);
        System.out.println(c == d);

        List<Integer> list = new ArrayList<>();

        for (int i = 300; i < 400; i++) {
            list.add(i);
        }
    }
}
