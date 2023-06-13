// lv.1 가운데 글자 가져오기
package Test06.Test0614_P;

public class Jisoo {
    public static void main( String[] args ) {
        Jisoo jisoo = new Jisoo();
        String t1 = "abcde";
        String t2 = "qwer";
        System.out.println( jisoo.solution( t1 ) );
        System.out.println( jisoo.solution( t2 ) );
    }

    public String solution( String s ) {
        StringBuilder sb = new StringBuilder();
        if ( s.length() % 2 == 1 ) {
            sb.append( s.charAt( s.length() / 2 ) );
        } else {
            sb.append( s.charAt( s.length() / 2 - 1 ) );
            sb.append( s.charAt( s.length() / 2 ) );
        }
        return sb.toString();
    }

}

/*
테스트 1 〉	통과 (0.03ms, 66.3MB)
테스트 2 〉	통과 (0.03ms, 72.4MB)
테스트 3 〉	통과 (0.03ms, 72.6MB)
테스트 4 〉	통과 (0.03ms, 73.5MB)
테스트 5 〉	통과 (0.03ms, 70.8MB)
테스트 6 〉	통과 (0.05ms, 77.4MB)
테스트 7 〉	통과 (0.04ms, 76.3MB)
테스트 8 〉	통과 (0.03ms, 75MB)
테스트 9 〉	통과 (0.03ms, 79.2MB)
테스트 10 〉통과 (0.04ms, 73.4MB)
테스트 11 〉통과 (0.03ms, 80.2MB)
테스트 12 〉통과 (0.04ms, 73.4MB)
테스트 13 〉통과 (0.04ms, 79.4MB)
테스트 14 〉통과 (0.04ms, 76.3MB)
테스트 15 〉통과 (0.03ms, 77.9MB)
테스트 16 〉통과 (0.03ms, 78.4MB)
 */

