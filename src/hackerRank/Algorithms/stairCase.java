package hackerRank.Algorithms;

import java.util.*;

public class stairCase {
    // Complete the staircase function below.
    static void staircase(int n) {

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(n - i - 1 <= j){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
