package Test08.t0823;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        System.out.println(donghwan.solution(5,24));
        System.out.println(donghwan.solution1(5,24));
    }

    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016,a,b);


        DayOfWeek dayOfWeek = date.getDayOfWeek(); // 요일 가져오기


        String answer = dayOfWeek.toString(); // 요일을 문자열로 변환
        return answer.substring(0,3); // substring 반환
    }

    public String solution1(int a, int b) {
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 월 별 일자 설정
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}; // 요일 설정

        int days = 0; // 총합 받을 변수 생성.
        for (int i = 1; i < a; i++) { // 입력 받은 월까지 반복.
            days += daysInMonth[i]; // 해당 일자를 다 더하기.
        }
        days += b - 1; // 하나뺴기

        return daysOfWeek[days % 7]; // 총 값에서 일주일로 나눠서 요일 구하기
    }
}

//        solution
//        테스트 1 〉	통과 (1.38ms, 82.2MB)
//        테스트 2 〉	통과 (1.25ms, 78.1MB)
//        테스트 3 〉	통과 (1.11ms, 75.6MB)
//        테스트 4 〉	통과 (1.35ms, 86.3MB)
//        테스트 5 〉	통과 (1.05ms, 88MB)
//        테스트 6 〉	통과 (1.14ms, 77.1MB)
//        테스트 7 〉	통과 (1.06ms, 74.3MB)
//        테스트 8 〉	통과 (0.97ms, 74.9MB)
//        테스트 9 〉	통과 (1.57ms, 82.7MB)
//        테스트 10 〉	통과 (1.49ms, 75.3MB)
//        테스트 11 〉	통과 (1.41ms, 78.3MB)
//        테스트 12 〉	통과 (1.09ms, 72.6MB)
//        테스트 13 〉	통과 (1.20ms, 74.4MB)
//        테스트 14 〉	통과 (1.60ms, 81.6MB)





//        solution1
//        테스트 1 〉	통과 (0.03ms, 82.5MB)
//        테스트 2 〉	통과 (0.02ms, 80.5MB)
//        테스트 3 〉	통과 (0.03ms, 75.7MB)
//        테스트 4 〉	통과 (0.03ms, 69.1MB)
//        테스트 5 〉	통과 (0.03ms, 67.2MB)
//        테스트 6 〉	통과 (0.02ms, 77.5MB)
//        테스트 7 〉	통과 (0.04ms, 76.1MB)
//        테스트 8 〉	통과 (0.03ms, 83.6MB)
//        테스트 9 〉	통과 (0.05ms, 78.2MB)
//        테스트 10 〉	통과 (0.02ms, 65.7MB)
//        테스트 11 〉	통과 (0.02ms, 78MB)
//        테스트 12 〉	통과 (0.03ms, 66MB)
//        테스트 13 〉	통과 (0.02ms, 76.4MB)
//        테스트 14 〉	통과 (0.03ms, 69.8MB)
