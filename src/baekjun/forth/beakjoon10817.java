package baekjun.forth;

import java.util.Arrays;
import java.util.Scanner;

public class beakjoon10817 {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        int[] numArr = new int[3];

        for(int i=0; i<numArr.length; i++){
            numArr[i] = c.nextInt();
        }
        Arrays.sort(numArr);
        System.out.println(numArr[1]);
    }
}
