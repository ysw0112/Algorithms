package hackerRank.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatAndMouse {

  // Complete the catAndMouse function below.
  static String catAndMouse(int x, int y, int z) {
    String result = "";
    int catA = Math.abs(x-z);
    int catB = Math.abs(y-z);

    if(catA == catB){
      result = "Mouse C";
    }else if(catA > catB){
      result = "Cat B";
    }else if(catA < catB){
      result = "Cat A";
    }
    return result;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    int q = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int qItr = 0; qItr < q; qItr++) {
      String[] xyz = scanner.nextLine().split(" ");

      int x = Integer.parseInt(xyz[0]);

      int y = Integer.parseInt(xyz[1]);

      int z = Integer.parseInt(xyz[2]);

      String result = catAndMouse(x, y, z);

      System.out.println(result);
    }


    scanner.close();
  }
}
