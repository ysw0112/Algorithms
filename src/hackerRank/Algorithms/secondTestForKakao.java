package hackerRank.Algorithms;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result2 {

    /*
     * Complete the 'deleteProducts' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ids
     *  2. INTEGER m
     */

    public static int deleteProducts(List<Integer> ids, int m) {
        // Write your code here
        int[] checkArr = new int[ids.size()];
        int count = 0;

        for (int i=0; i<ids.size(); i++){
            checkArr[ids.get(i)-1]++;
        }
        Arrays.sort(checkArr);

        for (int i=0; i<checkArr.length; i++){
            if(m - checkArr[i] >= 0){
                m = m - checkArr[i];
                checkArr[i] = 0;
            }else if(m == 0){
                break;
            }
            else{
                checkArr[i] = Math.abs(m-checkArr[i]);
                break;
            }
        }

        for (int i=0; i<checkArr.length; i++){
            if(checkArr[i]>0) count++;
        }

        return count;
    }

}

public class secondTestForKakao {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int idsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ids = new ArrayList<>();

        for (int i = 0; i < idsCount; i++) {
            int idsItem = Integer.parseInt(bufferedReader.readLine().trim());
            ids.add(idsItem);
        }

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result2.deleteProducts(ids, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

