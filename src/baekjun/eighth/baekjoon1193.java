package baekjun.eighth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int cnt = 1;

        while(true){
            for(int i=1; i<input; i++){
                int k = 1;
                if (i%2 == 0){
                    for (int j=i; j>0; j--){
                        if(input == cnt){
                            System.out.println(k+"/"+j);
                            return;
                        }
                        cnt++;
                        k++;
                    }
                }else{
                    for (int j=i; j>0; j--){
                        if(input == cnt){
                            System.out.println(j+"/"+k);
                            return;
                        }
                        cnt++;
                        k++;
                    }
                }
            }
        }
    }
}
