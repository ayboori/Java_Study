package Test09.t0901;

import java.util.*;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        int k1 = 3;
        int m1 = 4;
        int[] score1 = {1, 2, 3, 1, 2, 3, 1};

        int k2 = 4;
        int m2 = 3;
        int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        System.out.println(jinhyuk.solution(k1, m1, score1)); //8
        System.out.println(jinhyuk.solution(k2, m2, score2)); //33
    }
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // score를 오름차순으로 정렬

        int appleCount = m; // 담아야할 사과 개수

        for (int i = score.length-1; i >=0 ; i--) { //역순으로 돌린다
            if (appleCount == 1){ // 사과 1개만 더 담으면 완성일때
                answer += m* score[i]; // 현재 상자의 이익 점수를 answer에 더해준다
                appleCount = m; //새상자를 채움
                continue; //오류 생겼음 -> continue 달아서 해결
            }
            appleCount--; // appleCount를 1감소
        }
        return answer; // 결과반환
    }
}

/*
{{ Trouble Shooting }}
   for (int i = score.length-1; i >=0 ; i--) { //역순으로 돌린다
            if (appleCount == 1){ // 사과 1개만 더 담으면 완성일때
                answer += m* score[i]; // 현재 상자의 이익 점수를 answer에 더해준다
                appleCount = m; //새상자를 채움
            }
            에 continue; 안달아서 상자 완성안해도 --1 당해서 오류 생겼음

< 테스트 시간 0.35ms~71.73ms> ??시간이 이게 맞나???
테스트 1 〉	통과 (0.55ms, 76.2MB)
테스트 2 〉	통과 (0.49ms, 73.4MB)
테스트 3 〉	통과 (0.55ms, 87.1MB)
테스트 4 〉	통과 (0.53ms, 82.9MB)
테스트 5 〉	통과 (0.56ms, 88.1MB)
테스트 6 〉	통과 (7.01ms, 80.6MB)
테스트 7 〉	통과 (8.40ms, 88.8MB)
테스트 8 〉	통과 (2.15ms, 77.2MB)
테스트 9 〉	통과 (10.17ms, 86.4MB)
테스트 10 〉	통과 (7.14ms, 73.1MB)
테스트 11 〉	통과 (66.81ms, 144MB)
테스트 12 〉	통과 (60.05ms, 126MB)
테스트 13 〉	통과 (60.04ms, 123MB)
테스트 14 〉	통과 (65.08ms, 148MB)
테스트 15 〉	통과 (71.73ms, 130MB)
테스트 16 〉	통과 (0.44ms, 75.3MB)
테스트 17 〉	통과 (0.55ms, 68.9MB)
테스트 18 〉	통과 (0.49ms, 79.8MB)
테스트 19 〉	통과 (0.48ms, 72.7MB)
테스트 20 〉	통과 (0.36ms, 72.1MB)
테스트 21 〉	통과 (0.52ms, 74.1MB)
테스트 22 〉	통과 (0.36ms, 77.5MB)
테스트 23 〉	통과 (0.51ms, 77.8MB)
테스트 24 〉	통과 (0.35ms, 77.8MB)
*/