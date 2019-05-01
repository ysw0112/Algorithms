package baekjun.second;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){

        Scanner c = new Scanner(System.in);
        String[] result = c.nextLine().split(" ");
        int step = 0;
        double temp = 0.0d;

        if(result.length > 2){
            return;
        }else{
            for(int i=0; i<result.length; i++){
                double value = Double.parseDouble(result[i]);

                if(value > 0 && value < 10){
                    if(step == 0){
                        temp = value;
                    }else{
                        temp = temp/value;
                    }

                }
                step++;
            }
        }
        System.out.println(temp);
    }
}
