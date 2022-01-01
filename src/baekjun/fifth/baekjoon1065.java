package baekjun.fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputValue = Integer.parseInt(br.readLine());
        int[] hansuArr = new int[3];

        int cnt = 0;
        for (int i = 1; i <= inputValue; i++) {
            if (i < 100) {
                cnt++;
                continue;
            }
            if (i == 1000) continue;
            int hansuCheck = i;
            int k = 0;
            while (hansuCheck > 0) {
                hansuArr[k] = hansuCheck % 10;
                hansuCheck /= 10;
                k++;
            }
            if (hansuArr[2] - hansuArr[1] == hansuArr[1] - hansuArr[0]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
