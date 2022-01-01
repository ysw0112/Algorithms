package baekjun.third;

import java.util.Scanner;

public class beakjoon2741 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int inputValue = c.nextInt();
        c.close();

        if (inputValue > 0 && inputValue < 10001) {
            for (int i = 1; i <= inputValue; i++) {
                if (i == inputValue) {
                    System.out.print(i);
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
