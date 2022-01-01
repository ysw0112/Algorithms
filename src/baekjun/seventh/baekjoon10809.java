package baekjun.seventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baekjoon10809 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        int[] inputArr = new int[input.length()];
//        int[] asciiArr = new int[26];
//        int asciia = 97;
//
//        if(input.length() > 100) return;
//
//        for(int i=0; i<asciiArr.length; i++){
//            asciiArr[i] = asciia;
//            asciia++;
//        }
//
//        for( int i=0; i<input.length(); i++) {
//            int check = Integer.valueOf(input.split("")[i].charAt(0));
//            if(check < 97 || check > 122) return;
//            inputArr[i] = check;
//        }
//        for (int j=0; j<input.length(); j++){
//            for (int k=j+1; k<input.length(); k++){
//                if(inputArr[j] == inputArr[k]){
//                    inputArr[k] = -1;
//                }
//            }
//        }
//        for( int i=0; i<input.length(); i++) {
//            for (int j=0; j<asciiArr.length; j++){
//                if(asciiArr[j] == inputArr[i]){
//                    asciiArr[j] = i;
//                }
//            }
//        }
//
//        for (int i=0; i<asciiArr.length; i++){
//            if(asciiArr[i] > 97){
//                asciiArr[i] = -1;
//            }
//            System.out.print(asciiArr[i]+" ");
//        }
        Scanner sc = new Scanner(System.in);


        String s = sc.next();

        int[] counts = new int['z' - 'a' + 1];

        char[] inputs = s.toCharArray();


        for (int i = 0; i < counts.length; i++) {

            counts[i] = -1;

        }


        for (int i = 0; i < inputs.length; i++) {

            int tmp = inputs[i] - 'a';

            if (counts[tmp] == -1)

                counts[tmp] = i;

        }


        for (int i = 0; i < counts.length; i++) {

            System.out.print(counts[i] + " ");

        }
    }
}
