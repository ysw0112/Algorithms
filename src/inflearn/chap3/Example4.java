package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
연속 부분 수열
N개의 수로 이루어진 수열중 연속부분수열의 합이 M이 되는 경우가 몇 번인지 출력
입력
N = 8, M = 6
1 2 1 3 1 1 1 2
출력
3
 */
public class Example4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] condition = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] values = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        solution2(values, condition[1]);
    }

    //시간 복잡도 O(n * n)
    private static void solution(int[] values, int target) {
        int answer = 0;
        for (int i = 0; i < values.length; i++) {
            int tmp = 0;
            for (int j = i; j < values.length; j++) {
                tmp += values[j];
                if (tmp == target){
                    answer++;
                    break;
                }else if(tmp > target){
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    //slide window
    private static void solution2(int[] values, int target){
        int answer = 0;
        int leftTarget = 0;
        int rightTarget = 0;
        int max = 0;
        // actual slide window
        for (int i = 0; i < values.length; i++) {
            max += values[i];
            if(max == target){
                answer++;
            }else if(max > target){
                while (max >= target){
                    max -= values[leftTarget++];
                    if(max == target) answer++;
                }
            }
        }
        //my slide window
//        while (rightTarget < values.length){
//            if(target == max) {
//                answer++;
//                max = max + values[rightTarget++];
//            }else if(target > max){
//                max = max + values[rightTarget++];
//            }else if(target < max){
//                max = max - values[leftTarget++];
//            }
//        }
//
//        if(max == target){
//            answer++;
//        }
//
//        for (int i = leftTarget; i < values.length; i++) {
//            max = max - values[i];
//            if(target == max) {
//                answer++;
//            }
//        }
        System.out.println(answer);
    }
}
