// lv.1 제일 작은 수 제거하기
package Test06.Test0616_P;

import java.util.Arrays;

public class Haena {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // 테스트 케이스 출력
        int[] a = {4,3,2,1};
        int[] b = {10};
        System.out.println(Arrays.toString(sol.solution(a)));
        System.out.println(Arrays.toString(sol.solution(b)));
    }
}

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        // 빈 배열이 아닌 경우
        if (arr.length > 1) {
            // 제일 작은 수 구하기
            int minNum = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minNum) {
                    minNum = arr[i];
                }
            }

            // 제일 작은 수를 제외하고 새로운 배열에 담기
            for(int i = 0, j = 0 ; i<arr.length; i++) {
                if (arr[i] != minNum) {
                    answer[j] = arr[i];
                    j++;
                }
            }

            // 빈 배열인 경우
        } else {
            // [-1] 리턴
            answer = new int[]{-1};
        }

        return answer;
    }
}

/* 통과시간: 0.01ms ~ 1.52ms
테스트 1 〉	통과 (1.52ms, 95.7MB)
테스트 2 〉	통과 (0.03ms, 78MB)
테스트 3 〉	통과 (0.05ms, 78.4MB)
테스트 4 〉	통과 (0.04ms, 73MB)
테스트 5 〉	통과 (0.02ms, 74.7MB)
테스트 6 〉	통과 (0.07ms, 76.8MB)
테스트 7 〉	통과 (0.06ms, 78.5MB)
테스트 8 〉	통과 (0.02ms, 74.3MB)
테스트 9 〉	통과 (0.01ms, 65.8MB)
테스트 10 〉	통과 (0.03ms, 76.6MB)
테스트 11 〉	통과 (0.02ms, 71MB)
테스트 12 〉	통과 (0.02ms, 76.4MB)
테스트 13 〉	통과 (0.02ms, 78.2MB)
테스트 14 〉	통과 (0.05ms, 84MB)
테스트 15 〉	통과 (0.02ms, 75.9MB)
테스트 16 〉	통과 (0.06ms, 79.4MB)
 */
