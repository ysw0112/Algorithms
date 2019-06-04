package baekjun.fifteenth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11050 {
  public static int factorial(int i){
    if(i < 2) return 1;
    return i * factorial(i - 1);
  };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");
    int n = Integer.valueOf(input[0]);
    int k = Integer.valueOf(input[1]);
    int result = 0;

    result = factorial(n)/(factorial(k)*factorial(n-k));

    System.out.println(result);
  }
}
