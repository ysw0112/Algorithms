package programmers;

import java.util.*;

public class bestAlbum {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop", "kpop", "kpop", "ddd"};
        int[] plays = {500, 600, 150, 800, 2500, 2000, 200, 3000};

        new bestAlbum().solution(genres, plays);
    }

    public int[] solution(String[] genres, int[] plays) {
        int count = genres.length;

        HashMap<Integer, String> gMap = new HashMap<>();
        HashMap<Integer, Integer> pMap = new HashMap<>();
        HashMap<String, Integer> totalMap = new HashMap<>();

        for (int i = 0; i < count; i++) {
            gMap.put(i, genres[i]);
            pMap.put(i, plays[i]);
        }

        System.out.println("========gMap : " + gMap);
        System.out.println("========pMap : " + pMap);

        for (int i = 0; i < count; i++) {
            String genresValue = genres[i];
            int playCount = plays[i];

            if (totalMap.containsKey(genresValue)) {
                totalMap.put(genresValue, totalMap.get(genresValue) + playCount);
            } else {
                totalMap.put(genresValue, playCount);
            }
        }

        System.out.println("========totalMap : " + totalMap);

        List<String> sortByValueList = new ArrayList<>(totalMap.keySet());
        Collections.sort(sortByValueList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Object v1 = totalMap.get(o1);
                Object v2 = totalMap.get(o2);
                return ((Comparable) v2).compareTo(v1);
            }
        });

        System.out.println("========sortByValueList : " + sortByValueList);

        int[] answer = new int[sortByValueList.size() * 2];
        ArrayList<Integer> result = new ArrayList<>();
        int z = 0;

        for (int j = 0; j < sortByValueList.size(); j++) {
            String value = sortByValueList.get(j);
            int checkSize = 0;
            for (int i = 0; i < count; i++) {
                if (gMap.get(i).equals(value)) {
                    checkSize++;
                    if (answer[z] == 0) {
                        answer[z] = pMap.get(i);
                        result.add(z, i);
                    } else {
                        if (pMap.get(i) > answer[z]) {
                            answer[z + 1] = answer[z];
                            answer[z] = pMap.get(i);
                            result.add(z + 1, result.get(z));
                            result.remove(z);
                            result.add(z, i);
                        } else if (pMap.get(i) > answer[z + 1]) {
                            answer[z + 1] = pMap.get(i);
                            result.add(z + 1, i);
                        }
                    }
                }
                if (result.size() > z + 2) {
                    result.remove(z + 2);
                }
            }
            if (checkSize == 1) {
                z = z + 1;
            } else {
                z = z + 2;
            }
        }

        System.out.println(result);
        int[] re = new int[result.size()];
        for (int i = 0; i < re.length; i++) {
            re[i] = result.get(i);
        }
        return re;
    }
}
