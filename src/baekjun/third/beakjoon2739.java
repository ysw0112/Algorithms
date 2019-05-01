package baekjun.third;

import java.util.Scanner;

public class beakjoon2739 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        int inputValue = c.nextInt();

        if(inputValue > 1 && inputValue < 10){
            for (int i=1; i<10; i++){
                System.out.println(inputValue+" * "+i+" = "+inputValue*i);
            }
        }
    }
}
