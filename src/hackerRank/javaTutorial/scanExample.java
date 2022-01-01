package hackerRank.javaTutorial;

import java.util.Scanner;
import java.io.BufferedReader;


class scanExampale {
    public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    int i = scan.nextInt();
//    double d = scan.nextDouble();
//    String s = scan.nextLine();
//    System.out.println(s);
//    if(scan.hasNextLine()) s = scan.nextLine();
//    // Write your code here.
//    System.out.println("String: " + s);
//    System.out.println("Double: " + d);
//    System.out.println("Int: " + i);

        Scanner sc = new Scanner("java 100\ncpp 65\npython 50");
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line

            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
        System.out.println(2 + "string");
    }
}