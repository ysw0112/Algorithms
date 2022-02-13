package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
입력
10
1 0 1 1 1 0 0 1 1 0
출력
10
 */
public class ScoreAccount {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.valueOf(br.readLine()).intValue();
        String input = br.readLine();
        solution(input);
    }

    private static void solution(String input) {
        List<Integer> answer = Arrays.stream(input.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> score = new ArrayList<>();
        int continueCount = 0;
        for (int i = 0; i < answer.size(); i++) {
            if(answer.get(i) == 1){
                continueCount++;
            }else {
                continueCount = 0;
            }
            score.add(continueCount);
        }
        System.out.println(score.stream().mapToInt(i -> i).sum());
    }
}
