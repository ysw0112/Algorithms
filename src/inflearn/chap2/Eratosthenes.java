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
//        System.out.println(solution(input));
        System.out.println(solution2(input));
    }
    // 2와3의 배수로만 소수를 찾으려고 했기 때문에 오답,
    private static int solution(int input) {
        int cnt = 0;
        for (int i = 2; i < input; i++) {
            if (i == 2 || i == 3) {
                cnt ++;
            }
            else if(i%2 != 0 && i%3 != 0) {
                cnt ++;
            }
        }
        return cnt;
    }
    // 2부터 n까지 각 배수를 체크면서 소수를 걸러냄.
    private static int solution2(int input){
        int cnt = 0;
        int[] answer = new int[input+1];
        for (int i = 2; i < answer.length; i++) {
            if (answer[i] == 0) {
                cnt++;
                //i의 배수만큼 체크하기 위함 j=j+i
                for (int j = i; j < answer.length; j=j+i) {
                    answer[j]=1;
                }
            }
        }
        return cnt;
    }
}
