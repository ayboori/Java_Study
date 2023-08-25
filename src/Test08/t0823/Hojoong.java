package Test08.t0823;

import java.time.LocalDate;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        int a = 5;
        int b = 24;

        System.out.println(hojoong.solution(a, b));
    }

    public String solution(int a, int b) {
        return String.valueOf(LocalDate.of(2016, a, b).getDayOfWeek())
                .substring(0, 3);
    }

//    테스트 1 〉	통과 (1.15ms, 77.3MB)
//    테스트 2 〉	통과 (0.98ms, 76.3MB)
//    테스트 3 〉	통과 (1.27ms, 77.4MB)
//    테스트 4 〉	통과 (1.20ms, 75.1MB)
//    테스트 5 〉	통과 (1.54ms, 80.9MB)
//    테스트 6 〉	통과 (1.09ms, 79.4MB)
//    테스트 7 〉	통과 (1.08ms, 75MB)
//    테스트 8 〉	통과 (1.21ms, 74MB)
//    테스트 9 〉	통과 (0.97ms, 79.1MB)
//    테스트 10 〉	통과 (1.09ms, 77.3MB)
//    테스트 11 〉	통과 (1.01ms, 73.2MB)
//    테스트 12 〉	통과 (0.98ms, 74.4MB)
//    테스트 13 〉	통과 (1.07ms, 77.5MB)
//    테스트 14 〉	통과 (1.21ms, 74.6MB)

}
