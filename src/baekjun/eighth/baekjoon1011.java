package baekjun.eighth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCount; i++) {
            String[] input = br.readLine().split(" ");
            int floor = Integer.parseInt(input[0]);
            int room = Integer.parseInt(input[1]);
            int guest = Integer.parseInt(input[2]);

            int floorResult = guest % floor;
            int roomResult = guest / floor + 1;

            if (floorResult == 0) {
                floorResult = floor;
                roomResult--;
            }

            String roomCheck = String.valueOf(roomResult);
            if (roomCheck.length() == 1) {
                roomCheck = "0" + roomCheck;
            }
            String result = String.valueOf(floorResult) + roomCheck;
            System.out.println(result);

        }
    }
}
