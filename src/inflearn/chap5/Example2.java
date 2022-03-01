package inflearn.chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/*
괄호문자제거
입력된 문자열에서 소괄호() 사이에 존재하는 모든 문잘ㄹ 제거하고 남은 문자만 출력
입력
(A(BC)D)EF(G(H)(IJ)K)LM(N)
출력
EFLM
 */
public class Example2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        solution(input);
    }

    private static void solution(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        Deque<Character> reversedDeque = new ArrayDeque<>();
        char[] charArrayOfInput = input.toCharArray();
        for (int i = 0; i < charArrayOfInput.length; i++) {
            char eachChar = charArrayOfInput[i];
            if(eachChar == ')'){
                while (true){
                    Character popChar = deque.pop();
                    if(popChar == '(') break;
                }
            }else{
                deque.push(eachChar);
            }
        }
        Iterator<Character> iterator = deque.iterator();
        while (iterator.hasNext()){
            reversedDeque.push(iterator.next());
        }

        Iterator<Character> reversedIterator = reversedDeque.iterator();
        while (reversedIterator.hasNext()){
            System.out.print(reversedIterator.next());
        }
    }
}
