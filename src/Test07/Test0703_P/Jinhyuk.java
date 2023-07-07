package Test07.Test0703_P;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        int n1 = 45;
        int n2 = 125;
        int n3 = 181244;
        int n4 = 8796042;

        System.out.println(jinhyuk.solution(n1));
        System.out.println(jinhyuk.solution(n2));
        System.out.println(jinhyuk.solution(n3));
        System.out.println(jinhyuk.solution(n4));
    }

    public int solution(int n) {
        int answer = 0; // answer 초기화

        String threeStrikes = ""; // 삼진법을 뭐라고 표현할까 하다가 검색해보니 영어로 threeStrikes라고 함

//        boolean flag = true; // ?

        while (n <= 100000000 && n >= 1) { //자연수 n이 매개변수로 주어진다 1이상 100,000,000이하

            threeStrikes = (n % 3) + threeStrikes; // 삼진법 만들기 부분
            // 8을 넣었다고 칠시 2가 남아서 먼저 저장이 되고
            n /= 3; // n은 2가 됩니다.

            // 다시 n은 while문의 범위안에 속하므로 반복하면서
            // 2가 남아서 22가 되고 n/3으로 0이되며 반복이 종료됩니다.
//            continue; 뭔가에 홀린듯이 적었었는데 없는게 더 빠름
        }

        threeStrikes = new StringBuilder(threeStrikes).reverse().toString();
        // new StringBuilder 를 생성하고 threeStrikes를 초기값으로 가집니다
        // reverse() 반대로 뒤집어주는 메소드 < - 를 이용하여 반대로 뒤집습니다
        // toString으로 뒤집힌 문자열을 다시 string으로 변환합니다.

        answer = Integer.parseInt(threeStrikes, 3);
        // parseInt(문자열, 문자열의 진법) <- 특정 문자열을 몇진법으로 나타낸것인지 알려주면 10진법으로 바꿔준다.

        return answer; // answer 를 반환함
    }
}

   /* 채점을 시작합니다. no continue
        정확성  테스트
        테스트 1 〉	통과 (8.64ms, 79MB)
        테스트 2 〉	통과 (11.38ms, 83MB)
        테스트 3 〉	통과 (8.64ms, 79.2MB)
        테스트 4 〉	통과 (10.55ms, 75.3MB)
        테스트 5 〉	통과 (12.10ms, 77MB)
        테스트 6 〉	통과 (10.21ms, 75.2MB)
        테스트 7 〉	통과 (10.94ms, 73.3MB)
        테스트 8 〉	통과 (9.45ms, 80.3MB)
        테스트 9 〉	통과 (11.56ms, 79.3MB)
        테스트 10 〉	통과 (9.60ms, 78.6MB)
        */

