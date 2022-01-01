package baekjun.sixteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(br.readLine());

        for (int i = 0; i < count; i++) {
            int input = Integer.valueOf(br.readLine());
            int[][] result = new int[42][2];

            result[0][0] = 1;
            result[0][1] = 0;
            result[1][0] = 0;
            result[1][1] = 1;

            for (int j = 2; j < 42; j++) {
                result[j][0] = result[j - 1][0] + result[j - 2][0];
                result[j][1] = result[j - 1][1] + result[j - 2][1];
            }
            System.out.println(result[input][0] + " " + result[input][1]);
        }
    }
}
