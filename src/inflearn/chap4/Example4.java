package inflearn.chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
모든 아나그램 찾기
S문자열에 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하여라
아나그램 판별시 대소문자 구분되며, 부분문자열은 연속된 문자열이어야한다.
입력
bacaAacba
abc
출력
3

출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 */
public class Example4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        solutionOfSlideWindow(s, t);
    }

    private static void solution(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        HashMap<Character, Integer> actualMap = new HashMap<>();
        HashMap<Character, Integer> tempMap = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < tCharArray.length; i++) {
            actualMap.put(tCharArray[i], actualMap.getOrDefault(tCharArray[i], 0)+1);
        }
        for (int i = 0; i < sCharArray.length-t.length()+1; i++) {
            boolean isMatch = true;
            int cnt=0;
            int j = i;
            while (cnt < t.length()){
                char c = sCharArray[j];
                if(!actualMap.containsKey(c)){
                    break;
                }else {
                    tempMap.put(c, tempMap.getOrDefault(c, 0)+1);
                }
                j++;
                cnt++;
            }

            for (Character character : actualMap.keySet()) {
                if(actualMap.get(character) != tempMap.getOrDefault(character, 0)){
                    isMatch = false;
                }
            }
            //temp map 초기화
            for (Character character : tempMap.keySet()) {
                tempMap.put(character, 0);
            }
            if(isMatch) answer++;
        }
        System.out.println(answer);
    }

    //map slide window 활용
    private static void solutionOfSlideWindow(String s, String t) {
        HashMap<Character, Integer> actualMap = new HashMap<>();
        HashMap<Character, Integer> tempMap = new HashMap<>();
        char[] tCharArray = t.toCharArray();
        char[] sCharArray = s.toCharArray();
        int answer = 0;

        for (int i = 0; i < tCharArray.length; i++) {
            actualMap.put(tCharArray[i], actualMap.getOrDefault(tCharArray[i], 0)+1);
        }

        //slide window전 비교 대상 문자열의 -1 길이만큼 맵에 PUT
        int slideWindowLength = tCharArray.length - 1;
        for (int i = 0; i < slideWindowLength; i++) {
            tempMap.put(sCharArray[i], tempMap.getOrDefault(sCharArray[i], 0)+1);
        }

        //slide window 오른쪽으로 한칸씩 밀면서 비교
        int lt = 0;
        for (int rt = slideWindowLength; rt < sCharArray.length; rt++) {
            tempMap.put(sCharArray[rt], tempMap.getOrDefault(sCharArray[rt], 0)+1);
            if(actualMap.equals(tempMap)) answer++;
            tempMap.put(sCharArray[lt], tempMap.get(sCharArray[lt])-1);
            if(tempMap.get(sCharArray[lt]) == 0) tempMap.remove(sCharArray[lt]);;
            lt++;
        }
        System.out.println(answer);
    }
}
