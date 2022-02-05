package inflearn.chap1String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeUpperLower {

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
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for (char value : input.toCharArray()) {
            if (value >= 97){
                sb.append((char) (value - 32));
            }else{
                sb.append((char) (value + 32));
            }
        }

        return sb.toString();
    }
}
