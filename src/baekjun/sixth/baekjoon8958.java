package baekjun.sixth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputCnt = Integer.parseInt(br.readLine());
        int[] result = new int[inputCnt];
        int sum = 0;
        int tempCnt = 0;
        for (int i = 0; i < inputCnt; i++) {
            String[] testCase = br.readLine().split("");
            for (int j = 0; j < testCase.length; j++) {
                if (testCase[j].equals("O")) {
                    tempCnt++;
                    sum += tempCnt;
                } else {
                    tempCnt = 0;
                }
            }
            result[i] = sum;
            sum = 0;
            tempCnt = 0;
        }

        for (int i = 0; i < inputCnt; i++) {
            System.out.println(result[i]);
        }
    }
}
