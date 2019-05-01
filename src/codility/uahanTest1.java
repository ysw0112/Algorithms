package codility;

import java.util.Scanner;

public class uahanTest1 {
    public static void main(String[] args){
        String leapYear = "Leap Year";
        String notLeapYear = "Not Leap Year";

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 1){
            return;
        }
        if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
            System.out.println(leapYear);
        }else{
            System.out.println(notLeapYear);
        }

    return;
    }
}
