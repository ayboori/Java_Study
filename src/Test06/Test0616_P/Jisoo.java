// lv.1 제일 작은 수 제거하기
package Test06.Test0616_P;

import java.util.Arrays;

public class Jisoo {
    public static void main( String[] args ) {
        Jisoo js = new Jisoo();

        int[] t1 = { 4, 3, 2, 1 };
        int[] t2 = { 10 };
        int[] t3 = { 4, 1, 2, 3 };

        System.out.println( Arrays.toString( js.solution( t1 ) ) );
        System.out.println( Arrays.toString( js.solution( t2 ) ) );
        System.out.println( Arrays.toString( js.solution( t3 ) ) );

    }

    public int[] solution( int[] arr ) {
        // 배열의 길이가 1일 때, { -1 } return
        if ( arr.length == 1 ) {
            return new int[] { -1 };
        }

        // int배열 arr의 최솟값 구하기
        int min = arr[0];
        for ( int i = 1; i < arr.length; i++ ) {
            if ( min > arr[i] ) {
                min = arr[i];
            }
        }

        // answer배열에 min 아닌 값 차례로 넣기
        int[] answer = new int[arr.length - 1];

        int j = 0;  // answer의 index 역할을 한다.
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] == min ) {
                continue;
            }
            answer[j] = arr[i];
            j++;
        }

        return answer;
    }

}
/*
최대 시간 1.54ms

테스트 1 〉	통과 (1.54ms, 99.5MB)
테스트 2 〉	통과 (0.03ms, 78.7MB)
테스트 3 〉	통과 (0.05ms, 76.3MB)
테스트 4 〉	통과 (0.04ms, 77.4MB)
테스트 5 〉	통과 (0.04ms, 79.4MB)
테스트 6 〉	통과 (0.05ms, 83.2MB)
테스트 7 〉	통과 (0.09ms, 80MB)
테스트 8 〉	통과 (0.02ms, 73.4MB)
테스트 9 〉	통과 (0.02ms, 73.8MB)
테스트 10 〉통과 (0.02ms, 76.6MB)
테스트 11 〉통과 (0.01ms, 77.1MB)
테스트 12 〉통과 (0.02ms, 70.2MB)
테스트 13 〉통과 (0.01ms, 76.1MB)
테스트 14 〉통과 (0.05ms, 77MB)
테스트 15 〉통과 (0.04ms, 73MB)
테스트 16 〉통과 (0.05ms, 74.7MB)
 */
