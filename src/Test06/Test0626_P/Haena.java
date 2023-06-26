// lv. 1 최대공약수와 최소공배수
package Test06.Test0626_P;

import java.util.Arrays;

public class Haena {
    public static void main(String[] args) {
        SolutionHn sol = new SolutionHn();
        System.out.println(Arrays.toString(sol.solution(3, 12)));
        System.out.println(Arrays.toString(sol.solution(2, 5)));
        System.out.println(Arrays.toString(sol.solution(4, 20)));
        System.out.println(Arrays.toString(sol.solution(3, 7)));
    }

}

class SolutionHn {
    public int[] solution(int n, int m) {
        // 최대공약수 구하기
        int g = 0;
        int min = Math.min(n, m);
        for (int i = min; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                g = i;
                break;
            }
        }

        // 최소공배수 구하기
        int l = m * n / g;

        return new int[] {g, l};
    }
}

/* 0.02ms ~ 0.10ms
테스트 1 〉	통과 (0.02ms, 78.2MB)
테스트 2 〉	통과 (0.03ms, 76.6MB)
테스트 3 〉	통과 (0.05ms, 77.7MB)
테스트 4 〉	통과 (0.03ms, 76.8MB)
테스트 5 〉	통과 (0.02ms, 71.1MB)
테스트 6 〉	통과 (0.04ms, 77.1MB)
테스트 7 〉	통과 (0.04ms, 72MB)
테스트 8 〉	통과 (0.03ms, 74.1MB)
테스트 9 〉	통과 (0.04ms, 77.9MB)
테스트 10 〉	통과 (0.03ms, 76.1MB)
테스트 11 〉	통과 (0.04ms, 78.6MB)
테스트 12 〉	통과 (0.10ms, 76.8MB)
테스트 13 〉	통과 (0.05ms, 71.3MB)
테스트 14 〉	통과 (0.05ms, 72.7MB)
테스트 15 〉	통과 (0.03ms, 73.5MB)
테스트 16 〉	통과 (0.05ms, 77.2MB)
 */
