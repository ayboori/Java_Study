// lv.1 제일 작은 수 제거하기
package Test06.Test0616_P;

import java.util.Arrays;

public class Other_J_2 {
    public static void main( String[] args ) {
        Other_J_2 otherJ2 = new Other_J_2();

        int[] t1 = { 4, 3, 2, 1 };
        int[] t2 = { 10 };
        int[] t3 = { 4, 1, 2, 3 };

        System.out.println( Arrays.toString( otherJ2.solution( t1 ) ) );
        System.out.println( Arrays.toString( otherJ2.solution( t2 ) ) );
        System.out.println( Arrays.toString( otherJ2.solution( t3 ) ) );

    }

    public int[] solution( int[] arr ) {
        // 배열의 길이가 1일 때, { -1 } return
        if ( arr.length == 1 ) {
            return new int[] { -1 };
        }

        int[] answer = new int[arr.length - 1];
        int left = 0;       // 왼쪽 index
        int right = arr.length - 1; // 오른쪽 index

        // 왼쪽 index가 오른쪽 index보다 작을 때까지
        while ( left < right ) {
            // 두 개의 값을 비교하여 최솟값이 아닌 애를 answer 배열에 방향대로 순서대로 하나씩 넣는다!
            if ( arr[left] < arr[right] ) {
                answer[right - 1] = arr[right];
                right -= 1;

            } else {
                answer[left] = arr[left];
                left += 1;
            }

        }

        return answer;
    }

}

/*

최대 1.44ms

테스트 1 〉	통과 (1.44ms, 95.4MB)
테스트 2 〉	통과 (0.03ms, 85.5MB)
테스트 3 〉	통과 (0.04ms, 81.4MB)
테스트 4 〉	통과 (0.02ms, 75.1MB)
테스트 5 〉	통과 (0.03ms, 89.4MB)
테스트 6 〉	통과 (0.05ms, 69.5MB)
테스트 7 〉	통과 (0.06ms, 71.8MB)
테스트 8 〉	통과 (0.02ms, 73.5MB)
테스트 9 〉	통과 (0.03ms, 65.8MB)
테스트 10 〉	통과 (0.02ms, 82.1MB)
테스트 11 〉	통과 (0.03ms, 72.5MB)
테스트 12 〉	통과 (0.03ms, 79.8MB)
테스트 13 〉	통과 (0.02ms, 63.6MB)
테스트 14 〉	통과 (0.05ms, 88.9MB)
테스트 15 〉	통과 (0.04ms, 77.7MB)
테스트 16 〉	통과 (0.07ms, 66.1MB)

 */
