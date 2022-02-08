package inflearn.chap1String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력 - g0en2T0s8eSoft
//출력 - 208
public class TakeNumeric {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }
    public static final int solution(String input){
        int answer = 0;
        char[] inputChars = input.toCharArray();
        for (int i = 0; i < inputChars.length; i++) {
            if(Character.isDigit(inputChars[i])) answer = answer * 10 + Character.getNumericValue(inputChars[i]);
        }
        return answer;
    }

}
