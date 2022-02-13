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
5
87 89 92 100 76
출력
4 3 2 1 5
 */
public class RankingAccount {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String input = br.readLine();
        solution(input);
    }

    private static void solution(String input) {
        List<Integer> koreanScore = Arrays.stream(input.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < koreanScore.size(); i++) {
            int score = koreanScore.get(i);
            int rank = 1;
            for (int j = 0; j < koreanScore.size(); j++) {
                if(score < koreanScore.get(j)) rank ++;
            }
            answer.add(rank);
        }
        for (Integer rank : answer) {
            System.out.print(rank + " ");
        }
    }
}
