package baekjun.second;

import java.util.Scanner;

public class sachicyunsan {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String[] input = c.nextLine().split(" ");
        int value = 0;
        int value1 = 0;
        int value2 = 0;

        if (input.length > 2) {
            return;
        } else {
            for (int i = 0; i < input.length; i++) {
                value = Integer.parseInt(input[i]);
                if (value < 1 || value > 10000) {
                    return;
                }
            }
            value1 = Integer.parseInt(input[0]);
            value2 = Integer.parseInt(input[1]);
            System.out.println(value1 + value2);
            System.out.println(value1 - value2);
            System.out.println(value1 * value2);
            System.out.println(value1 / value2);
            System.out.println(value1 % value2);
        }

    }
}
