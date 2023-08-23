package Test08.t0823;

import java.util.Calendar;
import java.util.Locale;

public class Jihye1 {
    public static void main(String[] args) {

        Jihye1 jh = new Jihye1();
        int a = 5;
        int b = 24;

        System.out.println(jh.solution(a, b));
    }

    public String solution(int a, int b) {
        // Calendar 인스턴스 생성
        Calendar calendar = Calendar.getInstance();
        // Calendar 월은 0부터 시작
        calendar.set(2016, a-1, b);
        // getDisplayName: 요일을 텍스트로 리턴
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US).toUpperCase();
    }

//    테스트 1 〉	통과 (24.51ms, 86.9MB)
//    테스트 2 〉	통과 (25.80ms, 82MB)
//    테스트 3 〉	통과 (22.37ms, 74.3MB)
//    테스트 4 〉	통과 (27.30ms, 81.1MB)
//    테스트 5 〉	통과 (19.56ms, 86.2MB)
//    테스트 6 〉	통과 (21.30ms, 86.1MB)
//    테스트 7 〉	통과 (18.79ms, 75.6MB)
//    테스트 8 〉	통과 (20.71ms, 81.9MB)
//    테스트 9 〉	통과 (22.26ms, 86.5MB)
//    테스트 10 〉	통과 (21.87ms, 79.8MB)
//    테스트 11 〉	통과 (20.97ms, 81.7MB)
//    테스트 12 〉	통과 (25.95ms, 89.5MB)
//    테스트 13 〉	통과 (21.91ms, 83.1MB)
//    테스트 14 〉	통과 (28.69ms, 77.5MB)
}
