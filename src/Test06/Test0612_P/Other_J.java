package Test06.Test0612_P;

import java.util.Arrays;

public class Other_J {
    public static void main( String[] args ) {
        Other_J oj = new Other_J();

        // 프로그래머스 문제에서 나오는 예제들
        String t1 = "1 2 3 4";
        String t2 = "-1 -2 -3 -4";
        String t3 = "-1 -1";

        System.out.println( oj.solution( t1 ) );
        System.out.println( oj.solution( t2 ) );
        System.out.println( oj.solution( t3 ) );

    }

    public String solution( String s ) {
        String[] arrStr = s.split( " " );
        int[] arrInt = new int[arrStr.length];
        int i = 0;
        for ( String part : arrStr ) {
            arrInt[i] = Integer.parseInt( part );
            i++;
        }

        StringBuffer sb = new StringBuffer();
        sb.append( Arrays.stream( arrInt ).min().getAsInt() );
        sb.append( " " );
        sb.append( Arrays.stream( arrInt ).max().getAsInt() );

        return sb.toString();
    }
}

/*
테스트 1 〉	통과 (1.68ms, 74.2MB)
테스트 2 〉	통과 (1.83ms, 72.1MB)
테스트 3 〉	통과 (1.56ms, 72.8MB)
테스트 4 〉	통과 (1.66ms, 77.8MB)
테스트 5 〉	통과 (1.58ms, 71.9MB)
테스트 6 〉	통과 (1.31ms, 76.4MB)
테스트 7 〉	통과 (1.03ms, 74.8MB)
테스트 8 〉	통과 (1.20ms, 69.9MB)
테스트 9 〉	통과 (1.50ms, 77.9MB)
테스트 10 〉	통과 (1.24ms, 85.8MB)
테스트 11 〉	통과 (1.50ms, 75.5MB)
테스트 12 〉	통과 (1.23ms, 74.8MB)

*/