package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
격자판 최대합
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력
입력
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
출력
155
 */
public class Example9 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.valueOf(br.readLine()).intValue();
        int[][] input = new int[cnt][cnt];

        for (int i = 0; i < cnt; i++) {
            int[] s = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).mapToInt(t -> t).toArray();
            for (int j = 0; j < s.length; j++) {
                input[i][j] = s[j];
            }
        }
        solution(input);
    }

    private static void solution(int[][] input) {
        int max = 0;
        int rtarget = 0;
        int ctarget = 0;
        for (int i = 0; i < input.length; i++) {
            rtarget = 0;
            ctarget = 0;
            for (int j = 0; j < input.length; j++) {
                rtarget += input[i][j];
                ctarget += input[j][i];
            }
            int tmp = Math.max(rtarget, ctarget);
            if (max < tmp) max = tmp;
        }
        rtarget = 0;
        ctarget = 0;
        for (int i = 0; i < input.length; i++) {
           rtarget += input[i][i];
           ctarget += input[i][input.length-1-i];
        }
       if(max < Math.max(rtarget, ctarget)) max = Math.max(rtarget, ctarget);
        System.out.println(max);
    }
}
