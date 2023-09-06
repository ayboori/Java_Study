package Test09.t0901;

import java.util.Arrays;

// 프로그래머스 lv.1 과일장수
public class Haena {
    public int solution(int k, int m, int[] score) {
        // 주어진 score 정렬
        Arrays.sort(score);

        // 주어진 score를 돌며 각 박스의 최저점 * 개수를 answer에 더해 return
        int answer = 0;
        for (int i = score.length % m; i < score.length; i += m) {
            answer += score[i] * m;
        }
        return answer;
    }

    public static void main(String[] args) {
        Haena sol = new Haena();
        System.out.println(sol.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(sol.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}

/*
테스트 1 〉	통과 (0.51ms, 73.2MB)
테스트 2 〉	통과 (0.37ms, 75.7MB)
테스트 3 〉	통과 (0.36ms, 69.4MB)
테스트 4 〉	통과 (0.52ms, 68.4MB)
테스트 5 〉	통과 (0.43ms, 75.2MB)
테스트 6 〉	통과 (4.96ms, 85.3MB)
테스트 7 〉	통과 (8.44ms, 75.5MB)
테스트 8 〉	통과 (1.59ms, 76.7MB)
테스트 9 〉	통과 (6.46ms, 78.2MB)
테스트 10 〉	통과 (4.24ms, 79.1MB)
테스트 11 〉	통과 (41.22ms, 144MB)
테스트 12 〉	통과 (38.19ms, 127MB)
테스트 13 〉	통과 (39.38ms, 126MB)
테스트 14 〉	통과 (46.28ms, 144MB)
테스트 15 〉	통과 (43.97ms, 144MB)
테스트 16 〉	통과 (0.38ms, 78.4MB)
테스트 17 〉	통과 (0.43ms, 75.1MB)
테스트 18 〉	통과 (0.48ms, 74.5MB)
테스트 19 〉	통과 (0.52ms, 74.4MB)
테스트 20 〉	통과 (0.42ms, 76.1MB)
테스트 21 〉	통과 (0.43ms, 71.8MB)
테스트 22 〉	통과 (0.49ms, 75.1MB)
테스트 23 〉	통과 (0.49ms, 74.2MB)
테스트 24 〉	통과 (0.32ms, 69.8MB)
 */
