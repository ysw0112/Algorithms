package baekjun.sixth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = new int[3];
        int[] checkNumber = new int[10];
        String result = "";

        for (int i=0; i<input.length; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        result = String.valueOf(input[0] * input[1] * input[2]);

        for (int i=0; i<result.length(); i++){
            int check = Integer.parseInt(result.split("")[i]);
            checkNumber[check]++;
        }

        for (int i=0; i<checkNumber.length; i++){
            System.out.println(checkNumber[i]);
        }
    }
}
