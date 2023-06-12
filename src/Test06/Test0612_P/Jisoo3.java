package Test06.Test0612_P;

public class Jisoo3 {
    public static void main( String[] args ) {
        Jisoo3 js3 = new Jisoo3();

        // 프로그래머스 문제에서 나오는 예제들
        String t1 = "1 2 3 4";
        String t2 = "-1 -2 -3 -4";
        String t3 = "-1 -1";

        System.out.println( js3.solution( t1 ) );
        System.out.println( js3.solution( t2 ) );
        System.out.println( js3.solution( t3 ) );

    }

    // solution 메서드
    public String solution( String s ) {
        StringBuilder sb = new StringBuilder();
        String[] sp = s.split( " " );

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for ( int i = 0; i < sp.length; i++ ) {
            int ele = Integer.parseInt( sp[i] );
            if ( min > ele ) {
                min = ele;
            }
            if ( max < ele ) {
                max = ele;
            }
        }

        sb.append( min );
        sb.append( " " );
        sb.append( max );

        return sb.toString();
    }
}

/*
테스트 1 〉	통과 (0.24ms, 67.4MB)
테스트 2 〉	통과 (0.28ms, 75.5MB)
테스트 3 〉	통과 (0.15ms, 74.6MB)
테스트 4 〉	통과 (0.16ms, 73.9MB)
테스트 5 〉	통과 (0.36ms, 75.6MB)
테스트 6 〉	통과 (0.23ms, 66.3MB)
테스트 7 〉	통과 (0.12ms, 74.8MB)
테스트 8 〉	통과 (0.21ms, 73.2MB)
테스트 9 〉	통과 (0.12ms, 73.6MB)
테스트 10 〉통과 (0.28ms, 78.7MB)
테스트 11 〉통과 (0.10ms, 74.3MB)
테스트 12 〉통과 (0.27ms, 76.2MB)
 */

// 이게 더 빨리 나오는 이유와 stream에 대해서!