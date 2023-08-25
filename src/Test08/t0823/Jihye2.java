package Test08.t0823;

public class Jihye2 {
    public static void main(String[] args) {

        Jihye2 jh = new Jihye2();
        int a = 5;
        int b = 24;

        System.out.println(jh.solution(a, b));
    }
    public String solution(int a, int b) {
        // 2016년 1월 첫요일이 금요일
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        // date 배열이 0부터 시작해서 해당 달은 포함 X
        for (int i = 0; i < a-1; i++) {
            allDate += date[i];
        }

        // allDate가 0부터 시작해서 -1
        allDate += (b-1);

        return day[allDate % 7];
    }

//    테스트 1 〉	통과 (0.03ms, 72MB)
//    테스트 2 〉	통과 (0.03ms, 76.7MB)
//    테스트 3 〉	통과 (0.07ms, 70.3MB)
//    테스트 4 〉	통과 (0.02ms, 73.1MB)
//    테스트 5 〉	통과 (0.03ms, 73.5MB)
//    테스트 6 〉	통과 (0.03ms, 74.7MB)
//    테스트 7 〉	통과 (0.02ms, 78.5MB)
//    테스트 8 〉	통과 (0.03ms, 73.7MB)
//    테스트 9 〉	통과 (0.03ms, 75.9MB)
//    테스트 10 〉	통과 (0.02ms, 76.3MB)
//    테스트 11 〉	통과 (0.03ms, 86.9MB)
//    테스트 12 〉	통과 (0.02ms, 76.6MB)
//    테스트 13 〉	통과 (0.03ms, 71.6MB)
//    테스트 14 〉	통과 (0.02ms, 73.8MB)
}
