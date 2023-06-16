// lv.1 제일 작은 수 제거하기
package Test06.Test0616_P;

import java.util.Arrays;

public class Other_H {
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        // 테스트 케이스 출력
        int[] a = {4,3,2,1};
        int[] b = {10};
        System.out.println(Arrays.toString(sol1.solution(a)));
        System.out.println(Arrays.toString(sol1.solution(b)));
    }
}

class Solution1 {
    // stream(), filter() 사용 -> 코드 줄은 짧지만 통과시간이 오래 소요됨
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}

/* 통과시간: 2.31ms ~ 7.73ms
테스트 1 〉	통과 (7.73ms, 96.7MB)
테스트 2 〉	통과 (3.84ms, 78.8MB)
테스트 3 〉	통과 (4.18ms, 75.7MB)
테스트 4 〉	통과 (3.33ms, 76.9MB)
테스트 5 〉	통과 (2.85ms, 72.3MB)
테스트 6 〉	통과 (2.97ms, 71.3MB)
테스트 7 〉	통과 (3.86ms, 74.9MB)
테스트 8 〉	통과 (2.52ms, 72.2MB)
테스트 9 〉	통과 (4.73ms, 77MB)
테스트 10 〉	통과 (2.67ms, 74.6MB)
테스트 11 〉	통과 (2.38ms, 75.4MB)
테스트 12 〉	통과 (2.31ms, 73.5MB)
테스트 13 〉	통과 (5.11ms, 76.5MB)
테스트 14 〉	통과 (3.30ms, 77MB)
테스트 15 〉	통과 (3.56ms, 80.3MB)
테스트 16 〉	통과 (3.02ms, 73.2MB)
 */
