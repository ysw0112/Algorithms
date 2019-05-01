package baekjun.tenth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        int[] result = new int[inputCount];
        String input = br.readLine();

        int count = 0;
        for(int i=0; i<inputCount; i++){
            result[i] = Integer.parseInt(input.split(" ")[i]);
            int temp = result[i];
            if(temp == 2) count++;
            else if(temp != 1){
                for (int j=2; j<temp; j++){
                    if(temp%j == 0) break;
                    else if(j == temp - 1)
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
