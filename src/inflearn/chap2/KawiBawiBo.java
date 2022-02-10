package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//입력 2 3 3 1 3
//    1 1 2 2 3
//출력 A B A B D
//1:가위, 2:바위, 3:보
//1 < 2, 1 > 3, 2 < 3
public class KawiBawiBo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String firstPerson = br.readLine();
        String secondPerson = br.readLine();
        for (String s : solution(firstPerson, secondPerson)) {
            System.out.println(s);
        }
    }

    private static List<String> solution(String firstPerson, String secondPerson) {
        List<Integer> first = Arrays.stream(firstPerson.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(secondPerson.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < first.size(); i++) {
            if(first.get(i) == second.get(i)){
                answer.add("D");
            }else if (first.get(i) == 1 && second.get(i) == 3 || first.get(i) == 2 && second.get(i) == 1 || first.get(i) == 3 && second.get(i) == 2){
                answer.add("A");
            }else{
                answer.add("B");
            }
        }
        return answer;
    }
}
