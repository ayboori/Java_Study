// lv.1 가운데 글자 가져오기
package Test06.Test0614_P;

public class Haena {
    // 예시를 이용하여 solution 메서드를 잘 구현했는지 확인하는 main 메서드
    public static void main( String[] args ) {
        Haena hn = new Haena();

        // 프로그래머스 문제에서 나오는 예제들
        String s1 = "abcde";
        String s2 = "qwer";

        System.out.println( hn.solution( s1 ) );
        System.out.println( hn.solution( s2 ) );

    }

    // solution 메서드
    public String solution( String s ) {
        // 문제 푸는 부분
        int num = 0; // 가운데 위치의 숫자 찾기
        String answer = null; // 가운데 위치의 글자

        // 단어의 글자수가 홀수 일때
        if (s.length() % 2 == 1) {
            num = s.length()/2; // 가운데 숫자 위치 찾기
            // -> 위치가 0부터 시작하므로 +1을 하지 않음. ex.글자 수: 5 -> 가운데 글자의 substring 위치: 2
            answer = s.substring(num, num+1); // 가운데 위치 한 글자 추출

        // 단어의 글자수가 짝수 일때
        } else if (s.length() % 2 == 0) {
            num = (s.length()/2) - 1; // 가운데 숫자 시작 위치 찾기
            // -> 위치가 0부터 시작하므로 -1. ex.글자 수: 4 -> 가운데 글자의 substring 위치: 1
            answer = s.substring(num, num+2); // 가운데 위치 두 글자 추출하기
        }
        return answer;
    }
    /* 0.01ms ~ 0.03ms 통과
    테스트 1 〉	통과 (0.02ms, 72.9MB)
    테스트 2 〉	통과 (0.03ms, 73.9MB)
    테스트 3 〉	통과 (0.02ms, 71.1MB)
    테스트 4 〉	통과 (0.01ms, 73.6MB)
    테스트 5 〉	통과 (0.02ms, 67.1MB)
    테스트 6 〉	통과 (0.03ms, 76.8MB)
    테스트 7 〉	통과 (0.02ms, 86.6MB)
    테스트 8 〉	통과 (0.03ms, 75.9MB)
    테스트 9 〉	통과 (0.01ms, 68.7MB)
    테스트 10 〉	통과 (0.01ms, 76.9MB)
    테스트 11 〉	통과 (0.02ms, 79MB)
    테스트 12 〉	통과 (0.03ms, 70.5MB)
    테스트 13 〉	통과 (0.01ms, 72MB)
    테스트 14 〉	통과 (0.02ms, 73.2MB)
    테스트 15 〉	통과 (0.02ms, 80.4MB)
    테스트 16 〉	통과 (0.01ms, 72.9MB)
     */
}
