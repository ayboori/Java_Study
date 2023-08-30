package Test08.t0830;

import java.util.ArrayList;
import java.util.Arrays;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        System.out.println(donghwan.solution(new int[] {1,2,3,4,5}).toString());
        System.out.println(donghwan.solution(new int[] {1,3,2,4,2}).toString());
    }

    public int[] solution(int[] answers) {
        int[] t1 = {1, 2, 3, 4, 5}; // 수포자 1 패턴 배열
        int[] t2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 수포자 2 패턴 배열
        int[] t3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 수포자 3 패턴 배열


        int[] cnt = {0,0,0,0}; // 각 수포자의 정답 카운트 저장 배열

        for(int i=0; i< answers.length; i++){ // 정답 패턴에 접근하기 위한 반복문.
            if(answers[i] == t1[i%t1.length]) {  // i%t1.length로 정답 비교.
                cnt[1]++; // 맞으면 카운터 증가.
            }
            if(answers[i] == t2[i%t2.length]) { // i%t2.length로 정답 비교.
                cnt[2]++; // 맞으면 카운터 증가.
            }
            if(answers[i] == t3[i%t3.length]) { // i%t3.length로 정답 비교.
                cnt[3]++; // 맞으면 카운터 증가.
            }
        }

        int max= Math.max(Math.max(cnt[1], cnt[2]),cnt[3]); // 가장 많은 정답을 맞춘 수포자를 Math.max 메서드를 이용해 찾기.
        ArrayList<Integer> result = new ArrayList<>(); // 가장 많은 수포자를 저장할 ArrayList 생성
        for(int i=1; i<4; i++){ // 수포자 정답 카운트 확인하기 위한 반복문.
            if(max==cnt[i]) { // max값을 추가하기 위한 조건문.
                result.add(i); // 가장 많은 정답을 맞춘 수포자 추가.
            }
        }


        int[] resultArr = new int[result.size()]; // 반환할 배열 생성.
        for(int i=0; i<result.size(); i++){ // result에 있는 수포자에 접근하기위한 반복문.
            resultArr[i] = result.get(i); // result에 저장된 수포자 반환할 배열에 재정의.
        }

        return resultArr; // 반환.
    }
}


//        테스트 1 〉	통과 (0.05ms, 75.4MB)
//        테스트 2 〉	통과 (0.06ms, 68.9MB)
//        테스트 3 〉	통과 (0.03ms, 78.5MB)
//        테스트 4 〉	통과 (0.05ms, 71.7MB)
//        테스트 5 〉	통과 (0.04ms, 72.4MB)
//        테스트 6 〉	통과 (0.06ms, 71.7MB)
//        테스트 7 〉	통과 (0.31ms, 73.1MB)
//        테스트 8 〉	통과 (0.19ms, 73.6MB)
//        테스트 9 〉	통과 (0.99ms, 73.6MB)
//        테스트 10 〉	통과 (0.43ms, 81.2MB)
//        테스트 11 〉	통과 (0.61ms, 80.4MB)
//        테스트 12 〉	통과 (0.93ms, 72.7MB)
//        테스트 13 〉	통과 (0.10ms, 76.2MB)
//        테스트 14 〉	통과 (1.10ms, 73MB)