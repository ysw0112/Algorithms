package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
최대 길이 연속 부분 수열
0과1로 구성된 N길이를 가진 수열이 주어진다. 이 수열에서 최대 k번 0을 1로 변경 가능.
n과 k과 주어진다면 1로만 구성된 최대 길이의 연속부분수열을 찾아라
입력
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1
출력
8

투 포인트 알고리즘으로 해결
 */
public class Example6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int changeCount = input[1];
        int[] value = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        solution(value, changeCount);
    }

    private static void solution(int[] value, int changeCount) {
        int max = 0;
        int tmp = 0;
        int j = 0;
        int count = changeCount;
        for (int i = 0; i < value.length; i++) {
            if(value[i] == 0 ){
                if(count == 0){
                    while (count == 0){
                        if(value[j]==0){
                            count++;
                        }
                        tmp--;
                        j++;
                    }
                }
                if(count != 0){
                    tmp++;
                    count--;
                }
            }else{
                tmp += value[i];
            }
            if(max < tmp){
                max = tmp;
            }
        }
        System.out.println(max);
    }
}
