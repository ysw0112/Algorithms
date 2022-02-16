package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindInputStringValue {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String values = br.readLine();
            String findValue = br.readLine();
            int solution = solution(values, findValue);
            System.out.println(solution);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(String values, String findValue) {
        int answer = 0;
        char findChar = findValue.toLowerCase().charAt(0);
        char[] lowerCaseValues = values.toLowerCase().toCharArray();
        for (char lowerCaseValue : lowerCaseValues) {
            if(lowerCaseValue == findChar){
                answer++;
            }
        }
        return answer;
    }
}
