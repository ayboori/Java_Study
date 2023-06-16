package Test06.Test0616_P;

import java.util.Arrays;

public class Other_J {
    public static void main( String[] args ) {
        Other_J otherJ = new Other_J();

        int[] t1 = { 4, 3, 2, 1 };
        int[] t2 = { 10 };
        int[] t3 = { 4, 1, 2, 3 };

        System.out.println( Arrays.toString( otherJ.solution( t1 ) ) );
        System.out.println( Arrays.toString( otherJ.solution( t2 ) ) );
        System.out.println( Arrays.toString( otherJ.solution( t3 ) ) );

    }

    public int[] solution( int[] arr ) {
        if ( arr.length == 1 ) {
            int[] answer = { -1 };
            return answer;
        }

        int[] answer = new int[arr.length - 1];
        int minIndex = 0;

        // 최솟값이 있는 index 구하기
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[minIndex] > arr[i] ) {
                minIndex = i;
            }
        }

        // 최솟값이 있는 minIndex를 기분으로 arr배열 땡겨서 대입
        for ( int i = minIndex + 1; i < arr.length; i++ ) {
            arr[i - 1] = arr[i];
        }

        // arr[i]를 answer[i]에 answer의 길이만큼 대입.
        for ( int i = 0; i < answer.length; i++ ) {
            answer[i] = arr[i];
        }

        return answer;
    }

}

/*
최대 시간 2.28ms

테스트 1 〉	통과 (2.28ms, 83.2MB)
테스트 2 〉	통과 (0.05ms, 78.6MB)
테스트 3 〉	통과 (0.04ms, 81.6MB)
테스트 4 〉	통과 (0.03ms, 82.6MB)
테스트 5 〉	통과 (0.02ms, 71.9MB)
테스트 6 〉	통과 (0.05ms, 76.5MB)
테스트 7 〉	통과 (0.06ms, 72.7MB)
테스트 8 〉	통과 (0.02ms, 75.1MB)
테스트 9 〉	통과 (0.02ms, 71.5MB)
테스트 10 〉통과 (0.03ms, 82.8MB)
테스트 11 〉통과 (0.03ms, 82.4MB)
테스트 12 〉통과 (0.01ms, 77.9MB)
테스트 13 〉통과 (0.03ms, 64.8MB)
테스트 14 〉통과 (0.08ms, 74.3MB)
테스트 15 〉통과 (0.04ms, 77.7MB)
테스트 16 〉통과 (0.09ms, 83.2MB)
 */