package baekjun.third;

import java.util.Scanner;

public class baekjoon2440 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        int input = c.nextInt();

        for(int i=1; i<=input; i++){
            for (int j=input; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
