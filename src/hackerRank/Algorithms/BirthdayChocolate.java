package hackerRank.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayChocolate {

  // Complete the birthday function below.
  static int birthday(List<Integer> s, int d, int m) {
    int result = 0;
    int count = s.size();
    System.out.println("count " + count);
    int i = 0;
    while (i+m <= count){
      int sum = 0;
      for (int j=i; j<i+m; j++){
        sum += s.get(j);
        System.out.println(i + " " + m + " "+ sum);
      }
      if(sum == d){
        result++;
      }
      i++;
    }

    return result;
  };

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    List<Integer> s = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int sItem = Integer.parseInt(sItems[i]);
      s.add(sItem);
    }

    String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int d = Integer.parseInt(dm[0]);

    int m = Integer.parseInt(dm[1]);

    int result = birthday(s, d, m);
    System.out.println("result is : " +result);

    bufferedReader.close();
  }
}