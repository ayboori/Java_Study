package Test08.t0828;

import java.util.LinkedList;
import java.util.Queue;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(jh.solution(cards1, cards2, goal));
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        // 각각 큐 객체 생성
        Queue<String> card1 = new LinkedList<>();
        Queue<String> card2 = new LinkedList<>();

        // 큐card1에 cards1 값들 넣어주기
        for(String c : cards1){
            card1.add(c);
        }

        // 큐card2에 cards2 값들 넣어주기
        for(String c : cards2){
            card2.add(c);
        }

        for(int i=0; i< goal.length; i++){
            if(goal[i].equals(card1.peek())){ // i번째 goal의 값과 card1의 첫번째 값이 같으면
                card1.poll(); // card1의 첫번째 값 빼기
            }else if(goal[i].equals(card2.peek())){ // i번째 goal의 값과 card2의 첫번째 값이 같으면
                card2.poll(); // card2의 첫번째 값 빼기
            }else{
                return "No";
            }
        }
        return answer;
    }

//    테스트 1 〉	통과 (0.12ms, 73.7MB)
//    테스트 2 〉	통과 (0.12ms, 74.8MB)
//    테스트 3 〉	통과 (0.12ms, 70.3MB)
//    테스트 4 〉	통과 (0.14ms, 78.9MB)
//    테스트 5 〉	통과 (0.12ms, 73.1MB)
//    테스트 6 〉	통과 (0.16ms, 75.9MB)
//    테스트 7 〉	통과 (0.11ms, 77.6MB)
//    테스트 8 〉	통과 (0.17ms, 72.5MB)
//    테스트 9 〉	통과 (0.19ms, 72MB)
//    테스트 10 〉	통과 (0.18ms, 76MB)
//    테스트 11 〉	통과 (0.11ms, 72.8MB)
//    테스트 12 〉	통과 (0.12ms, 64.9MB)
//    테스트 13 〉	통과 (0.12ms, 72.8MB)
//    테스트 14 〉	통과 (0.18ms, 74.6MB)
//    테스트 15 〉	통과 (0.16ms, 71.3MB)
//    테스트 16 〉	통과 (0.21ms, 71.9MB)
//    테스트 17 〉	통과 (0.17ms, 74MB)
//    테스트 18 〉	통과 (0.14ms, 72MB)
//    테스트 19 〉	통과 (0.11ms, 74.2MB)
//    테스트 20 〉	통과 (0.17ms, 74.4MB)
//    테스트 21 〉	통과 (0.12ms, 71.6MB)
//    테스트 22 〉	통과 (0.12ms, 73.8MB)
//    테스트 23 〉	통과 (0.12ms, 72.7MB)
//    테스트 24 〉	통과 (0.16ms, 77.8MB)
//    테스트 25 〉	통과 (0.14ms, 82.8MB)
}
