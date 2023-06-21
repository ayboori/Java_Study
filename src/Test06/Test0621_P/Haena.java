// lv.1 약수의 개수와 덧셈
package Test06.Test0621_P;

public class Haena {
    public static void main(String[] args) {
        SolutionHn sol = new SolutionHn();

        System.out.println(sol.solution(13, 17));
        System.out.println(sol.solution(24, 27));
        System.out.println(sol.solution(2, 9));
    }
}

class SolutionHn {
    public int solution(int left, int right) {
        int answer = 0;

        // 2차배열 {숫자, 약수개수},...
        int[][] arr = new int[(right-left+1)][2];

        for (int i = 0; i < arr.length; i++) {
            // 하나의 배열 중 앞에 숫자 넣기
            arr[i][0] = left + i;
            int num = arr[i][0];

            // 하나의 배열 중 뒤에 약수 구해 넣기
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    arr[i][1]++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i][0]; // 숫자
            int divisorCnt = arr[i][1]; // 약수의 개수

            // 약수의 개수가 짝수인 경우 +
            if (divisorCnt % 2 == 0) {
                answer  = answer + num;
            }

            // 약수의 개수가 홀수인 경우 -
            else if (divisorCnt % 2 == 1) {
                answer = answer - num;
            }
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (5.12ms, 73.4MB)
테스트 2 〉	통과 (1.82ms, 75MB)
테스트 3 〉	통과 (1.39ms, 77.2MB)
테스트 4 〉	통과 (0.55ms, 79.5MB)
테스트 5 〉	통과 (4.05ms, 80.6MB)
테스트 6 〉	통과 (0.40ms, 77.2MB)
테스트 7 〉	통과 (0.17ms, 73.7MB)
 */