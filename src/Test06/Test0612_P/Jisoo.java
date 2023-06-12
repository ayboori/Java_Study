// 최댓값과 최솟값

package Test06.Test0612_P;

public class Jisoo {
    // 예시를 이용하여 solution 메서드를 잘 구현했는지 확인하는 main 메서드
    public static void main( String[] args ) {
        Jisoo js = new Jisoo();

        // 프로그래머스 문제에서 나오는 예제들
        String t1 = "1 2 3 4";
        String t2 = "-1 -2 -3 -4";
        String t3 = "-1 -1";

        System.out.println( js.solution( t1 ) );
        System.out.println( js.solution( t2 ) );
        System.out.println( js.solution( t3 ) );

    }

    // solution 메서드
    public String solution( String s ) {
        String answer = "";
        String[] sp = s.split( " " );
        int min = Integer.parseInt( sp[0] );
        int max = Integer.parseInt( sp[0] );
        for ( int i = 0; i < sp.length; i++ ) {
            min = Math.min( min, Integer.parseInt( sp[i] ) );
            max = Math.max( max, Integer.parseInt( sp[i] ) );
        }
        answer = min + " " + max;
        // 문제 푸는 부분
        return answer;
    }
}
/*

다른 사람 풀이 중에 배열을 정렬해서 푸신 분도 있었음!

첫번째는 Math.min, Math.max를 이용하여 풀었고,
두번째는 조건문을 이용하여 풀었다.
둘 다 비슷한 방식이나 후자가 조금 더 시간이 빠르긴 했다.

테스트 1 〉	통과 (11.91ms, 86.3MB)
테스트 2 〉	통과 (11.23ms, 67.3MB)
테스트 3 〉	통과 (16.26ms, 82.6MB)
테스트 4 〉	통과 (13.98ms, 77MB)
테스트 5 〉	통과 (12.25ms, 90.4MB)
테스트 6 〉	통과 (11.09ms, 81.4MB)
테스트 7 〉	통과 (8.76ms, 76.2MB)
테스트 8 〉	통과 (10.61ms, 77.5MB)
테스트 9 〉	통과 (17.47ms, 82.4MB)
테스트 10 〉통과 (9.81ms, 77.7MB)
테스트 11 〉통과 (10.37ms, 83.6MB)
테스트 12 〉통과 (8.32ms, 79.7MB)

 */
