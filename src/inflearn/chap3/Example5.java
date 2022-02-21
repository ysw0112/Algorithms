package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine()).intValue();
        solution(input);
    }

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
