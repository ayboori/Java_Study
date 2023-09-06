package Test09.t0901;

import java.util.ArrayList;
import java.util.Arrays;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        int k = 3;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(hojoong.solution(k, m, score));
        System.out.println(hojoong.solution2(k, m, score));
        System.out.println(hojoong.solution3(k, m, score));
    }

    public int solution3(int k, int m, int[] score) {
        for (int i = 0; i < score.length; i++) {

            for (int j = i + 1; j < score.length; j++) {

                if (score[i] > score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        int answer = 0;
        int j = 1;
        for (int i = score.length - 1; i >= 0; i--) {
            if(j%m == 0){
                answer += score[i]*m;
            }
            j++;
        }
        return answer;

        //응~ 안되 시간초과야~
    }
//    테스트 1 〉	통과 (0.10ms, 71.8MB)
//    테스트 2 〉	통과 (0.02ms, 72.2MB)
//    테스트 3 〉	통과 (0.09ms, 65.8MB)
//    테스트 4 〉	통과 (0.04ms, 79.7MB)
//    테스트 5 〉	통과 (0.04ms, 78.7MB)
//    테스트 6 〉	통과 (3312.32ms, 77MB)
//    테스트 7 〉	통과 (5193.32ms, 83.7MB)
//    테스트 8 〉	통과 (150.18ms, 77MB)
//    테스트 9 〉	통과 (4930.41ms, 97.4MB)
//    테스트 10 〉	통과 (2448.72ms, 90.8MB)
//    테스트 11 〉	실패 (시간 초과)
//    테스트 12 〉	실패 (시간 초과)
//    테스트 13 〉	실패 (시간 초과)
//    테스트 14 〉	실패 (시간 초과)
//    테스트 15 〉	실패 (시간 초과)
//    테스트 16 〉	통과 (0.03ms, 76.4MB)
//    테스트 17 〉	통과 (0.01ms, 72.2MB)
//    테스트 18 〉	통과 (0.19ms, 78.6MB)
//    테스트 19 〉	통과 (0.08ms, 79.8MB)
//    테스트 20 〉	통과 (0.08ms, 74.2MB)
//    테스트 21 〉	통과 (0.02ms, 77.6MB)
//    테스트 22 〉	통과 (0.04ms, 76.1MB)
//    테스트 23 〉	통과 (0.03ms, 71.4MB)
//    테스트 24 〉	통과 (0.03ms, 72.2MB)

    public int solution2(int k, int m, int[] score) {
        Arrays.sort(score);

        int answer = 0;
        int j = 1;
        for (int i = score.length - 1; i >= 0; i--) {
            if(j%m == 0){
                answer += score[i]*m;
            }
            j++;
        }
        return answer;

    }
//    테스트 1 〉	통과 (0.87ms, 71.1MB)
//    테스트 2 〉	통과 (1.28ms, 75.9MB)
//    테스트 3 〉	통과 (1.02ms, 79.1MB)
//    테스트 4 〉	통과 (1.31ms, 74.2MB)
//    테스트 5 〉	통과 (0.47ms, 74.4MB)
//    테스트 6 〉	통과 (5.82ms, 81.7MB)
//    테스트 7 〉	통과 (7.71ms, 82.2MB)
//    테스트 8 〉	통과 (1.24ms, 74.2MB)
//    테스트 9 〉	통과 (7.42ms, 90.3MB)
//    테스트 10 〉	통과 (7.48ms, 77.3MB)
//    테스트 11 〉	통과 (59.27ms, 124MB)
//    테스트 12 〉	통과 (43.16ms, 127MB)
//    테스트 13 〉	통과 (59.33ms, 122MB)
//    테스트 14 〉	통과 (70.41ms, 144MB)
//    테스트 15 〉	통과 (68.68ms, 140MB)
//    테스트 16 〉	통과 (0.42ms, 76.3MB)
//    테스트 17 〉	통과 (0.52ms, 79.6MB)
//    테스트 18 〉	통과 (0.55ms, 78.5MB)
//    테스트 19 〉	통과 (0.45ms, 77.8MB)
//    테스트 20 〉	통과 (0.36ms, 76.5MB)
//    테스트 21 〉	통과 (0.49ms, 80.1MB)
//    테스트 22 〉	통과 (0.35ms, 72.8MB)
//    테스트 23 〉	통과 (0.35ms, 77.7MB)
//    테스트 24 〉	통과 (0.37ms, 75.1MB)

    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        ArrayList<Integer> box = new ArrayList<>();
        int answer = 0;
        for (int i = score.length - 1; i >= 0; i--) {
            if (box.size() < m) {
                box.add(score[i]);
                if (box.size() == m) {
                    k = box.get(m - 1);
                    answer += k * m;
                }
            } else {
                box.clear();
                box.add(score[i]);
            }
        }
        return answer;
    }
//    테스트 1 〉	통과 (0.42ms, 72.7MB)
//    테스트 2 〉	통과 (0.49ms, 74.5MB)
//    테스트 3 〉	통과 (0.49ms, 78.7MB)
//    테스트 4 〉	통과 (0.59ms, 76MB)
//    테스트 5 〉	통과 (0.47ms, 73.1MB)
//    테스트 6 〉	통과 (11.97ms, 86.9MB)
//    테스트 7 〉	통과 (13.65ms, 83.7MB)
//    테스트 8 〉	통과 (2.63ms, 75.1MB)
//    테스트 9 〉	통과 (12.00ms, 84.3MB)
//    테스트 10 〉	통과 (11.05ms, 98.2MB)
//    테스트 11 〉	통과 (60.56ms, 127MB)
//    테스트 12 〉	통과 (57.80ms, 124MB)
//    테스트 13 〉	통과 (65.55ms, 149MB)
//    테스트 14 〉	통과 (61.33ms, 126MB)
//    테스트 15 〉	통과 (71.37ms, 126MB)
//    테스트 16 〉	통과 (0.37ms, 76.7MB)
//    테스트 17 〉	통과 (0.44ms, 77MB)
//    테스트 18 〉	통과 (0.56ms, 75.5MB)
//    테스트 19 〉	통과 (0.44ms, 72.3MB)
//    테스트 20 〉	통과 (0.48ms, 77.4MB)
//    테스트 21 〉	통과 (0.37ms, 72.6MB)
//    테스트 22 〉	통과 (0.41ms, 70.6MB)
//    테스트 23 〉	통과 (0.56ms, 78.8MB)
//    테스트 24 〉	통과 (0.40ms, 74.1MB)
}
