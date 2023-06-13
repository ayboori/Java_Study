package Test06.Test0614_P;

public class Other_J {
    public static void main( String[] args ) {
        Other_J otherJ = new Other_J();
        String t1 = "abcde";
        String t2 = "qwer";
        System.out.println( otherJ.solution( t1 ) );
        System.out.println( otherJ.solution( t2 ) );

    }

    public String solution( String s ) {
        return s.substring( ( s.length() - 1 ) / 2, s.length() / 2 + 1 );
    }
    // ex. "abcdefg"가 있다고 하면 s.length() = 7
    // s.substring( 3, 4 )
    // ex. "abcdef"가 있다고 하면 s.length() = 6
    // s.substring( 2, 4 )
    // 대단..

}

/*
테스트 1 〉	통과 (0.02ms, 75.9MB)
테스트 2 〉	통과 (0.01ms, 72MB)
테스트 3 〉	통과 (0.03ms, 76.7MB)
테스트 4 〉	통과 (0.01ms, 78.4MB)
테스트 5 〉	통과 (0.02ms, 72.3MB)
테스트 6 〉	통과 (0.02ms, 73.4MB)
테스트 7 〉	통과 (0.02ms, 72.7MB)
테스트 8 〉	통과 (0.02ms, 75.9MB)
테스트 9 〉	통과 (0.03ms, 79.6MB)
테스트 10 〉통과 (0.03ms, 72.8MB)
테스트 11 〉통과 (0.02ms, 73.9MB)
테스트 12 〉통과 (0.03ms, 75.8MB)
테스트 13 〉통과 (0.03ms, 77.4MB)
테스트 14 〉통과 (0.03ms, 72.5MB)
테스트 15 〉통과 (0.02ms, 66.6MB)
테스트 16 〉통과 (0.02ms, 73.6MB)
 */