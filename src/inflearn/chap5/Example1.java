package inflearn.chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
올바른괄호
입력
(()(()))(()
출력
NO
 */
public class Example1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        solution(input);
    }

    private static void solution(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = input.toCharArray();
        String answer = "YES";
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if(aChar == '(') {
                deque.push(aChar);
            }else if(aChar == ')'){
                if(deque.isEmpty()) {
                    answer = "NO";
                    break;
                }
                deque.pop();
            }
        }
        if(!deque.isEmpty()) answer = "NO";
        System.out.println(answer);
    }

}
