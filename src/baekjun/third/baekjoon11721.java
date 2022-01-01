package baekjun.third;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class baekjoon11721 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        Pattern p = Pattern.compile("(^[a-zA-Z]*$)");
        String input = "";
        int count = 0;
        int temp = 0;
        int leftsub = 0;
        int rightsub = 1;


        try {
            input = c.next(p);
        } catch (InputMismatchException e) {
            System.out.println("입력 오류");
        }

        count = input.length() / 10;
        temp = input.length() % 10;

        for (int i = 0; i < count; i++) {
            System.out.println(input.substring(leftsub, rightsub * 10));
            leftsub = leftsub + 10;
            rightsub++;
        }
        if (temp != 0) {
            rightsub--;
            System.out.println(input.substring(rightsub * 10, rightsub * 10 + temp));
        }
    }
}