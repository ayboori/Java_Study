package Test06.Test0614_P;

public class Other1 {
    // StringBuilder와 append 사용
    public static void main( String[] args ) {
        Other1 hn = new Other1();

        // 프로그래머스 문제에서 나오는 예제들
        String s1 = "abcde";
        String s2 = "qwer";

        System.out.println( hn.solution( s1 ) );
        System.out.println( hn.solution( s2 ) );

    }
        public String solution(String s) {
            StringBuilder sb = new StringBuilder();
            if(s.length()%2 == 1) sb.append(s.substring(s.length()/2,s.length()/2+1));
            else {
                sb.append(s.substring(s.length()/2-1,s.length()/2));
                sb.append(s.substring(s.length()/2,s.length()/2+1));
            }
            return sb.toString();
        }

    /* 0.02ms ~ 0.05ms 통과
    테스트 1 〉	통과 (0.03ms, 72.1MB)
    테스트 2 〉	통과 (0.04ms, 73.5MB)
    테스트 3 〉	통과 (0.02ms, 77.2MB)
    테스트 4 〉	통과 (0.03ms, 68.8MB)
    테스트 5 〉	통과 (0.02ms, 67.6MB)
    테스트 6 〉	통과 (0.05ms, 82.3MB)
    테스트 7 〉	통과 (0.04ms, 76.1MB)
    테스트 8 〉	통과 (0.02ms, 79.6MB)
    테스트 9 〉	통과 (0.03ms, 77.1MB)
    테스트 10 〉	통과 (0.03ms, 74.6MB)
    테스트 11 〉	통과 (0.03ms, 77.7MB)
    테스트 12 〉	통과 (0.02ms, 75.5MB)
    테스트 13 〉	통과 (0.02ms, 78.1MB)
    테스트 14 〉	통과 (0.02ms, 74MB)
    테스트 15 〉	통과 (0.02ms, 75.2MB)
    테스트 16 〉	통과 (0.03ms, 74.3MB)
     */
}
