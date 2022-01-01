package hackerRank.Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class listTest {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(3);

        AtomicInteger max = new AtomicInteger(1);
        AtomicInteger count = new AtomicInteger();

        a.forEach(x -> {
            if(x > max.get()){
                max.set(x);
                count.set(1);
            }else if(max.get() == x){
                count.incrementAndGet();
            }
        });

        System.out.printf(count.toString());
    }

}
