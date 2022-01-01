package baekjun.sixth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 5;
        int sum = 0;
        int[] score = new int[count];

        for (int i = 0; i < count; i++) {
            score[i] = Integer.parseInt(br.readLine());
            if (score[i] % 5 != 0) return;
            if (score[i] < 40) {
                score[i] = 40;
            }
            sum += score[i];
        }
        System.out.println(sum / count);
    }
}
