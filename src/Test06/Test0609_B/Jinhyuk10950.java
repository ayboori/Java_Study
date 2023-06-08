package Test06.Test0609_B;

import java.util.Scanner;
public class Jinhyuk10950 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int a = 0; //a값을 초기화한 후
        int repeat = sc.nextInt(); //반복횟수를 받아옵니다
        while (a < repeat){ //a가 반복횟수 이하일시
            a = a+1; //a값에 1을 더해준 후
            int b = sc.nextInt(); //첫번째 숫자인 b를 받아오고
            int c = sc.nextInt(); //두번째 숫자인 c를 받아온다
            System.out.println(b+c); //두 수를 더한 값을 출력한다.
        }
        sc.close();
    }
}
