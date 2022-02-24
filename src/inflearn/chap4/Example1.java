package inflearn.chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
학급 회장 선출하기
첫줄에 N의 학생수가 입력되고 두번째 줄에는 투표용지에 쓰여져 있는 후보의 기호가 적혀있다.
가장 많이 입력된 후보가 학생회장이 된다.
입력
15
BACBACCACCBDEDE
출력
C
 */
public class Example1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(br.readLine()).intValue();
        String value = br.readLine();
        solution(value);
    }

    //value.toCharArray로 Map<Character, Integer> 맵으로도 활용가능
    private static void solution(String value) {
        int max = 0;
        String answer = "";
        Map<String, Integer> result = new HashMap<>();
        List<String> values = Arrays.stream(value.split("")).collect(Collectors.toList());
        for (String v : values) {
//            if(result.containsKey(v)){
//                result.put(v, result.get(v).intValue()+1);
//            }else{
//                result.put(v, 1);
//            }
            result.put(v, result.getOrDefault(v, 0)+1);
        }

        for (String key : result.keySet()) {
            int keyValue = result.get(key).intValue();
            if(max < keyValue) {
                max = keyValue;
                answer = key;
            }
        }
        System.out.println(answer);
    }
}
