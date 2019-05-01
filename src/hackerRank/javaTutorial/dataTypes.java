package hackerRank.javaTutorial;

import java.util.Scanner;

public class dataTypes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    for(int i=0; i<t; i++){
      try{
        Long x = sc.nextLong();
        System.out.println(x+" can be fitted in:");
        if(x>=-128 && x<=127)System.out.println("* byte");
        if(x>=-32768 && x<=32767)System.out.println("* short");
        if(x>=-0x80000000 && x<=0x7fffffff)System.out.println("* int");
        if(x>=-0x8000000000000000L && x<=0x7fffffffffffffffL)System.out.println("* long");
      }catch (Exception e){
        System.out.println(sc.next()+" can't be fitted anywhere.");
      }
    }
  }
}
