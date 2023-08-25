package Test08.t0823;

public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution(5, 24));
    }

    public String solution(int a, int b) {
        // 각 월 별로 날짜를 배열에 넣기
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 월 별 날짜를 차이에 더하기
        int gap = 0;
        for (int i = 1; i < a; i++) {
            gap += months[i];
        }
        gap += b;

        // 요일 배열에 넣기
        String[] daysOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        return daysOfWeek[gap % 7];
    }
}

/*
테스트 1 〉	통과 (0.02ms, 74.7MB)
테스트 2 〉	통과 (0.01ms, 76.9MB)
테스트 3 〉	통과 (0.03ms, 78.5MB)
테스트 4 〉	통과 (0.03ms, 75.9MB)
테스트 5 〉	통과 (0.03ms, 72MB)
테스트 6 〉	통과 (0.02ms, 75.3MB)
테스트 7 〉	통과 (0.04ms, 76.1MB)
테스트 8 〉	통과 (0.03ms, 81.7MB)
테스트 9 〉	통과 (0.03ms, 78.5MB)
테스트 10 〉	통과 (0.03ms, 72MB)
테스트 11 〉	통과 (0.03ms, 78.5MB)
테스트 12 〉	통과 (0.02ms, 75.4MB)
테스트 13 〉	통과 (0.02ms, 74.1MB)
테스트 14 〉	통과 (0.03ms, 77.1MB)
 */
