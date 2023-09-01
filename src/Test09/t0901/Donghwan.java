package Test09.t0901;

import java.util.Arrays;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        System.out.println(donghwan.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(donghwan.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0; // 반환할 변수 생성.
        Arrays.sort(score); // 오름차순 정렬.
        for (int i = score.length - m; i >= 0; i -= m) { // 뒤에서부터 탐색 후 M개씩 묶어서 처리.
            answer += score[i] * m; // M개 요소 중 가장 큰 값 선택 후 M과 곱하고 answer에 정의.
        }
        return answer; // 반환
    }
}


//        테스트 1 〉	통과 (0.39ms, 79.6MB)
//        테스트 2 〉	통과 (0.49ms, 76.1MB)
//        테스트 3 〉	통과 (0.40ms, 77.7MB)
//        테스트 4 〉	통과 (0.52ms, 77.1MB)
//        테스트 5 〉	통과 (0.52ms, 85.7MB)
//        테스트 6 〉	통과 (6.90ms, 75.3MB)
//        테스트 7 〉	통과 (10.58ms, 84.2MB)
//        테스트 8 〉	통과 (1.76ms, 74MB)
//        테스트 9 〉	통과 (15.84ms, 101MB)
//        테스트 10 〉	통과 (4.31ms, 87.8MB)
//        테스트 11 〉	통과 (92.37ms, 131MB)
//        테스트 12 〉	통과 (47.36ms, 125MB)
//        테스트 13 〉	통과 (47.18ms, 141MB)
//        테스트 14 〉	통과 (45.98ms, 145MB)
//        테스트 15 〉	통과 (62.87ms, 127MB)
//        테스트 16 〉	통과 (0.36ms, 71.4MB)
//        테스트 17 〉	통과 (0.39ms, 77.6MB)
//        테스트 18 〉	통과 (0.36ms, 80.8MB)
//        테스트 19 〉	통과 (0.54ms, 73.4MB)
//        테스트 20 〉	통과 (0.41ms, 74.4MB)
//        테스트 21 〉	통과 (0.48ms, 74.3MB)
//        테스트 22 〉	통과 (0.42ms, 77.3MB)
//        테스트 23 〉	통과 (0.31ms, 77.4MB)
//        테스트 24 〉	통과 (0.50ms, 80.5MB)