package codility;

import java.io.*;

public class Goorm1 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input= "";
            int answer = 0;
        try {
            input = br.readLine();
            answer = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] inputArr = input.split("\\s+");

        for(int i=0; i<inputArr.length; i++){

            System.out.println(inputArr[i]);
        }
    }
}
