package inflearn.chap1String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordInSentence {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = br.readLine();
            System.out.println(solution(input));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(String input){
        int max = Integer.MIN_VALUE;
        String answer="";
        String[] splitInput = input.split(" ");
        for (String value : splitInput) {
            if (value.length() > max){
                answer = value;
            }
        }
        return answer;
    }
}
