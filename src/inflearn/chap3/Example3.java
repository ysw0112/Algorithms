package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
N일 동안 K 기간 최대 매출 출력
N = 10, K = 3
12 15 11 20 25 10 20 19 13 15
출력
56
 */
public class Example3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> input = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        Integer n = input.get(1);
        int[] values = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).mapToInt(i -> i).toArray();
        solution(values, n);
    }

    private static void solution(int[] values, int n) {
        int max= values[0] + values[1] + values[2];
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp += values[i];
        }
        for (int i = n; i < values.length; i++) {
            tmp = tmp + values[i] - values[i-n];
            if(max < tmp){
                max = tmp;
            }
        }
        System.out.println(max);
    }
}
