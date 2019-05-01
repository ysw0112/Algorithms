package codility;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input ="";
        int memoCnt = 0;
        List<String> memoList = new ArrayList<String>();

        while((input = br.readLine()) != null){
            memoList.add(input);

            if(input.equals("END")){
                break;
            }
        }
        System.out.println(memoList);
        String matchPattern = "^(\\W?\\d{2}|\\W?\\d{4})\\D(0?[1-9]|1[012])\\D(0?[1-9]\\W?|[12][0-9]\\W+)$";

        for(int i=0; i<memoList.size(); i++){
            String[] checkRegex = memoList.get(i).split("\\s+");
            for(int j=0; j<checkRegex.length;	j++){
                if(checkRegex[j].matches(matchPattern)){
                    System.out.println(checkRegex[j].replace("\"",""));
                }
            }
        }
    }
}