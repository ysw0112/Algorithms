package kakao;

import java.util.*;
import java.util.stream.Stream;

public class kakaoGameFailPersent {
    public static int[] solution(int N, int[] stages) {
        String[] sortArr = new String[N];
        int[] answer = new int[N];
        HashMap<Double, Integer> userMap = new HashMap<>();
        int userCount = stages.length;
        int clearCount = 0;

        for (int i=1; i<N+1; i++){
            userCount = userCount - clearCount;
            clearCount = 0;
            for (int j=0; j<stages.length; j++){
                if(stages[j] == i){
                    clearCount++;
                }
            }
            sortArr[i-1] = String.valueOf(clearCount/(double)userCount)+"===="+i;
//            userMap.put(clearCount/(double)userCount,i-1);
        }

        String temp = "";
        for(int i=0; i<sortArr.length; i++){
            for(int j=i+1; j<sortArr.length; j++){
                double d1 = Double.parseDouble(sortArr[i].split("====")[0]);
                double d2 = Double.parseDouble(sortArr[j].split("====")[0]);
                if(d1 < d2){
                    temp = sortArr[i];
                    sortArr[i] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
            System.out.println(sortArr[i]);
        }
//         userMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).map(s -> s);
//        Stream<Map.Entry<Integer, Double>> sorted = userMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
//        sortArr = sorted.toArray();
//        for (int i=0; i<sortArr.length; i++){
//            answer[i] = Integer.parseInt(String.valueOf(sortArr[i]).split("=")[0])+1;
//        }

        return answer;
    }
    public static void main(String[] args){
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        solution(5, stages);
//        System.out.println(3.0-1);
    }
}
