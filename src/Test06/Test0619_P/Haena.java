// lv.2 JadenCase 문자열 만들기
package Test06.Test0619_P;

public class Haena {
    public static void main(String[] args) {
        SolutionHn sol = new SolutionHn();
        System.out.println(sol.solution("3people unFollowed me"));
        System.out.println(sol.solution("for the last week"));
    }
}

class SolutionHn {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        // 아스키코드 활용
        // 첫 글자가 영소문자일 경우 -> 대문자로 바꾸기
        if (s.charAt(0) >= 97 && s.charAt(0) <=122) {
            int firstToUpper = s.charAt(0) - 32;
            sb.setCharAt(0, (char) firstToUpper);
        }

        for (int i = 1; i < s.length(); i++) {
            // 공백 뒤에 소문자가 올 경우 -> 대문자로 바꾸기
            if (s.charAt(i-1) == ' ' && s.charAt(i) >= 97 && s.charAt(i) <=122) {
                int midToUpper = s.charAt(i) - 32;
                sb.setCharAt(i, (char) midToUpper);
            }

            // 공백이 없는데 대문자가 올 경우 -> 소문자로 바꾸기 (첫 글자가 숫자인 경우 포함)
            else if (s.charAt(i-1) != ' ' && s.charAt(i) >= 65 && s.charAt(i) <=90) {
                int midToLower = s.charAt(i) + 32;
                sb.setCharAt(i, (char) midToLower);
            }
        }

        String answer = sb.toString();
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.05ms, 72.8MB)
테스트 2 〉	통과 (0.05ms, 72.2MB)
테스트 3 〉	통과 (0.04ms, 70.4MB)
테스트 4 〉	통과 (0.05ms, 71MB)
테스트 5 〉	통과 (0.07ms, 78.5MB)
테스트 6 〉	통과 (0.05ms, 75.6MB)
테스트 7 〉	통과 (0.08ms, 70.2MB)
테스트 8 〉	통과 (0.04ms, 81MB)
테스트 9 〉	통과 (0.05ms, 76.1MB)
테스트 10 〉	통과 (0.03ms, 75.5MB)
테스트 11 〉	통과 (0.08ms, 77.5MB)
테스트 12 〉	통과 (0.07ms, 76.6MB)
테스트 13 〉	통과 (0.05ms, 75.8MB)
테스트 14 〉	통과 (0.08ms, 77MB)
테스트 15 〉	통과 (0.07ms, 77.9MB)
테스트 16 〉	통과 (0.05ms, 73MB)
테스트 17 〉	통과 (0.05ms, 73.1MB)
테스트 18 〉	통과 (0.05ms, 73.7MB)
 */
