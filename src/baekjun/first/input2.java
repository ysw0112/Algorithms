package baekjun.first;

import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("empty!!");
            }
            System.out.println(input);
        }
        sc.close();
    }
}
