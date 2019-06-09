package kakao;

import java.util.HashMap;

public class kakaoChatting {
    public static void solution(String[] record) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        int recordCnt = record.length;
        int cnt = 0;
        int changeCnt = 0;


        for (int i = 0; i < recordCnt; i++) {
            String[] check = record[i].split(" ");
            if (check[0].equals("Enter")) {
                userMap.put(check[1], check[2]);
            } else if (check[0].equals("Change")) {
                userMap.put(check[1], check[2]);
                changeCnt++;
            }
        }

        String[] answer = new String[recordCnt - changeCnt];

        for (int i = 0; i < recordCnt; i++) {
            String[] check = record[i].split(" ");
            if (check[0].equals("Enter")) {
                answer[cnt] = userMap.get(check[1]) + "님이 들어왔습니다.";
                cnt++;
            } else if (check[0].equals("Leave")) {
                answer[cnt] = userMap.get(check[1]) + "님이 나갔습니다.";
                cnt++;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static void main(String[] args) {
        String[] input = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        solution(input);
        // String[] output = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
    }
}
