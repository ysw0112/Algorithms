package uahan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;

public class first {
  static int totalCount = 0;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    int targetNumber = Integer.valueOf(br.readLine());
    int selectNumber = 3;

    String[] splitInputData = input.split(" ");
    int[] stringToIntArray = Arrays.asList(splitInputData).stream().mapToInt(Integer::parseInt).sorted().distinct().toArray();
    int[] tempArr = new int[stringToIntArray.length];

    if (stringToIntArray.length > 20) throw new InputMismatchException("입력값 초과");

    doCombination(tempArr, stringToIntArray.length, selectNumber, 0, 0, stringToIntArray, targetNumber);
    if(totalCount == 0){
      System.out.println("NO");
    }
  }

  public static void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr, int targetNumber){
    if(r == 0){
      int sum = 0;
      for(int i=0; i<index; i++) {
        sum += arr[combArr[i]];
      }
      if(sum == targetNumber) {
        System.out.println(arr[combArr[0]]+" "+arr[combArr[1]]+" "+arr[combArr[2]]);
        totalCount++;
      }

    }else if(target == n) return;
    else{
      combArr[index] = target;
      doCombination(combArr, n, r-1, index+1, target+1, arr, targetNumber); // (i)
      doCombination(combArr, n, r, index, target+1, arr, targetNumber); //(ii)
    }
  }
}
// INPUT
//1 2 3 4 5
//8
// OUTPUT
//1 2 5
//1 3 4
