package hackerRank.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

  // Complete the sockMerchant function below.
  static int sockMerchant(int n, int[] ar) {
    //카운팅 소트
    //map 활용
//    int result = 0;
//    Arrays.sort(ar);
//    for (int i=0; i<ar.length; i++){
//      int current = ar[i];
//      for (int j=i+1; j<ar.length; j++){
//        if(current == ar[j]) {
//          i ++;
//          result ++;
//          break;
//        }
//      }
//    }
//    return result;
    int result = 0;
    Map<Integer, Integer> tempMap = new HashMap<>();
    for(Integer value : ar){
      if(tempMap.get(value) != null){
        tempMap.put(value, tempMap.get(value)+1);
      }else{
        tempMap.put(value, 1);
      }
    }

    for(Integer count : tempMap.values()){
      result += count/2;
    }

    return result;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] ar = new int[n];

    String[] arItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int arItem = Integer.parseInt(arItems[i]);
      ar[i] = arItem;
    }

    int result = sockMerchant(n, ar);
    System.out.println(result);
    scanner.close();
  }
}

