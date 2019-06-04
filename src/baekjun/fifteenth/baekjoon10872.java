package baekjun.fifteenth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10872 {
  public static int factorial(int n){
    if(n < 2){
      return 1;
    }else{
      return n * factorial(n-1);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.valueOf(br.readLine());
    System.out.println(factorial(input));
  }
}
