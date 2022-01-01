package baekjun.first;

import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String[] result = c.nextLine().split(" ");
        if (result.length > 2) {
            return;
        }

        int temp = 0;
        for (String sum : result) {
            int value = Integer.parseInt(sum);

            if (value > 0 && value < 10) {
                temp += value;
            } else {
                return;
            }
        }
        System.out.println(temp);
    }
}
