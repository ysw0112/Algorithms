package baekjun.seventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beak5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input.length() > 15 && input.length() < 2) return;

        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            int check = input.charAt(i);

            if (check >= 65 && check < 68) {
                result += 3;
            } else if (check >= 68 && check < 71) {
                result += 4;
            } else if (check >= 71 && check < 74) {
                result += 5;
            } else if (check >= 74 && check < 77) {
                result += 6;
            } else if (check >= 77 && check < 80) {
                result += 7;
            } else if (check >= 80 && check < 84) {
                result += 8;
            } else if (check >= 84 && check < 87) {
                result += 9;
            } else if (check >= 87 && check < 91) {
                result += 10;
            }
        }
        System.out.println(result);
    }
}
