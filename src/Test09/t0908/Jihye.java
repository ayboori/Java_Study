package Test09.t0908;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();

        int n = 10;
        System.out.println(jh.solution(n));

    }
    public int solution(int n) {
        int answer = 0;

        // 2부터 시작. 1은 소수가 X
        for (int i = 2; i <= n; i++) {
            // flag변수를 하나 만든다.
            boolean flag = true;

            // 배수는 소수가 될 수 없기에 배수 뺴기.
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            // flag가 true일때 소수O. 그렇기에 +1
            if (flag)  answer++;
        }

        return answer;
    }
// ㅋㅋㅋㅋㅋㅋ효율성 테스트 처음 봤습니다~
//    테스트 1 〉	통과 (0.02ms, 70.6MB)
//    테스트 2 〉	통과 (0.05ms, 76MB)
//    테스트 3 〉	통과 (0.09ms, 77.4MB)
//    테스트 4 〉	통과 (0.11ms, 72.6MB)
//    테스트 5 〉	통과 (0.08ms, 73.7MB)
//    테스트 6 〉	통과 (1.38ms, 67.9MB)
//    테스트 7 〉	통과 (0.31ms, 72.7MB)
//    테스트 8 〉	통과 (0.95ms, 80.4MB)
//    테스트 9 〉	통과 (2.04ms, 75.8MB)
//    테스트 10 〉	통과 (42.08ms, 78.3MB)
//    테스트 11 〉	통과 (241.44ms, 99.7MB)
//    테스트 12 〉	통과 (53.11ms, 79MB)
//    효율성  테스트
//    테스트 1 〉	통과 (311.14ms, 53MB)
//    테스트 2 〉	통과 (194.34ms, 52.2MB)
//    테스트 3 〉	통과 (212.38ms, 51.6MB)
//    테스트 4 〉	통과 (196.08ms, 52.5MB)
}
