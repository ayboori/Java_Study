package Test08.t0809;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();

        int a = 3;
        int b = 1;
        int n = 20;

        System.out.println(jh.solution(a, b, n));
    }

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) { // 줘야할 빈병보다 작으면 while문 빠져나오기
            answer += n/a*b; // 받은 빈병 구하기
            n = n%a + n/a*b; // 남은 빈병 + 받은 빈병
        }

        return answer;
    }

//    테스트 1 〉	통과 (0.02ms, 74.2MB)
//    테스트 2 〉	통과 (0.01ms, 80.2MB)
//    테스트 3 〉	통과 (0.03ms, 76MB)
//    테스트 4 〉	통과 (0.02ms, 81.8MB)
//    테스트 5 〉	통과 (0.02ms, 66.8MB)
//    테스트 6 〉	통과 (0.02ms, 78.2MB)
//    테스트 7 〉	통과 (0.02ms, 82MB)
//    테스트 8 〉	통과 (0.02ms, 70.1MB)
//    테스트 9 〉	통과 (0.02ms, 85.7MB)
//    테스트 10 〉	통과 (0.02ms, 72MB)
//    테스트 11 〉	통과 (0.03ms, 74.7MB)
//    테스트 12 〉	통과 (0.12ms, 77.5MB)
//    테스트 13 〉	통과 (0.03ms, 74.3MB)
//    테스트 14 〉	통과 (0.02ms, 73.3MB)
}
