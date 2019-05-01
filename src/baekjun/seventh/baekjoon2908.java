package baekjun.seventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = new String[2];
        int max = 0;


        inputArr = br.readLine().split(" ");
        for(int i=0; i<inputArr.length; i++){
            String check = inputArr[i];
            String temp = "";
            for (int j=check.length()-1; j>-1; j--){
                if(check.charAt(j) == '0') return;
                temp += check.charAt(j);
            }
            inputArr[i] = temp;
        }
        for (int i=0; i<2; i++){
            if(max < Integer.parseInt(inputArr[i])){
                max = Integer.parseInt(inputArr[i]);
            }
        }
        System.out.println(max);
    }
}
