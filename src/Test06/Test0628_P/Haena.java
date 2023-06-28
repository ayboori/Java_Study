// lv.1 시저 암호
package Test06.Test0628_P;

public class Haena {
    public static void main(String[] args) {
        SolutionHn sol = new SolutionHn();
        System.out.println(sol.solution("AB", 1));
        System.out.println(sol.solution("z", 1));
        System.out.println(sol.solution("a B z", 4));
        System.out.println(sol.solution("Z", 10));
        System.out.println(sol.solution(" aBZ", 20));
        System.out.println(sol.solution("y X Z", 4));
        System.out.println(sol.solution(" . h z", 20));
    }
}

class SolutionHn {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            // 소문자 z 혹은 대문자 Z를 지나갈 경우 a / A 로 순환 후 n만큼 이동하도록 설정
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z' && sb.charAt(i) + n > 'Z'
                    || sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z' && sb.charAt(i) + n > 'z') {
                sb.setCharAt(i, (char) (sb.charAt(i) - 26 + n));

            // 나머지 소문자 혹운 대문자일 경우 n만큼 이동하도록 설정
            } else if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'
                    || sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
                sb.setCharAt(i, (char) (sb.charAt(i) + n));
            }
        }
        return sb.toString();
    }
}

/* 0.06ms ~ 2.14ms
테스트 1 〉	통과 (0.06ms, 71.8MB)
테스트 2 〉	통과 (0.16ms, 78.4MB)
테스트 3 〉	통과 (0.08ms, 70.3MB)
테스트 4 〉	통과 (0.07ms, 73.7MB)
테스트 5 〉	통과 (0.06ms, 70.4MB)
테스트 6 〉	통과 (0.06ms, 72.9MB)
테스트 7 〉	통과 (0.08ms, 72.9MB)
테스트 8 〉	통과 (0.07ms, 75.7MB)
테스트 9 〉	통과 (0.15ms, 75MB)
테스트 10 〉	통과 (0.07ms, 83.8MB)
테스트 11 〉	통과 (0.20ms, 78.2MB)
테스트 12 〉	통과 (0.18ms, 79MB)
테스트 13 〉	통과 (2.14ms, 78.6MB)
 */
