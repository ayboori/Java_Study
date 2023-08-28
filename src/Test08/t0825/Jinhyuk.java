package Test08.t0825;

import java.util.ArrayList;
import java.util.Collections;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        int k1 = 3;
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(jinhyuk.solution(k1, score1));

        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(jinhyuk.solution(k2, score2));
    }

    public int[] solution(int k, int[] score) {
        ArrayList<Integer> RANKING = new ArrayList<>(); //명예의 전당에 올라갈 k등까지 rank ArrayList 로
        ArrayList<Integer> answerList = new ArrayList<>(); // 정답 담을 ArrayList
        
        if (k < score.length) { //k가 score.length보다 작을 때
            for (int i = 0; i < k; i++) { //K까지는
                RANKING.add(score[i]); //RANKING에 넣어주고
                answerList.add(Collections.min(RANKING)); //answerList에 최소값 넣어주기
            }
            for (int i = k; i < score.length; i++) { //K부터 배열끝까지는
                if (score[i] > Collections.min(RANKING)) {  //최소값보다 크면
                    RANKING.remove(Collections.min(RANKING)); //최소값 제거하고
                    RANKING.add(score[i]); //그 자리에 넣어주기
                }
                answerList.add(Collections.min(RANKING)); //answerList에 ranking의 최소값 넣어주기
            }
        }else { //k가 score.length보다 클 때
            for (int i = 0; i < score.length; i++) { //i의 최대 크기만 score.length 이고 나머진 같음
                RANKING.add(score[i]);
                answerList.add(Collections.min(RANKING));
            }
        }
        int[] answer = new int[answerList.size()]; //answerList를 answer로 화분갈이해주기
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer; // 정답
    }
}


/*
{{ Trouble Shooting }}
9, 11번에서 자꾸 런타임 에러가 발생함 -> 왜?
질문하기에서 같은 오류를 가지고 있는 분들을 확인
k > score.length 일 때를 고려하지 않아서 발생한 오류라고 합니다.
if문으로 구간을 나눠서
else {
            for (int i = 0; i < score.length; i++) {
                RANKING.add(score[i]);
                answerList.add(Collections.min(RANKING));
            }
        }
부분을 추가해서 해결했습니다.

{{ 테스트 통과시간 0.06~6.94ms }}
테스트 1 〉	통과 (0.09ms, 72.4MB)
테스트 2 〉	통과 (0.07ms, 77.2MB)
테스트 3 〉	통과 (0.07ms, 76.4MB)
테스트 4 〉	통과 (0.10ms, 72.7MB)
테스트 5 〉	통과 (0.23ms, 79.2MB)
테스트 6 〉	통과 (0.11ms, 74.5MB)
테스트 7 〉	통과 (0.28ms, 74.9MB)
테스트 8 〉	통과 (0.35ms, 87.9MB)
테스트 9 〉	통과 (0.47ms, 74.6MB)
테스트 10 〉	통과 (0.63ms, 68MB)
테스트 11 〉	통과 (0.79ms, 75.7MB)
테스트 12 〉	통과 (4.58ms, 72.1MB)
테스트 13 〉	통과 (4.21ms, 75.4MB)
테스트 14 〉	통과 (3.06ms, 77.2MB)
테스트 15 〉	통과 (6.92ms, 76.2MB)
테스트 16 〉	통과 (6.68ms, 82.3MB)
테스트 17 〉	통과 (6.29ms, 80.4MB)
테스트 18 〉	통과 (6.94ms, 74MB)
테스트 19 〉	통과 (1.35ms, 70.6MB)
테스트 20 〉	통과 (1.25ms, 76.3MB)
테스트 21 〉	통과 (1.61ms, 79.7MB)
테스트 22 〉	통과 (1.66ms, 73.5MB)
테스트 23 〉	통과 (1.76ms, 76.7MB)
테스트 24 〉	통과 (1.95ms, 78.6MB)
테스트 25 〉	통과 (1.97ms, 73.7MB)
테스트 26 〉	통과 (0.06ms, 74MB)
*/