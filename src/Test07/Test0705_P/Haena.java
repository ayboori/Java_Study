package Test07.Test0705_P;

public class Haena {
	public static void main(String[] args) {
		SolutionHn sol = new SolutionHn();
		System.out.println(sol.solution("try hello world"));
		System.out.println(sol.solution("  TRy HElLo  WORLD "));
	}
}

class SolutionHn {
	public String solution(String s) {
		// 주어진 문자열을 StringBuilser로 만들기
		StringBuilder answer = new StringBuilder(s);

		int blankIndex = -1; // 공백 위치 (첫번째 글자를 고려하여 공백 위치를 -1부터 시작)

		for (int i = 0; i < answer.length(); i++) {
			// 공백 위치 찾기
			if (answer.charAt(i) == ' ') {
				blankIndex = i;
			}

			// 공백 위치 다음부터 인덱스가 짝수인 경우 대문자, 홀수인 경우 소문자로 처리하기
			if (i == 0 || (i - blankIndex - 1) % 2 == 0) {
				answer.setCharAt(i, Character.toUpperCase(answer.charAt(i)));
			} else {
				answer.setCharAt(i, Character.toLowerCase(answer.charAt(i)));
			}
		}
		return answer.toString();
	}
}

/*
테스트 1 〉	통과 (0.11ms, 84.7MB)
테스트 2 〉	통과 (0.07ms, 70.1MB)
테스트 3 〉	통과 (0.05ms, 76.6MB)
테스트 4 〉	통과 (0.28ms, 86.5MB)
테스트 5 〉	통과 (0.26ms, 83.8MB)
테스트 6 〉	통과 (0.05ms, 75MB)
테스트 7 〉	통과 (0.06ms, 74.2MB)
테스트 8 〉	통과 (0.23ms, 84.4MB)
테스트 9 〉	통과 (0.07ms, 79.2MB)
테스트 10 〉	통과 (0.20ms, 70.3MB)
테스트 11 〉	통과 (0.23ms, 70.1MB)
테스트 12 〉	통과 (0.21ms, 76.4MB)
테스트 13 〉	통과 (0.16ms, 75.2MB)
테스트 14 〉	통과 (0.07ms, 75.2MB)
테스트 15 〉	통과 (0.14ms, 79.4MB)
테스트 16 〉	통과 (0.15ms, 71.4MB)
 */
