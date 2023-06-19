// lv.2 JadenCase 문자열 만들기
package Test06.Test0619_P;

public class Jisoo {
    public static void main( String[] args ) {

        Jisoo jisoo = new Jisoo();
        String t1 = "3people unFollowed me";
        String t2 = "for  the last week";   // 기존 예제에서 중간에 공백 추가
        String t3 = "  a a   ";             // 내가 만든 예제

        System.out.println( jisoo.solution( t1 ) );
        System.out.println( jisoo.solution( t2 ) );
        System.out.println( jisoo.solution( t3 ) );

        // 공백이 연속으로 올 수 있고, 앞뒤로 공백이 있을 수 있다.
        //    --> split x(split 사용하는 방법이 있을 수 있으나 떠오르지 않음)
        // 이 조건을 생각 못해서 한참 헤맸다.. ㅠㅠ

        // 로직

        // 1. 리턴값이 될 StringBuilder sb로 초기화.
        // 2. 다 소문자로 바꾸기
        // 3. 처음에는 flag를 true로 설정한다.

        // 4. flag가 true일 때 char를 검사하는데 " 공백이 아님 && 소문자 "이면 대문자로 바꿔줌
        //    sb에 append한다. append해준 뒤에는 바로 flag를 false로 바꾼다.
        // 5. char를 검사하다가 char가 공백이면 flag를 true로 바꾼다.

        // 반복
    }

    public String solution( String s ) {
        StringBuilder sb = new StringBuilder();

        // 다 소문자로 바꿔놓고 시작한다!
        s = s.toLowerCase();

        // 각 단어의 첫 char를 찾기 위한 검사 스위치..! 켜지면 다음 단어의 첫 글자를 검사한다!
        boolean flag = true;

        for ( int i = 0; i < s.length(); i++ ) {
            char temp = s.charAt( i );
            // temp가 공백이면 검사 스위치를 켭니다.
            if ( temp == ' ' ) {
                flag = true;
            }

            if ( flag ) {
                // temp가 공백이 아니고,
                if ( temp != ' ' ) {
                    // temp가 소문자라면
                    if ( 97 <= temp && temp <= 122 ) {
                        // temp를 대문자로 바꿔주세요.
                        temp = (char) ( temp - 32 );
                    }
                    // temp가 공백이 아니면 대문자로 바꿔주고 검사 스위치를 끕니다.
                    flag = false;
                }
            }

            sb.append( temp );
        }

        return sb.toString();
    }

}
/*

유후~~

테스트 1 〉통과 (0.04ms, 69.8MB)
테스트 2 〉통과 (0.07ms, 72.5MB)
테스트 3 〉통과 (0.04ms, 75.5MB)
테스트 4 〉통과 (0.09ms, 76.8MB)
테스트 5 〉통과 (0.05ms, 73.4MB)
테스트 6 〉통과 (0.05ms, 75.1MB)
테스트 7 〉통과 (0.05ms, 77.5MB)
테스트 8 〉통과 (0.04ms, 74.2MB)
테스트 9 〉통과 (0.05ms, 73.6MB)
테스트 10 〉통과 (0.04ms, 77.7MB)
테스트 11 〉통과 (0.05ms, 75.5MB)
테스트 12 〉통과 (0.05ms, 71.5MB)
테스트 13 〉통과 (0.05ms, 73.7MB)
테스트 14 〉통과 (0.06ms, 76.4MB)
테스트 15 〉통과 (0.05ms, 83.5MB)
테스트 16 〉통과 (0.03ms, 75.6MB)
테스트 17 〉통과 (0.04ms, 76.8MB)
테스트 18 〉통과 (0.02ms, 73.1MB)
 */