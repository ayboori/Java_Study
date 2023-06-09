package Test06.Test0609_B;

import java.util.Scanner;

public class Haena10950 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 개수 입력
        int[] values = new int[t];
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt(); // 테스트 정수 띄어쓰기해서 한 줄씩 입력
            values[i] = a + b;
        }
        sc.close();
        for (int value: values) {
            System.out.println(value);
        }
    }
}
