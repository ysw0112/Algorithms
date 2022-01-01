package baekjun.forth;

import java.io.*;

public class baekjoon1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputValue = br.readLine();
        int checkInput = Integer.parseInt(inputValue);
        int cycle = 0;
        String result = "";

        if (checkInput < 10) {
            inputValue = String.format("%02d", checkInput);
        }

        String temp = inputValue;
        while (true) {
            int left = Integer.parseInt(temp.split("")[0]);
            int right = Integer.parseInt(temp.split("")[1]);
            int sumLastNumber = (left + right) % 10;
            result = String.valueOf(right) + String.valueOf(sumLastNumber);

            cycle++;
            if (Integer.parseInt(inputValue) == Integer.parseInt(result)) {
                break;
            } else {
                temp = result;
            }
        }
        System.out.println(cycle);
    }
}
