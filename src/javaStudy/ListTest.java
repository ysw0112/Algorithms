package javaStudy;

import java.util.Collections;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> list = Collections.emptyList();
        list.add("a");
        list.add("b");
        list.add("c");

        List<String> list2 = Collections.emptyList();
        list2.add("1");
        list2.add("2");
        list2.add("3");

        System.out.println(list);
        System.out.println(list2);
    }

}
