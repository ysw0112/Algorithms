package baekjun.forth;

import java.io.*;

public class beakjoon4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseCnt = Integer.parseInt(br.readLine());
        String[] testCase = new String[testCaseCnt];

        int caseCnt = 0;

        for (int i=0; i<testCaseCnt; i++){
            int sum = 0;
            int average = 0;
            int avgUpStudentCnt = 0;

            testCase[i] = br.readLine();
            caseCnt = Integer.parseInt(testCase[i].split(" ")[0]);

            for (int j=1; j<=caseCnt; j++){
                sum += Integer.parseInt(testCase[i].split(" ")[j]);
            }
            average = sum/caseCnt;

            for (int j=1; j<=caseCnt; j++){
                if (Integer.parseInt(testCase[i].split(" ")[j]) > average){
                    avgUpStudentCnt++;
                }
            }
            System.out.println(String.format("%.3f",(double)avgUpStudentCnt/caseCnt*100)+"%");
        }
    }
}
