package baekjun.third;

import java.util.Scanner;

public class baekjoon2742 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int inputValue = c.nextInt();
        c.close();

        if (inputValue > 0 && inputValue < 100001) {
            for (int i = inputValue; i > 0; i--) {
                System.out.println(i);
            }
        }
    }
}
