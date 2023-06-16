package Test06.Test0614_P;

public class Other_H2 {
    // 메소드 사용
    public static void main( String[] args ) {
        Other_H2 hn = new Other_H2();

        // 프로그래머스 문제에서 나오는 예제들
        String s1 = "abcde";
        String s2 = "qwer";

        System.out.println( hn.solution( s1 ) );
        System.out.println( hn.solution( s2 ) );

    }

        public String solution(String s) {
            Other_H2 hn = new Other_H2();
            String answer = hn.getMiddle(s);
            return answer;
        }

        private String getMiddle(String word) {
            return word.substring((word.length()-1)/2, word.length()/2 + 1);
        }
    }
    /* 0.01ms ~ 0.04ms 통과
    테스트 1 〉	통과 (0.02ms, 73.8MB)
    테스트 2 〉	통과 (0.02ms, 94.4MB)
    테스트 3 〉	통과 (0.04ms, 64.5MB)
    테스트 4 〉	통과 (0.03ms, 67.2MB)
    테스트 5 〉	통과 (0.02ms, 72.6MB)
    테스트 6 〉	통과 (0.02ms, 82.7MB)
    테스트 7 〉	통과 (0.02ms, 76MB)
    테스트 8 〉	통과 (0.04ms, 73.1MB)
    테스트 9 〉	통과 (0.03ms, 72.8MB)
    테스트 10 〉	통과 (0.02ms, 84.6MB)
    테스트 11 〉	통과 (0.02ms, 75.7MB)
    테스트 12 〉	통과 (0.03ms, 66.8MB)
    테스트 13 〉	통과 (0.02ms, 77.4MB)
    테스트 14 〉	통과 (0.03ms, 71.2MB)
    테스트 15 〉	통과 (0.03ms, 70.7MB)
    테스트 16 〉	통과 (0.01ms, 71.4MB)
     */
