package baekjun.third;

import java.util.Scanner;

public class baekjoon2439 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        int input = c.nextInt();

        for(int i=1; i<=input; i++){
            for (int j=input; j>0; j--){
                if(j == i || j<i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
