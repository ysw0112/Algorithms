package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
n * n의 격자판이 주어지며 격자의 가장자리는 0으로 초기화 되어있다.
각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역이다.
봉우리 지역이 몇개 있는지 알아내라.
입력
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2
출력
10
 */
public class Example10 {

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine()).intValue();
        int[][] input = new int[n+2][n+2];

        for (int i = 1; i < n+1; i++) {
            int[] s = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).mapToInt(t -> t).toArray();
            int k = 0;
            for (int j = 1; j < n+1; j++) {
                input[i][j] = s[k++];
            }
        }

        solution(input);
    }

    private static void solution(int[][] input) {
        int answer = 0;
        for (int i = 1; i < input.length-1; i++) {
            for (int j = 1; j < input.length-1; j++) {
                int target = input[i][j];
                for (int k = 0; k < 4; k++) {
                    if(target <= input[i + dx[k]][j + dy[k]]) {
                        break;
                    }
                    if (k == 3){
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
