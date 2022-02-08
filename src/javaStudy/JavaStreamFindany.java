package javaStudy;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaStreamFindany {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        Integer integer = a.stream().filter(v -> v > 5).findAny().orElseGet(() -> null);
        System.out.println(integer);

        List<SimpleEntry<String, String>> list =
            Arrays.asList(new SimpleEntry<>("test2", "notnull"), new SimpleEntry<>("test", null));

        Object aNull = list.stream()
                           .map(e -> e.getValue())
                           .findAny()
                           .orElse("널이에요");
        System.out.println(aNull);

        Object anNull = list.stream()
                            // 필터추가
                            .filter(e -> "test".equalsIgnoreCase(e.getKey()))
                            .map(e -> e.getValue())
                            .findAny()
                            .orElse("널이에요");
        System.out.println(anNull);
    }

}
