package Test08.t0811;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

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

        //name, yearning hashmap에 key,value로 저장
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            hashMap.put(name[i], yearning[i]);
        }
        //For문 돌려서 1줄씩 뽑아서 같은 이름 찾아서 점수 더하기
        for (int i = 0; i < photo.length; i++) {
            answer[i] = SumScore(hashMap, photo[i]);
        }

        return answer;
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

//    테스트 1 〉	통과 (0.04ms, 70.4MB)
//    테스트 2 〉	통과 (0.05ms, 68.9MB)
//    테스트 3 〉	통과 (0.27ms, 81.6MB)
//    테스트 4 〉	통과 (0.19ms, 98.2MB)
//    테스트 5 〉	통과 (0.35ms, 80MB)
//    테스트 6 〉	통과 (0.78ms, 89.5MB)
//    테스트 7 〉	통과 (0.61ms, 76.4MB)
//    테스트 8 〉	통과 (0.74ms, 78.5MB)
//    테스트 9 〉	통과 (0.75ms, 84.7MB)
//    테스트 10 〉	통과 (1.90ms, 93.9MB)
//    테스트 11 〉	통과 (1.72ms, 94.3MB)
//    테스트 12 〉	통과 (1.08ms, 85MB)
//    테스트 13 〉	통과 (0.15ms, 75.1MB)
//    테스트 14 〉	통과 (0.04ms, 78MB)
}
