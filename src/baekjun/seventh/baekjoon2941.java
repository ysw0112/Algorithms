package baekjun.seventh;

import java.io.*;

public class baekjoon2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().trim();
        String[] croatia = {"c=","c-","dz=","de-","lj","nj","s=","z="};

        for (int i=0; i<croatia.length; i++){
            if(input.contains(croatia[i])){
                input = input.replaceAll(croatia[i],"*");
            }
        }

        bw.write(input.length()+"");
        bw.flush();

        br.close();
        bw.close();
    }
}
