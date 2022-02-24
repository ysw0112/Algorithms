package inflearn.chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
매출액 종류
만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
20 12 20 10 23 17 10
각 연속 4일간의 구간의 매출종류는
첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
각 구간 별 매출액의 종류 출력
입력
7 4
20 12 20 10 23 17 10
출력
3 4 4 3
 */
public class Example3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] value = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        solution(value, input[1]);
    }

    private static void solution(int[] value, int cnt) {
        List<Long> answer = new ArrayList<>();
        Map<Integer, Integer> salesMap = new HashMap<>();

        for (int i = 0; i < cnt-1; i++) {
            salesMap.put(value[i], salesMap.getOrDefault(value[i], 0)+1);
        }

        for (int i = cnt-1; i < value.length; i++) {
            if (i != cnt-1){
                salesMap.put(value[i-cnt], salesMap.get(value[i-cnt])-1);
            }
            salesMap.put(value[i], salesMap.getOrDefault(value[i], 0)+1);
            long count = salesMap.entrySet().stream().filter(v -> v.getValue() != 0).count();
            answer.add(count);
        }
        System.out.println(answer.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
