package Test09.t0908;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        int n = 10;
        System.out.println(donghwan.solution(n));
    }

    public int solution(int n) {
        int answer = 0; // 결과값을 저장할 변수 초기화

        int[] number = new int[n + 1]; // 1부터 n까지의 숫자를 저장할 배열 생성

        for (int i = 2; i <= n; i++) {
            number[i] = i; // 2부터 n까지의 수를 배열에 넣는다.
        }

        for (int i = 2; i <= n; i++) { // 에라토스테네스의 체 알고리즘을 처리하기위한 반복문.
            if (number[i] == 0) continue; // 현재 숫자가 이미 처리된 경우 넘어간다.

            for (int j = 2 * i; j <= n; j += i) {
                number[j] = 0; // 현재 숫자의 배수들을 0으로 만든다.
            }
        }

        for (int i = 0; i < number.length; i++) { // number에 접근하기 위한 반복문.
            if (number[i] != 0) { // 0이 아닐때 추가하기 위한 조건문.
                answer++; // 배열에서 0이 아닌 것들의 개수를 센다.
            }
        }
        return answer; // 최종 결과값 반환
    }
}

//        정확성  테스트
//        테스트 1 〉	통과 (0.02ms, 75.1MB)
//        테스트 2 〉	통과 (0.05ms, 78.3MB)
//        테스트 3 〉	통과 (0.09ms, 75.6MB)
//        테스트 4 〉	통과 (0.14ms, 86.5MB)
//        테스트 5 〉	통과 (0.08ms, 72.7MB)
//        테스트 6 〉	통과 (0.91ms, 83.2MB)
//        테스트 7 〉	통과 (0.33ms, 79.8MB)
//        테스트 8 〉	통과 (0.49ms, 66.2MB)
//        테스트 9 〉	통과 (1.13ms, 69.6MB)
//        테스트 10 〉	통과 (8.24ms, 74.6MB)
//        테스트 11 〉	통과 (24.39ms, 88.9MB)
//        테스트 12 〉	통과 (32.07ms, 89.6MB)
//        효율성  테스트
//        테스트 1 〉	통과 (38.83ms, 71.6MB)
//        테스트 2 〉	통과 (25.44ms, 55.1MB)
//        테스트 3 〉	통과 (25.96ms, 55.6MB)
//        테스트 4 〉	통과 (19.51ms, 55.6MB)