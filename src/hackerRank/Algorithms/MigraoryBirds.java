package hackerRank.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MigraoryBirds {

  // Complete the migratoryBirds function below.
  static int migratoryBirds(List<Integer> arr) {
    int result = 0;
    int maxValue = arr.stream().max(Integer::compareTo).get();
    int[] tempArr = new int[maxValue+1];
    for(Integer value : arr){
      tempArr[value]++;
    }
    int[] cArr = tempArr.clone();
    Arrays.sort(cArr);
    for (int i=0; i<tempArr.length; i++){
      if(cArr[cArr.length-1] == tempArr[i]) {
        result = i;
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

    String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    List<Integer> arr = new ArrayList<>();

    for (int i = 0; i < arrCount; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr.add(arrItem);
    }

    int result = migratoryBirds(arr);
    System.out.println(result);
    bufferedReader.close();
  }
}

