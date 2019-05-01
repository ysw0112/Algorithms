package baekjun.seventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int checkCnt =0;
        int tmp= 0;

        String[] inputArr = new String[cnt];

        for (int i=0; i<cnt; i++){
            String input = br.readLine();
            boolean[] checkArr = new boolean[26];
            for (int j=0; j<input.length(); j++){
                int check = input.charAt(j)-97;

                if (checkArr[check] == false) {
                    checkArr[check]=true;
                    tmp = check;

                    while (true){
                        j++;
                        if(j == input.length()) break;
                        if(tmp != input.charAt(j)-97){
                            j--;
                            break;
                        }
                    }
                }else if(checkArr[check] == true){
                    checkCnt++;
                    break;
                }
            }
        }
        System.out.println(cnt-checkCnt);
    }
}
