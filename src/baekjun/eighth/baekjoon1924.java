package baekjun.eighth;

import java.util.Scanner;

public class baekjoon1924 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr31 = {1, 3, 5, 7, 8, 10, 12};
        int[] arr30 = {4, 6, 9, 11};

        String[] input = sc.nextLine().split(" ");
        int month = Integer.parseInt(input[0]);
        int day = Integer.parseInt(input[1]);
        String result = "";
        int cnt = 0;

        for (int i=1; i<month; i++){
            if(i == 4 | i == 6 | i == 9 | i == 11){
                cnt += 30;
            }else if(i == 2){
                cnt += 28;
            }else{
                cnt += 31;
            }
        }
        cnt += day;

        if(cnt%7 == 0){
            result = "SUN";
        }else if(cnt%7 == 1){
            result = "MON";
        }else if(cnt%7 == 2){
            result = "TUE";
        }else if(cnt%7 == 3){
            result = "WED";
        }else if(cnt%7 == 4){
            result = "THU";
        }else if(cnt%7 == 5){
            result = "FRI";
        }else if(cnt%7 == 6){
            result = "SAT";
        }

        System.out.println(result);
    }
}
