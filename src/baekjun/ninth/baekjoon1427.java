package baekjun.ninth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] result = new int[10];
        String[] input = br.readLine().split("");
        String output = "";

        for (int i = 0; i < input.length; i++) {
            int cnt = Integer.parseInt(input[i]);
            result[cnt]++;
        }

        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] != 0) {
                for (int j = 0; j < result[i]; j++) {
                    output = output + String.valueOf(i);
                }
            }
        }
        System.out.println(output);
    }
}
