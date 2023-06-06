package Test06.Test0607_B;

// 2558의 풀이코드는 1000번과 완전히 동일.
// 아래 코드는 sc.nextInt(), sc.nextLine(), sc.next()를 이해하기 위한 코드 예제

import java.util.Scanner;

public class Jisoo2558 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String e = sc.nextLine();
        String f = sc.nextLine();
        String g = sc.nextLine();
        String h = sc.next();
        String i = sc.next();
        String j = sc.next();
        System.out.println( "a : " + a + ", b : " + b );
        System.out.println( "c : " + c + ", d : " + d );
        System.out.println( "e : " + e + ", f : " + f );
        System.out.println( "g : " + g + ", h : " + h );
        System.out.println( "i : " + i + ", j : " + j );
        /*
           1 2
           3 4
           You look so sad.
           No, I am not sad.
           Ok, I got it
           a : 1, b : 2
           c : 3, d : 4
           e : , f : You look so sad.
           g : No, I am not sad., h : Ok,
           i : I, j : got

           왜 got까지만 들어갔는데 it까지 입력이 될까?

           버퍼는 입력받은 값을 버퍼에 저장해두었다가
           버퍼가 가득차거나 개행 문자가 나타나면 버퍼의 내용을 한 번에 전송하게 된다.
           엔터는 구분자, 전송자의 역할을 하고 스페이스는 구분자의 역할만 하게 된다.

           ///////////////////////////////////

           버퍼란?

           버퍼는 가변적인 크기의 키보드와 프로그램을 이어주는 저장소?쯤으로 생각하면 된다.
           입출력 -> Input / Output -> 우리가 오늘 했던 문제가 I/O 문제!
           Stream -> Byte 형태로 데이터를 운반하는데 사용되는 연결통로
                     뜻 : "강물" -> 강물처럼 단방향이라서!

           입출력을 하기 위해서는 Input Stream, Output Stream. 입력 스트림과 출력 스트림이 필요하다.
           InputStream은 System.in을 사용, OutputStream은 System.out을 사용한다.

           Scanner sc = new Scanner(System.in); 할 때 System.in이 그것.
           System.out.println의 System.out이 그것.

           근데 이 인풋스트림과 아웃풋스트림은 1개의 char값만 받아올 수 있다.
           더 발전적인 형태가 InputStreamReader. 여러 개의 char값을 받아올 수 있지만
           Array처럼 size가 정해져 있다. 3개라고 정해졌으면 3개의 char만 받아올 수 있다.

           버퍼는 이에서 더 발전적인 형태! 가변적인 크기의 데이터를 받아올 수 있는 저장소라고 생각하면 된다.!

           //////////////////////////////////////

           이 두 문제를 통해 알 수 있는 것..!
           sc.nextInt()는 띄어쓰기, 엔터 둘 다 구분자로 인식한다.
           문자열을 받을 때는 주의 해야 한다.

           sc.next() : 단어씩 입력하고자 할 때, 개행문자 무시
           sc.nextLine() : 한 줄씩 입력하고자 할 때, 개행문자 무시x

         */


    }
}



