package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
두 배열의 공통원소를 오름차순으로 출력
입력
5
1 3 9 5 2
5
3 2 5 7 8
출력
2 3 5

 */
public class CommonElement {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstArrayCount = Integer.valueOf(br.readLine()).intValue();
        List<Integer> first = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        int secondArrayCount = Integer.valueOf(br.readLine()).intValue();
        List<Integer> second = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
//        solution(first, second);
        System.out.println(false && false);
    }

    private static void solution(List<Integer> first, List<Integer> second) {
        int p1 = 0;
        int p2 = 0;
        first.sort(Comparator.naturalOrder());
        second.sort(Comparator.naturalOrder());
        List<Integer> answer = new ArrayList<>();
        while (p1 < first.size() && p2 < second.size()){
            int firstValue = first.get(p1).intValue();
            int secondValue = second.get(p2).intValue();
            if(firstValue < secondValue){
                p1++;
            }else if(firstValue > secondValue){
                p2++;
            }else if(firstValue == secondValue){
                answer.add(firstValue);
                p1++;
                p2++;
            }
        }
        System.out.println(answer.stream().map(String::valueOf).collect(Collectors.joining(" ")));;
    }
}
