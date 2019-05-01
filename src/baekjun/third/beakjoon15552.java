package baekjun.third;

import java.io.*;

public class beakjoon15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int count=0;

        String value ="";
        count = Integer.parseInt(r.readLine());

        if(count > 1000000) return;

        for (int i=0; i<count; i++){
            value = r.readLine();
            String[] temp = value.split(" ");
            w.write( Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
        }
        w.flush();
    }
}

