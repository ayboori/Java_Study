// 성격 유형 검사하기
package Test07.Test0710_P;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();

		String[] t1_1 = {"AN", "CF", "MJ", "RT", "NA"};
		int[] t1_2 = {5, 3, 2, 7, 5};

		String[] t2_1 = {"TR", "RT", "TR"};
		int[] t2_2 = {7, 1, 3};

		System.out.println(jisoo.solution(t1_1, t1_2));
		System.out.println(jisoo.solution(t2_1, t2_2));
	}

	public String solution(String[] survey, int[] choices) {
		StringBuilder sb = new StringBuilder();
		char[] chars = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
		int[] score = new int[8]; // [0, 0, 0, 0, 0, 0, 0, 0]
		// an -> 1 : a3, 2 : a2, 3 : a1, 4 : pass, 5 : n1, 6 : n2, 7 : n3
		// 1 <= score <= 3 이면 (4-score)를 앞에다가 준다. (4보다 작으면)
		// 5 <= score <= 7 이면 (score-4)를 뒤에다가 준다. (4보다 크면)
		// 01, 23, 45, 67을 비교해서 숫자가 더 높은 글자를 sb에 붙인다.
		// 숫자가 같으면 앞에 글자를 sb에 붙인다.(사전적으로 더 앞인 글자)

		for (int i = 0; i < choices.length; i++) {
			int num = choices[i];
			if (num == 4) {
			} else if (num < 4) {
				score[findIndexinCharArray(chars, survey[i].charAt(0))] += 4 - num;
			} else {
				score[findIndexinCharArray(chars, survey[i].charAt(1))] += num - 4;
			}
		}
		for (int i = 0; i <= 6; i += 2) {
			if (score[i] >= score[i + 1]) {
				sb.append(chars[i]);
			} else {
				sb.append(chars[i + 1]);
			}
		}
		return sb.toString();
	}

	// char[]에서 index 찾는 메서드 만들어서 하기
	public int findIndexinCharArray(char[] chars, char ch) {
		for (int i = 0; i < chars.length; i++) {
			if (ch == chars[i]) {
				return i;
			}
		}
		return -1;
	}

}
/*
0.03ms ~ 0.32ms

테스트 1 〉통과 (0.03ms, 69.6MB)
테스트 2 〉통과 (0.03ms, 74.4MB)
테스트 3 〉통과 (0.05ms, 75.7MB)
테스트 4 〉통과 (0.05ms, 75.8MB)
테스트 5 〉통과 (0.03ms, 75.5MB)
테스트 6 〉통과 (0.03ms, 79.2MB)
테스트 7 〉통과 (0.07ms, 67.5MB)
테스트 8 〉통과 (0.05ms, 71.8MB)
테스트 9 〉통과 (0.05ms, 73.8MB)
테스트 10 〉통과 (0.04ms, 77MB)
테스트 11 〉통과 (0.06ms, 77MB)
테스트 12 〉통과 (0.10ms, 78.4MB)
테스트 13 〉통과 (0.21ms, 79.3MB)
테스트 14 〉통과 (0.28ms, 75.1MB)
테스트 15 〉통과 (0.31ms, 77.3MB)
테스트 16 〉통과 (0.32ms, 79.2MB)
테스트 17 〉통과 (0.30ms, 70.1MB)
테스트 18 〉통과 (0.19ms, 81.1MB)
테스트 19 〉통과 (0.20ms, 80MB)
테스트 20 〉통과 (0.29ms, 79.7MB)
*/
