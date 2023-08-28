package Test08.t0825;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(jh.solution(k, score)));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> scoreList = new ArrayList<>();

        // 가수 수 조절하기
        if (k>score.length){
            k = score.length;
        }

        // 명예의 전당 다 차기 전까지 비교하며 list에 담기
        int min = 2000;
        for(int i=0; i<k; i++) {
            int now = score[i];
            scoreList.add(now);
            if (now < min) {
                min = now;
            }
            answer[i] = min;
        }
        Collections.sort(scoreList);

        // 명예의 전당 만석 되고 난 후
        for(int i=k; i<score.length; i++) {
            int now = score[i];
            int last = scoreList.get(0);

            // 현재 수와 명예의 전당에 올라간 작은 수와 비교
            if (now > last) {
                scoreList.remove(0);
                scoreList.add(now);

                // 오름차순 정렬
                Collections.sort(scoreList);
            }

            // 명예의 전당의 가장 작은 수 넣기
            int MinScore = scoreList.get(0);
            // 최하위 점수 배열에 추가
            answer[i] = MinScore;
        }
        return answer;
    }

}
