package Test06.Test0609_B;

import java.util.Scanner;
public class Jinhyuk10951 {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) { //hasNextInt() 메소드로 true, false 값을 출력합니다.
            int a = sc.nextInt(); //첫번째 숫자를 a로 받아오고
            int b = sc.nextInt(); //두번째 숫자를 b로 받아와서
            System.out.println(a+b); //a+b한 값을 받아온다
        }
        sc.close(); //스캐너를 닫는다.
    }
}
// hasNext()는 boolean 값으로 반환합니다.
hasNext()
    hasNextLine()
        hasNextInt()
// 다음에 가져올 값이 있냐 없느냐로 판단합니다.
// hasNextInt()일 경우 다음에 가져올 int값이 있느냐 없느냐로 참 거짓을 판단합니다.