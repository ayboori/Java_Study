package Test08.t0811;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hojoong1 {

    public static void main(String[] args) {
        Hojoong1 hojoong = new Hojoong1();

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };

        System.out.println(Arrays.toString(hojoong.solution(name, yearning, photo)));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        //리펙토링에 리펙토링에 리펙토링
        for (int i = 0; i < photo.length; i++) {
            answer[i] = SumScore(setHashMap(name, convert(yearning)), photo[i]);
        }

        return answer;
    }

    private Integer[] convert(int[] yearning) {
        Integer[] integerArray = new Integer[yearning.length];
        for (int i = 0; i < yearning.length; i++) {
            integerArray[i] = Integer.valueOf(yearning[i]);
        }
        return integerArray;
    }

    //지네릭스 사용해서 메서드 선언 해보았음.
    //지네릭스 타입변수, 파라미터 들어갈때 int타입 오토박싱안되서 Integer로 변환해서 넣어줌
    private <K, V> Map setHashMap(K[] name, V[] integerArray) {
        Map<K, V> hashMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            hashMap.put(name[i], integerArray[i]);
        }
        return hashMap;
    }

    private int SumScore(Map<String, Integer> hashMap, String[] photo) {
        int score = 0;
        for (String s : photo) {
            if (hashMap.containsKey(s)) {
                score += hashMap.get(s);
            }
        }
        return score;
    }
//    테스트 1 〉	통과 (0.04ms, 78.9MB)
//    테스트 2 〉	통과 (0.06ms, 75.8MB)
//    테스트 3 〉	통과 (0.42ms, 81.2MB)
//    테스트 4 〉	통과 (0.13ms, 75.8MB)
//    테스트 5 〉	통과 (1.04ms, 68.1MB)
//    테스트 6 〉	통과 (2.52ms, 85MB)
//    테스트 7 〉	통과 (2.18ms, 83.5MB)
//    테스트 8 〉	통과 (1.82ms, 84.4MB)
//    테스트 9 〉	통과 (3.90ms, 82.8MB)
//    테스트 10 〉	통과 (4.30ms, 95.2MB)
//    테스트 11 〉	통과 (4.76ms, 95.1MB)
//    테스트 12 〉	통과 (2.93ms, 94.3MB)
//    테스트 13 〉	통과 (0.89ms, 78.8MB)
//    테스트 14 〉	통과 (0.03ms, 75.8MB)
}
