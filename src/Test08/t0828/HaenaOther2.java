package Test08.t0828;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 lv.1 카드 뭉치
public class HaenaOther2 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> card1Ary = new ArrayList<>(Arrays.asList(cards1));
        List<String> card2Ary = new ArrayList<>(Arrays.asList(cards2));

        String answer = "Yes";
        for(String str:goal) {
            if(!card1Ary.isEmpty() && card1Ary.get(0).equals(str)) {
                card1Ary.remove(0);
            } else if(!card2Ary.isEmpty() && card2Ary.get(0).equals(str)) {
                card2Ary.remove(0);
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }

/*
테스트 1 〉	통과 (0.13ms, 75.6MB)
테스트 2 〉	통과 (0.09ms, 75.1MB)
테스트 3 〉	통과 (0.08ms, 75.4MB)
테스트 4 〉	통과 (0.15ms, 69.7MB)
테스트 5 〉	통과 (0.07ms, 79MB)
테스트 6 〉	통과 (0.10ms, 73.9MB)
테스트 7 〉	통과 (0.10ms, 72.2MB)
테스트 8 〉	통과 (0.10ms, 82.3MB)
테스트 9 〉	통과 (0.11ms, 78.8MB)
테스트 10 〉	통과 (0.13ms, 75.9MB)
테스트 11 〉	통과 (0.13ms, 73.2MB)
테스트 12 〉	통과 (0.09ms, 75.8MB)
테스트 13 〉	통과 (0.08ms, 74.2MB)
테스트 14 〉	통과 (0.12ms, 73.3MB)
테스트 15 〉	통과 (0.08ms, 74.2MB)
테스트 16 〉	통과 (0.09ms, 73.8MB)
테스트 17 〉	통과 (0.11ms, 78.5MB)
테스트 18 〉	통과 (0.10ms, 80.2MB)
테스트 19 〉	통과 (0.09ms, 77MB)
테스트 20 〉	통과 (0.12ms, 79.2MB)
테스트 21 〉	통과 (0.08ms, 77.6MB)
테스트 22 〉	통과 (0.13ms, 74.8MB)
테스트 23 〉	통과 (0.12ms, 79.8MB)
테스트 24 〉	통과 (0.10ms, 79.8MB)
테스트 25 〉	통과 (0.12ms, 73.3MB)
 */

    public static void main(String[] args) {
        HaenaOther2 sol = new HaenaOther2();
        System.out.println(sol.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(sol.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}
