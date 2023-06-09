package Test06.Test0609_B;

import java.util.Scanner;

public class Jisoo10950 {
    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );

        int num = sc.nextInt();
        // 스캐너로 받은 숫자가 5개이면 길이가 10인 인트 배열을 만든다.
        int[] numbers = new int[num * 2];

        // 인트배열 안에 차곡차곡 받은 숫자의 값을 넣는다.
        for ( int i = 0; i < num * 2; i++ ) {
            numbers[i] = sc.nextInt();
        }

        // 인덱스를 2씩 건너뛰면서 자기자신과 자기자신다음 값을 더해서 print한다.
        for ( int i = 0; i < numbers.length; i += 2 ) {
            System.out.println( numbers[i] + numbers[i + 1] );
        }

    }
}

// 다른 사람의 풀이

// BufferedRedader, readLine()
// InputStreamReader
// StringTokenizer, nextToken()