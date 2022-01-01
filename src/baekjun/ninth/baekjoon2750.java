package baekjun.ninth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] resultArr = new int[count];
        int temp = 0;

        for (int i = 0; i < count; i++) {
            resultArr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < count - i; j++) {
                if (resultArr[j] > resultArr[j + 1]) {
                    temp = resultArr[j];
                    resultArr[j] = resultArr[j + 1];
                    resultArr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(resultArr[i]);
        }
    }
}
