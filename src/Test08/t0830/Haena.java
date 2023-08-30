package Test08.t0830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 프로그래머스 lv.1 모의고사
public class Haena {
    public int[] solution(int[] answers) {
        // 수포자의 찍기 배열 만들기
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 정답을 돌며 수포자의 찍기 배열과 비교해 채점하기
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        for (int i = 0; i < answers.length; i++) {
            int index1 = i % supoja1.length;
            int index2 = i % supoja2.length;
            int index3 = i % supoja3.length;

            if (supoja1[index1] == answers[i]) score1++;
            if (supoja2[index2] == answers[i]) score2++;
            if (supoja3[index3] == answers[i]) score3++;
        }

        // 최고 점수 찾기
        int maxScore = -1;
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(score1);
        scores.add(score2);
        scores.add(score3);
        for (int i = 0; i < scores.size(); i++) {
            if (maxScore < scores.get(i)) maxScore = scores.get(i);
        }

        // 최고점자 answer 담기
        int length = Collections.frequency(scores, maxScore);
        int[] answer = new int[length];
        for (int i = 0, index = 0; i < scores.size(); i++) {
            if (scores.get(i) == maxScore) answer[index++] = i+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Haena sol = new Haena();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 3, 2, 4, 2})));
    }
}

/*
테스트 1 〉	통과 (0.07ms, 66MB)
테스트 2 〉	통과 (0.08ms, 76.1MB)
테스트 3 〉	통과 (0.07ms, 72.2MB)
테스트 4 〉	통과 (0.08ms, 72.9MB)
테스트 5 〉	통과 (0.10ms, 83.2MB)
테스트 6 〉	통과 (0.07ms, 88.1MB)
테스트 7 〉	통과 (0.35ms, 75.9MB)
테스트 8 〉	통과 (0.28ms, 73.6MB)
테스트 9 〉	통과 (0.59ms, 74.4MB)
테스트 10 〉	통과 (0.31ms, 71.2MB)
테스트 11 〉	통과 (0.59ms, 66.5MB)
테스트 12 〉	통과 (0.53ms, 79.5MB)
테스트 13 〉	통과 (0.07ms, 75.1MB)
테스트 14 〉	통과 (0.66ms, 74.9MB)
 */