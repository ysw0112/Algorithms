package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력 20
//출력 8
public class Eratosthenes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine()).intValue();
        System.out.println(solution(input));
    }

    private static int solution(int input) {
        int cnt = 0;
        for (int i = 2; i < input; i++) {
            if (i == 2 || i == 3) cnt ++;
            else if(i%2 != 0 && i%3 != 0) cnt ++;
        }
        return cnt;
    }
}
