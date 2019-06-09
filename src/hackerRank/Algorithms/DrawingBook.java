package hackerRank.Algorithms;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {
  /*
   * Complete the pageCount function below.
   */
  static int pageCount(int n, int p) {
    /*
     * Write your code here.
     */
    if(p == 1){
      return 0;
    }else if(n%2 == 0 && p%2 == 1){
      return Math.min(p/2, (n-p)/2) == 0 ? Math.min(p/2, (n-p)/2) + 1 : Math.min(p/2, (n-p)/2);
    }
    return Math.min(p/2, (n-p)/2);
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

    int p = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

    int result = pageCount(n, p);
    System.out.println(result);
    scanner.close();
  }
}
