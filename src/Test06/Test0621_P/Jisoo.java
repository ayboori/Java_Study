// lv.1 약수의 개수와 덧셈
package Test06.Test0621_P;

public class Jisoo {
    public static void main( String[] args ) {
        Jisoo jisoo = new Jisoo();

        System.out.println( jisoo.solution( 13, 17 ) );
        System.out.println( jisoo.solution( 24, 27 ) );

    }

    public int solution( int left, int right ) {
        int answer = 0;
        for ( int i = left; i <= right; i++ ) {
            answer += isSquareNumber( i ) ? ( -1 ) * i : i;
        }
        return answer;
    }

    public boolean isSquareNumber( int num ) {
        return ( (int) Math.sqrt( num ) ) * ( (int) Math.sqrt( num ) ) == num ? true : false;
    }

}

/*
테스트 1 〉	통과 (0.11ms, 78.3MB)
테스트 2 〉	통과 (0.07ms, 75.6MB)
테스트 3 〉	통과 (0.07ms, 70.8MB)
테스트 4 〉	통과 (0.03ms, 77.5MB)
테스트 5 〉	통과 (0.16ms, 77.8MB)
테스트 6 〉	통과 (0.03ms, 76.6MB)
테스트 7 〉	통과 (0.04ms, 78.8MB)
 */