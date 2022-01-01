package programmers;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] a = {"mislav", "stanko", "mislav", "ana"};
        String[] b = {"stanko", "ana", "mislav"};
        System.out.println(solution(a, b));
    }

    static String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        String answer = "";

        for (int i = 0; i < participant.length; i++) {
            if (participantMap.containsKey(participant[i])) {
                participantMap.put(participant[i], participantMap.get(participant[i]) + 1);
            } else {
                participantMap.put(participant[i], 1);
            }
        }
        System.out.println(participantMap.toString());

        for (int i = 0; i < completion.length; i++) {
            if (participantMap.containsKey(completion[i])) {
                participantMap.put(completion[i], participantMap.get(completion[i]) - 1);
            }
        }

        for (int i = 0; i < participant.length; i++) {
            if (participantMap.get(participant[i]) == 1) {
                answer = participant[i];
            }
        }

        return answer;
    }
}
