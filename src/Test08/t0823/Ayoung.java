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
