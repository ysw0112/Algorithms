package inflearn.chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
K번째 큰 수
자연수 N개의 카드가 입력되고 3장을 뽑아 각 카드의 합을 기록한다. K번째로 큰 수를 출력
입력
10 3
13 15 34 23 45 65 33 11 26 42
출력
143
 */
public class Example5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] values = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        solution(values, input[1]);
    }

    private static void solution(int[] values, int k) {
        int answer = -1;
        if (values.length < k) {
            System.out.println(answer);
            return;
        }
        Set<Integer> result = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < values.length; i++) {
            for (int j = i+1; j < values.length; j++) {
                for (int l = j+1; l < values.length; l++) {
                    int eachSum = values[i] + values[j] + values[l];
                    result.add(eachSum);
                }
            }
        }
        Iterator<Integer> iterator = result.iterator();
        int cnt = 1;
        while (iterator.hasNext()){
            answer = iterator.next();
            if(cnt == k) {
                break;
            }
            cnt++;
        }
        System.out.println(answer);
    }

}
