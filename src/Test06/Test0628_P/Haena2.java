// lv.1 시저 암호
package Test06.Test0628_P;

public class Haena2 {
    public static void main(String[] args) {
        SolutionHn2 sol = new SolutionHn2();
        System.out.println(sol.solution("AB", 1));
        System.out.println(sol.solution("z", 1));
        System.out.println(sol.solution("a B z", 4));
        System.out.println(sol.solution("Z", 10));
        System.out.println(sol.solution(" aBZ", 20));
        System.out.println(sol.solution("y X Z", 4));
        System.out.println(sol.solution(" . h z", 20));
    }
}

class SolutionHn2 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            // 소문자 z 혹은 대문자 Z를 지나갈 경우 a / A 로 순환 후 n만큼 이동하도록 설정
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && s.charAt(i) + n > 'Z'
                    || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' && s.charAt(i) + n > 'z') {
                char a = (char) (s.charAt(i) - 26 + n);
                sb.append(a);

            // 나머지 소문자 혹운 대문자일 경우 n만큼 이동하도록 설정
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'
                    || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                char a = (char) (s.charAt(i) + n);
                sb.append(a);

            // 공백의 경우 이동하지 않도록 설정
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

/* 0.03ms ~ 2.35ms
테스트 1 〉	통과 (0.05ms, 76.7MB)
테스트 2 〉	통과 (0.03ms, 75.8MB)
테스트 3 〉	통과 (0.04ms, 77MB)
테스트 4 〉	통과 (0.03ms, 73.6MB)
테스트 5 〉	통과 (0.03ms, 71.7MB)
테스트 6 〉	통과 (0.06ms, 77.3MB)
테스트 7 〉	통과 (0.03ms, 73.6MB)
테스트 8 〉	통과 (0.03ms, 73.4MB)
테스트 9 〉	통과 (0.05ms, 70.3MB)
테스트 10 〉	통과 (0.05ms, 71.6MB)
테스트 11 〉	통과 (0.05ms, 74.8MB)
테스트 12 〉	통과 (0.04ms, 82.9MB)
테스트 13 〉	통과 (2.35ms, 94.7MB)
 */
