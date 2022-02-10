package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력 10
//출력 1 1 2 3 5 8 13 21 34 55
public class FiboBasic {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine()).intValue();
//        for (int i = 1; i <= input; i++) {
//            System.out.print(solution(i) + " ");
//        }
        solution2(input);
    }
    //Time Limited
    private static int solution(int input) {
        if(input == 1 || input == 2) return 1;
        return solution(input-1) + solution(input-2);
    }

    //
    private static void solution2(int input) {
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < input; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
