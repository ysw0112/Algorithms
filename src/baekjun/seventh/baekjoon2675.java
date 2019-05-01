package baekjun.seventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String result = "";

        for(int i=0; i<cnt; i++){
            String[] input = br.readLine().split(" ");
            String resultConcat ="";
            int k = Integer.parseInt(input[0]);
            if(k>0 && k<9){
               result = input[1];
               if(result.length() < 1 || result.length() > 20) return;
               for(int j=0; j<result.length(); j++){
                   for (int z=0; z<k; z++){
                       resultConcat += String.valueOf(result.charAt(j));
                   }
               }
                System.out.println(resultConcat);
            }
        }
    }
}
