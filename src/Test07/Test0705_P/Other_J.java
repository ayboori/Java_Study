// 이상한 문자 만들기
package Test07.Test0705_P;

// 다른 사람의 풀이 중 빨랐던 풀이
public class Other_J {
	public static void main(String[] args) {
		Other_J otherJ = new Other_J();

		System.out.println(otherJ.solution("try hello world"));

	}

	public String solution(String s) {
		char[] chars = s.toCharArray();
		int idx = 0;
		// 공백이냐 아니냐로 나눈다.
		for (int i = 0; i < chars.length; i++) {
			// 공백이면 단어의 index를 0으로 초기화한다.
			if (chars[i] == ' ')
				idx = 0;
				// 공백이 아니면 idx가 짝수인지 확인하고 idx를 증가시킨다.
				// idx가 짝수이면 char의 대문자로 홀수이면 char의 소문자로 바꿔서 대입한다.
			else
				chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
		}

		// char[] 을 String으로 만들어주는 메서드
		return String.valueOf(chars);
	}
}
/*
정확성  테스트

테스트 1 〉통과 (0.05ms, 81.4MB)
테스트 2 〉통과 (0.05ms, 74.1MB)
테스트 3 〉통과 (0.07ms, 73.9MB)
테스트 4 〉통과 (0.09ms, 74.6MB)
테스트 5 〉통과 (0.04ms, 75.8MB)
테스트 6 〉통과 (0.05ms, 79.8MB)
테스트 7 〉통과 (0.05ms, 81.2MB)
테스트 8 〉통과 (0.09ms, 74.6MB)
테스트 9 〉통과 (0.09ms, 68MB)
테스트 10 〉통과 (0.09ms, 75.8MB)
테스트 11 〉통과 (0.04ms, 76MB)
테스트 12 〉통과 (0.05ms, 76.1MB)
테스트 13 〉통과 (0.05ms, 73.7MB)
테스트 14 〉통과 (0.05ms, 75.9MB)
테스트 15 〉통과 (0.06ms, 72.7MB)
테스트 16 〉통과 (0.07ms, 75MB)
 */
