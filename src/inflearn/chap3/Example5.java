package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
연속된 자연수의 합
양의 정수 N이 입력되면 2 개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법 가짓수 출력
N = 15면
7+8, 4+5+6, 1+2+3+4+5
와 같이 3가지가 출력됨
입력
15
출력
3
 */
public class Example5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine()).intValue();
        solution(input);
    }

    //이 방법말고도 Two Pointer를 활용하여도 풀 수 있다.
    private static void solution(int input) {
        int[] values = new int[input];
        int answer = 0;
        int tmp = 1;
        for (int i = 0; i < input; i++) {
            values[i]=tmp++;
        }

        for (int i = 0; i < input; i++) {
            int value = 0;
            int j = i;
            int cycle = 1;
            while (j < input){
                value += values[j++];
                if (value == input && cycle > 1){
                    answer++;
                    break;
                }else if(value > input){
                    break;
                }
                cycle++;
            }
        }
        System.out.println(answer);
    }
}
