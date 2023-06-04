// hello World! 출력하는 메서드 구현 후 풀 리퀘스트 하기

package Test06.Test0605_P;

public class Jisoo_P {
    // 예시를 이용하여 solution 메서드를 잘 구현했는지 확인하는 main 메서드
    public static void main( String[] args ) {
        // 원래는 Sol 클래스를 따로 만들어서 거기에서 solution 메서드를 만들고
        // 코드가 돌아가는 부분인 Main클래스에서
        // Sol sol = new Sol(); -> 만든 클래스를 객체화
        // sol.soution의 방법으로 메서드를 호출했지만

        // 여기서는 파일의 간소화를 위해 코드가 돌아가는 클래스에서 메서드를 만들어
        // 자체 클래스를 메인메서드에서 객체화 해준 후 메서드를 사용.

        // 자체 클래스를 객체화 하지 않으면 solution메서드는 돌아가지 않음.
        //  main 메서드는 static 메서드이고, static 메서드에서는 static 메서드만 사용할 수 있게끔 되어 있다.
        // solution 메서드를 static화 해주면 바로 사용할 수 있긴 함!
        Jisoo_P js = new Jisoo_P();

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
        // 문제 푸는 부분
        return answer;
    }
}
