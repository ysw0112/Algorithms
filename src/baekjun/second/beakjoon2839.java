package baekjun.second;

import java.util.Scanner;

public class beakjoon2839 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        int inputValue = c.nextInt();
        int fiveCnt = 0;
        int threeCnt = 0;
        int temp = 0;

        if(inputValue > 2 && inputValue < 5001){
            if(inputValue % 5 == 0){
                fiveCnt = inputValue/5;
                System.out.println(fiveCnt);
                return;
            }else{
                fiveCnt = inputValue/5;
                temp = inputValue%5;

                for(int i=fiveCnt; i>-1; i--){
                    if(temp % 3 == 0){
                        fiveCnt = i;
                        threeCnt = temp / 3;
                        System.out.println(fiveCnt + threeCnt);
                        return;
                    }
                    temp = temp + 5;
                }
                temp = -1;
                System.out.println(temp);
                return;
            }
        }else{
            System.out.println("입력 범위 초과!");
        }
    }
}
