package baekjun.fourteenth;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon2747 {
//  public static int solution(int i){
//    if(i < 2){
//      return i;
//    }else{
//      return solution(i - 2) + solution(i - 1);
//    }
//  };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.valueOf(br.readLine());

        Long a = 0L;
        Long b = 0L;
        Long c = 1L;

        for (int j = 1; j < input; j++) {
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(c);
    }
}
