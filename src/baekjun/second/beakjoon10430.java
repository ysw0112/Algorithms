package baekjun.second;

import java.util.Scanner;

public class beakjoon10430 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String[] input = c.nextLine().split(" ");

        if (input.length == 3) {
            int value = 0;
            int value1 = 0;
            int value2 = 0;
            int value3 = 0;

            for(int i=0; i<input.length; i++){
                value = Integer.parseInt(input[i]);
                if(value < 2 || value > 10000) {
                    return;
                }
            }
            value1=Integer.parseInt(input[0]);
            value2=Integer.parseInt(input[1]);
            value3=Integer.parseInt(input[2]);

            System.out.println((value1+value2)%value3);
            System.out.println((value1%value3+value2%value3)%value3);
            System.out.println((value1*value2)%value3);
            System.out.println((value1%value3*value2%value3)%value3);
        } else {
            System.out.println("입력수가 3개가 아닙니다!");
            return;
        }
    }
}
