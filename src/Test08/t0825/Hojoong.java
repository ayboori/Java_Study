package Test08.t0825;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        int k1 = 4;
        int[] score1 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        System.out.println(Arrays.toString(hojoong.solution(k, score)));
        System.out.println(Arrays.toString(hojoong.solution(k1, score1)));
    }

    public int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];

        List<Integer> stage = new ArrayList<>();

        if (k > score.length) {
            int a = score.length;
            for (int i = 0; i < a; i++) {
                stage.add(score[i]);
                Collections.sort(stage);
                answer[i] = stage.get(0);
            }
        } else {
            for (int i = 0; i < k; i++) {
                stage.add(score[i]);
                Collections.sort(stage);
                answer[i] = stage.get(0);
            }
        }
        for (int i = k; i < score.length; i++) {
            int x = score[i];
            for (int j = 0; j < stage.size(); j++) {
                if (stage.get(j) < x) {
                    stage.set(j, x);
                    Collections.sort(stage);
                    break;
                }
            }
            answer[i] = stage.get(0);
        }
        return answer;
    }

}
