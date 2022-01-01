package baekjun.sixth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] checkArr = new int[input.length];
        int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] des = {8, 7, 6, 5, 4, 3, 2, 1};
        int result = 0;

        for (int i = 0; i < asc.length; i++) {
            if (asc[i] == Integer.parseInt(input[i])) {
                checkArr[i] = 1;
            }
        }
        for (int i = 0; i < des.length; i++) {
            if (des[i] == Integer.parseInt(input[i])) {
                checkArr[i] = 2;
            }
        }
        for (int j = 0; j < checkArr.length; j++) {
            result += checkArr[j];
        }
        if (result == 8) {
            System.out.println("ascending");
            return;
        } else if (result == 16) {
            System.out.println("descending");
            return;
        } else {
            System.out.println("mixed");
            return;
        }
    }
}
