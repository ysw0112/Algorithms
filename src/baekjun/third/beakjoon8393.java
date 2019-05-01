package baekjun.third;

import java.util.Scanner;

public class beakjoon8393 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        int input = c.nextInt();
        int result = 0;

        for(int i=1; i<=input; i++){
            result += i;
        }
        System.out.println(result);
    }
}
