package hackerRank.Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class betweenTwoSets {
  public static int gcd(int a, int b) {
    while (a > 0 && b > 0) {
      System.out.println(a + " " + b);
      if (a >= b) {
        a = a % b;
      }
      else {
        b = b % a;
      }
    }

    return a + b;
  }
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    String inputValue = br.readLine();
//    int n = Integer.valueOf(inputValue.split(" ")[0]);
//    int m = Integer.valueOf(inputValue.split(" ")[1]);
//
//    int[] a = new int[n];
//    for (int i=0; i<n; i++){
//      a[i] = br.read();
//    }
//    int[] b = new int[m];
//    for (int i=0; i<m; i++){
//      b[i] = br.read();
//    }
//    System.out.println(a.length+ " " + b.length);

    System.out.println(gcd(72,126));
  }
}
