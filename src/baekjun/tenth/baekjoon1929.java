package baekjun.tenth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        int m = Integer.parseInt(read.split(" ")[0]);
        int n = Integer.parseInt(read.split(" ")[1]);

        int[] result = new int[n+1];

        for (int i=0; i<n; i++){
            result[i]=0;
        }
        result[1]=1; // 1은 소수가 아니다.

        for(int i=2; i<n; i++){
            for (int j=2; i*j <= n; j++){
                result[i*j] = 1;
            }
        }

        for (int i=m; i<=n; i++){
            if(result[i] == 0) System.out.println(i);
        }
    }
}
