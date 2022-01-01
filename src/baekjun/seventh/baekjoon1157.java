package baekjun.seventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim().toUpperCase();
        int[] result = new int[26];
        int max = 0;
        int check = 0;

        for (int i = 0; i < input.length(); i++) {
            int charValue = input.charAt(i);
            result[charValue - 65]++;
        }
        for (int i = 0; i < result.length; i++) {
            if (max != 0 && max == result[i]) {
                System.out.println("?");
                return;
            }
            if (max < result[i]) {
                max = result[i];
                check = i;
            }
        }
        System.out.print(Character.toChars(check + 65));
    }
}
