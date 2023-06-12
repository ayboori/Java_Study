package Test06.Test0612_P;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Jisoo2 {
    public static void main( String[] args ) {
        Jisoo2 js2 = new Jisoo2();

        // 프로그래머스 문제에서 나오는 예제들
        String t1 = "1 2 3 4";
        String t2 = "-1 -2 -3 -4";
        String t3 = "-1 -1";

        System.out.println( js2.solution( t1 ) );
        System.out.println( js2.solution( t2 ) );
        System.out.println( js2.solution( t3 ) );

    }

    // solution 메서드
    public String solution( String s ) {
        StringBuilder sb = new StringBuilder();
        String[] sp = s.split( " " );

        int max = Integer.parseInt( sp[0] );
        int min = Integer.parseInt( sp[0] );
        for ( int i = 1; i < sp.length; i++ ) {
            int ele = Integer.parseInt( sp[i] );
            if ( min > ele ) {
                min = ele;
            }
            if ( max < ele ) {
                max = ele;
            }
        }
        sb.append( min + " " + max );
        return sb.toString();
    }
}

/*

테스트 1 〉	통과 (8.90ms, 67.8MB)
테스트 2 〉	통과 (9.17ms, 77.2MB)
테스트 3 〉	통과 (8.19ms, 77.8MB)
테스트 4 〉	통과 (10.69ms, 77.2MB)
테스트 5 〉	통과 (7.17ms, 77.1MB)
테스트 6 〉	통과 (9.75ms, 74.6MB)
테스트 7 〉	통과 (9.94ms, 75.9MB)
테스트 8 〉	통과 (10.32ms, 77.6MB)
테스트 9 〉	통과 (7.90ms, 81.2MB)
테스트 10 〉통과 (11.14ms, 89.1MB)
테스트 11 〉통과 (10.62ms, 72.2MB)
테스트 12 〉통과 (11.14ms, 77.2MB)

 */
