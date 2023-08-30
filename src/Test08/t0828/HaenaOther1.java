package Test08.t0828;

import java.util.LinkedList;
import java.util.Queue;

// 프로그래머스 lv.1 카드 뭉치
public class HaenaOther1 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> qGoal = new LinkedList<>();
        Queue<String> qCard1 = new LinkedList<>();
        Queue<String> qCard2 = new LinkedList<>();

        for (String str : goal) {
            qGoal.offer(str);
        }

        for (String card : cards1) {
            qCard1.offer(card);
        }

        for (String card : cards2) {
            qCard2.offer(card);
        }

        while (!qGoal.isEmpty()) {
            String str = qGoal.poll();

            if (str.equals(qCard1.peek())) qCard1.poll();
            else if (str.equals(qCard2.peek())) qCard2.poll();
            else return "No";
        }

        return "Yes";
    }

/*
테스트 1 〉	통과 (0.12ms, 71.6MB)
테스트 2 〉	통과 (0.12ms, 70.6MB)
테스트 3 〉	통과 (0.15ms, 72.3MB)
테스트 4 〉	통과 (0.14ms, 77.9MB)
테스트 5 〉	통과 (0.11ms, 72.2MB)
테스트 6 〉	통과 (0.12ms, 77MB)
테스트 7 〉	통과 (0.13ms, 68MB)
테스트 8 〉	통과 (0.12ms, 74.4MB)
테스트 9 〉	통과 (0.17ms, 77.4MB)
테스트 10 〉	통과 (0.12ms, 76.5MB)
테스트 11 〉	통과 (0.12ms, 74MB)
테스트 12 〉	통과 (0.21ms, 82.9MB)
테스트 13 〉	통과 (0.13ms, 76.6MB)
테스트 14 〉	통과 (0.14ms, 72.2MB)
테스트 15 〉	통과 (0.20ms, 78.3MB)
테스트 16 〉	통과 (0.15ms, 77.8MB)
테스트 17 〉	통과 (0.22ms, 76MB)
테스트 18 〉	통과 (0.15ms, 80.4MB)
테스트 19 〉	통과 (0.23ms, 80.2MB)
테스트 20 〉	통과 (0.14ms, 76.8MB)
테스트 21 〉	통과 (0.16ms, 72.8MB)
테스트 22 〉	통과 (0.17ms, 73.5MB)
테스트 23 〉	통과 (0.15ms, 76.6MB)
테스트 24 〉	통과 (0.14ms, 74.3MB)
테스트 25 〉	통과 (0.12ms, 81.3MB)
 */

    public static void main(String[] args) {
        HaenaOther1 sol = new HaenaOther1();
        System.out.println(sol.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(sol.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}
