// lv.1 제일 작은 수 제거하기
package Test06.Test0616_P;

import java.util.Arrays;

public class Jisoo2 {
    public static void main( String[] args ) {
        Jisoo2 jisoo2 = new Jisoo2();

        int[] t1 = { 4, 3, 2, 1 };
        int[] t2 = { 10 };
        int[] t3 = { 4, 1, 2, 3 };
        int[] t4 = { 10, 8, 6, 4, 7, 5, 1, 2, 3, 9 };
        //            0  1  2  3  4  5  6  7  8  9
        int[] t5 = { 1, 2, 3, 4 };

        System.out.println( Arrays.toString( jisoo2.solution( t1 ) ) );
        System.out.println( Arrays.toString( jisoo2.solution( t2 ) ) );
        System.out.println( Arrays.toString( jisoo2.solution( t3 ) ) );
        System.out.println( Arrays.toString( jisoo2.solution( t4 ) ) );
        System.out.println( Arrays.toString( jisoo2.solution( t5 ) ) );

    }

    public int[] solution( int[] arr ) {
        // 배열의 길이가 1일 때, { -1 } return
        if ( arr.length == 1 ) {
            return new int[] { -1 };
        }

        // int배열 arr의 최솟값이 있는 index 구하기
        int minIndex = 0;
        for ( int i = 1; i < arr.length; i++ ) {
            if ( arr[minIndex] > arr[i] ) {
                minIndex = i;
            }
        }

        // index 기준 왼쪽 배열과 오른쪽 배열 구하기
        int[] left = Arrays.copyOfRange( arr, 0, minIndex );
        int[] right = Arrays.copyOfRange( arr, minIndex + 1, arr.length );

        // answer에 왼쪽에는 left, 오른쪽에는 right 배열 대입
        int[] answer = new int[arr.length - 1];
        System.arraycopy( left, 0, answer, 0, left.length );
        System.arraycopy( right, 0, answer, left.length, right.length );

        return answer;
    }

}
/*
최대 시간 : 2.36ms

테스트 1 〉	통과 (2.36ms, 113MB)
테스트 2 〉	통과 (0.04ms, 72.9MB)
테스트 3 〉	통과 (0.05ms, 72.7MB)
테스트 4 〉	통과 (0.04ms, 85.7MB)
테스트 5 〉	통과 (0.04ms, 65.9MB)
테스트 6 〉	통과 (0.05ms, 81.1MB)
테스트 7 〉	통과 (0.06ms, 79.6MB)
테스트 8 〉	통과 (0.04ms, 79.5MB)
테스트 9 〉	통과 (0.03ms, 81MB)
테스트 10 〉	통과 (0.02ms, 77.3MB)
테스트 11 〉	통과 (0.02ms, 80.3MB)
테스트 12 〉	통과 (0.03ms, 73.9MB)
테스트 13 〉	통과 (0.04ms, 82.2MB)
테스트 14 〉	통과 (0.05ms, 72.5MB)
테스트 15 〉	통과 (0.03ms, 73.6MB)
테스트 16 〉	통과 (0.07ms, 81.1MB)
 */
