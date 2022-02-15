package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
임시반장 정하기
행 = 학생
열 = 학년
입력
5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2
출력
4
 */
public class ChoiceBanjang {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine()).intValue();
        int[][] input = new int[n][5];

        for (int i = 0; i < n; i++) {
            int[] s = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).mapToInt(t -> t).toArray();
            int k = 0;
            for (int j = 0; j < 5; j++) {
                input[i][j] = s[k++];
            }
        }

        solution(input, n);
    }

    private static void solution(int[][] input, int n) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i == j) {
                        continue;
                    }
                    if (input[i][k] == input[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(max<cnt){
                max=cnt;
                answer=i;
            }
        }
        answer ++;
        System.out.println(answer);
    }
}
