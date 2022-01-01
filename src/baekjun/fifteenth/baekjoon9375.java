package baekjun.fifteenth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class baekjoon9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(br.readLine());

        for (int i = 0; i < count; i++) {
            int result = 1;
            int clothCount = Integer.valueOf(br.readLine());
            Map<String, Integer> cMap = new HashMap<>();
            for (int j = 0; j < clothCount; j++) {
                String input = br.readLine();
                String cloth = input.split(" ")[0];
                String type = input.split(" ")[1];
                if (cMap.containsKey(type)) {
                    cMap.put(type, cMap.get(type) + 1);
                } else {
                    cMap.put(type, 1);
                }
            }

            for (String key : cMap.keySet()) {
                result *= cMap.get(key) + 1;
//        System.out.println(key + " " +cMap.get(key));
            }
            System.out.println(result - 1);
        }
    }
}
