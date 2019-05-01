package hackerRank.Algorithms;

import java.util.*;
import java.io.*;

public class maximumArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int k = sc.nextInt();
            long m = sc.nextLong();
            long sum = 0;
            long prev = 0;
            long ret = 0;
            TreeSet<Long> tr = new TreeSet<>();
            for (int i = 0; i < k; i++) {
                sum = (sum+(sc.nextLong() % m))%m;
                System.out.println(sum);
                tr.add(sum);
                try {
                    ret = Math.max(ret, (sum - tr.higher(sum) +m) % m);
                } catch (NullPointerException e) {
                    ret = Math.max(ret,sum);
                }
            }
            System.out.println(ret);
            n--;
        }
    }
}
