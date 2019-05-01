package baekjun.first;

import java.util.Scanner;

public class subtract {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        String[] result = c.nextLine().split(" ");
        if(result.length > 2){
            return;
        }

        int temp = 0;
        int step = 1;
        for(String sum : result){
            int value = Integer.parseInt(sum);

            if(value > 0 && value < 10){
                if(step == 2){
                    value = value * -1;
                }
                temp += value;
            }else{
                return;
            }
            step++;
        }
        System.out.println(temp);
    }
}
