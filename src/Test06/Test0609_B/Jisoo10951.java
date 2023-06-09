package Test06.Test0609_B;

import java.util.Scanner;

public class Jisoo10951 {
    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        // 스캐너의 메서드로써 boolean을 return한다.
        // 받은 값이(a) int이면 true를 return한다.
        while ( sc.hasNextInt() ) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println( a + b );
        }
    }
}

// 다른 사람의 풀이

// BufferedRedader, readLine()
// InputStreamReader