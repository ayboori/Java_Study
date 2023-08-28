package Test08.t0825;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        int k = 3;
        int[] test1 = {10, 100, 20, 150, 1, 100, 200};
        int[] test2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(Arrays.toString(donghwan.solution(k, test1)));
        System.out.println(Arrays.toString(donghwan.solution(k, test2)));
    }

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length]; // 점수를 담을 int배열 생성
        ArrayList<Integer> arr = new ArrayList<>(); // 점수를 추가할 ArrayList 생성

        for (int i=0;i<score.length;i++) { // 점수에 접근하기 위해 반복문 생성.
            if (arr.size()<k) { // 최소값을 구하기 위한 리스트가 아직 가득차지 않을때 조건문.
                arr.add(score[i]); // add를 이용해 점수 추가.
                Collections.sort(arr); // 리스트 정렬.
                answer[i] = arr.get(0); //최소값을 answer에 저장.
                continue; // 다음 조건문을 타지않기 위해 continue를 사용해 다음 반복문으로 이동.
            }

            if (arr.size()==k) { // 최소값을 구하기 위한 조건문.
                int minNum = arr.get(0); // 최소값을 minNum에 정의.

                if (minNum<score[i]) { // 뽑아온 점수가 최소값보다 큰 경우.
                    arr.remove(0); // 기존 최소값 제거.
                    arr.add(score[i]); // 뽑아온 점수를 추가
                    Collections.sort(arr); // 리스트 정렬
                }

                answer[i] = arr.get(0); //최소값을 다시 재정의.
            }
        }
        return answer; // answer 반환.
    }
}


//        테스트 1 〉	통과 (0.30ms, 75MB)
//        테스트 2 〉	통과 (0.26ms, 70.5MB)
//        테스트 3 〉	통과 (0.21ms, 85.3MB)
//        테스트 4 〉	통과 (0.33ms, 73.5MB)
//        테스트 5 〉	통과 (0.34ms, 74.3MB)
//        테스트 6 〉	통과 (0.32ms, 78.7MB)
//        테스트 7 〉	통과 (0.28ms, 79.9MB)
//        테스트 8 〉	통과 (0.28ms, 69.3MB)
//        테스트 9 〉	통과 (0.59ms, 80.1MB)
//        테스트 10 〉	통과 (0.78ms, 74.5MB)
//        테스트 11 〉	통과 (0.69ms, 89.8MB)
//        테스트 12 〉	통과 (1.97ms, 74.9MB)
//        테스트 13 〉	통과 (3.04ms, 72.5MB)
//        테스트 14 〉	통과 (2.40ms, 78MB)
//        테스트 15 〉	통과 (4.16ms, 72.9MB)
//        테스트 16 〉	통과 (3.69ms, 81.7MB)
//        테스트 17 〉	통과 (3.40ms, 66.6MB)
//        테스트 18 〉	통과 (2.76ms, 76.3MB)
//        테스트 19 〉	통과 (0.57ms, 72.9MB)
//        테스트 20 〉	통과 (0.63ms, 72.6MB)
//        테스트 21 〉	통과 (0.62ms, 79.1MB)
//        테스트 22 〉	통과 (0.84ms, 78.8MB)
//        테스트 23 〉	통과 (0.71ms, 73.5MB)
//        테스트 24 〉	통과 (0.93ms, 79.1MB)
//        테스트 25 〉	통과 (0.68ms, 75.3MB)
//        테스트 26 〉	통과 (0.35ms, 74.7MB)
