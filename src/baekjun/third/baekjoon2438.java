package baekjun.third;

import java.util.Scanner;

public class baekjoon2438 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int inputValue = c.nextInt();

        for (int i = 0; i < inputValue; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
