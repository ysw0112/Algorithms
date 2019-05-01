package hackerRank.javaTutorial;

        import java.util.Scanner;

public class javaLoops2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    for(int i=0; i<t; i++){
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int result = 0;
      for(int j=0; j<c; j++){
        if(j == 0) result = a + (int)Math.pow(2,j) * b;
        else result = result + (int)Math.pow(2,j) * b;
        System.out.print(result+" ");
      }
      System.out.println();
    }
  }
}
