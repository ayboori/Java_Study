package Test09.t0908;

// 프로그래머스 lv.1 소수 찾기
public class Haena {
    public int solution(int n) {
        int answer = 0;
        // 2부터 주어진 수 n까지 소수일 경우 answer++하여 소수의 개수를 구한다.
        for (int i = 2; i <= n; i++) {
            if (checkPrimeNum(i)) {
                answer++;
            }
        }
        return answer;
    }

    // 소수 판별 메소드
    private boolean checkPrimeNum(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Haena sol = new Haena();
        System.out.println(sol.solution(10));
        System.out.println(sol.solution(5));
    }
}

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 74.1MB)
테스트 2 〉	통과 (0.09ms, 72.6MB)
테스트 3 〉	통과 (0.38ms, 68.4MB)
테스트 4 〉	통과 (0.34ms, 75.3MB)
테스트 5 〉	통과 (0.20ms, 81.5MB)
테스트 6 〉	통과 (3.15ms, 77.3MB)
테스트 7 〉	통과 (0.64ms, 72MB)
테스트 8 〉	통과 (1.18ms, 79MB)
테스트 9 〉	통과 (2.83ms, 71.7MB)
테스트 10 〉	통과 (83.32ms, 77MB)
테스트 11 〉	통과 (290.81ms, 72.4MB)
테스트 12 〉	통과 (63.58ms, 74.3MB)
효율성  테스트
테스트 1 〉	통과 (202.64ms, 52.6MB)
테스트 2 〉	통과 (325.01ms, 51.9MB)
테스트 3 〉	통과 (201.11ms, 52.1MB)
테스트 4 〉	통과 (205.51ms, 52MB)
 */