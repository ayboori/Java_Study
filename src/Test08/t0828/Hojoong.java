package Test08.t0828;

import java.util.LinkedList;
import java.util.Queue;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        String[] cards1 = {"a", "b", "c"};
        String[] cards2 = {"d", "e", "f"};
        String[] goal = {"a", "d", "f"};

        System.out.println(hojoong.solution(cards1, cards2, goal));
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 대놓고 큐쓰라고 ?
        // cards1 , cards2 각,각 goal에 해당하는 문자열이 있으면 poll로 한개씩 버린다.
        // 버리지 못할 경우 No. break
        // goal에 있는 문자열 만큼 문제없이 버릴 경우 Yes.

        String answer = "Yes";

        Queue<String> cardsQ1 = new LinkedList<>();
        for (String card1 : cards1
        ) {
            cardsQ1.add(card1);
        }
        Queue<String> cardsQ2 = new LinkedList<>();
        for (String card2 : cards2
        ) {
            cardsQ2.add(card2);
        }

        for (String card3 : goal) {
            if (card3.equals(cardsQ1.peek())) {
                cardsQ1.poll();
            } else if (card3.equals(cardsQ2.peek())) {
                cardsQ2.poll();
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
//    테스트 1 〉	통과 (0.12ms, 71.6MB)
//    테스트 2 〉	통과 (0.11ms, 76MB)
//    테스트 3 〉	통과 (0.14ms, 75.3MB)
//    테스트 4 〉	통과 (0.15ms, 66.5MB)
//    테스트 5 〉	통과 (0.11ms, 73.2MB)
//    테스트 6 〉	통과 (0.12ms, 79.9MB)
//    테스트 7 〉	통과 (0.15ms, 75.9MB)
//    테스트 8 〉	통과 (0.11ms, 73.8MB)
//    테스트 9 〉	통과 (0.16ms, 76.8MB)
//    테스트 10 〉	통과 (0.12ms, 73.6MB)
//    테스트 11 〉	통과 (0.15ms, 68.3MB)
//    테스트 12 〉	통과 (0.19ms, 67.3MB)
//    테스트 13 〉	통과 (0.18ms, 73.6MB)
//    테스트 14 〉	통과 (0.12ms, 82.6MB)
//    테스트 15 〉	통과 (0.12ms, 72.4MB)
//    테스트 16 〉	통과 (0.14ms, 74.7MB)
//    테스트 17 〉	통과 (0.13ms, 73.7MB)
//    테스트 18 〉	통과 (0.12ms, 68.1MB)
//    테스트 19 〉	통과 (0.13ms, 73.4MB)
//    테스트 20 〉	통과 (0.15ms, 76.4MB)
//    테스트 21 〉	통과 (0.11ms, 78.1MB)
//    테스트 22 〉	통과 (0.12ms, 70MB)
//    테스트 23 〉	통과 (0.13ms, 77.5MB)
//    테스트 24 〉	통과 (0.13ms, 73.6MB)
//    테스트 25 〉	통과 (0.11ms, 71.8MB)
}
