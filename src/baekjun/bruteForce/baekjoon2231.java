package baekjun.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class baekjoon2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        long min = input.length() * 9;
        long value = Long.parseLong(input);

        for (long i = value-min; i < value; i++){
            if(i < 0) continue;
            long sum = i + Stream.of(String.valueOf(i).split("")).mapToLong(Long::parseLong).sum();
            if(sum == value) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0L);

    }
}
