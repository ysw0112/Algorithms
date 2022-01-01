package baekjun.eighth;

import java.io.*;

public class baekjoon2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int result = 1;
        int check = 1;
        int count = 6;
        while (true) {
            if (input <= check) {
                break;
            }
            check += count;
            count += 6;
            result++;
        }

        bw.write(result + "");
        bw.flush();

        br.close();
        bw.close();
    }
}
