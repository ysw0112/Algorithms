package baekjun.third;

import java.util.Scanner;

public class baekjoon11720 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int input = c.nextInt();
        int result = 0;
        String input2 = c.next();

        for (int i = 0; i < input; i++) {
            result += Integer.parseInt(String.valueOf(input2.charAt(i)));
        }
        System.out.println(result);
    }
}
