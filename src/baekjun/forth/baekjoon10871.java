package baekjun.forth;

import java.util.Scanner;

public class baekjoon10871 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);

        int[] input = new int[2];
        for (int i=0; i<input.length; i++){
            input[i] = c.nextInt();
        }

        int[] checkArr = new int[input[0]];
        int checkNum = input[1];

        for (int i=0; i<checkArr.length; i++){
            checkArr[i] = c.nextInt();
            if(checkNum > checkArr[i]){
                System.out.print(checkArr[i]+" ");
            }
        }
    }
}
