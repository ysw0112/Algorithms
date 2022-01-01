package baekjun.eleventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n];
        int i, k, max = 0, stIdx = 0;

        while (n-- > 0) {
            int temp = Integer.parseInt(br.readLine());

            if (temp > max) {
                for (i = max; i < temp; i++) {
                    stack[stIdx++] = i + 1;
                    sb.append("+\n");
                }
                max = temp;
            } else {
                if (stack[stIdx - 1] != temp) {
                    System.out.println("NO");
                    return;
                }
            }
            sb.append("-\n");
            stIdx--;
        }
        System.out.println(sb);
    }
}
