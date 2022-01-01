package baekjun.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon10870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputValue = Integer.valueOf(br.readLine()).intValue();
//        //일반 for 구문
//        List<Integer> targetList = new ArrayList<>();
//        for (int i=0; i<=inputValue; i++){
//            if(i == 0 || i == 1){
//                targetList.add(i, i);
//            }else{
//                targetList.add(i,targetList.get(i-1) + targetList.get(i-2));
//            }
//        }
//        System.out.println(targetList.get(inputValue));
        // 재귀 함수를 이용한 해결
        System.out.println(recursion(inputValue));
    }

    public static int recursion(int num){
        if (num == 0){
            return 0;
        }
        return num + recursion(num -1);
    }
}
