package Test08.t0804;

import java.util.Arrays;

public class Jisoo2 {
	public static void main(String[] args) {
		Jisoo2 jisoo = new Jisoo2();
		System.out.println(Arrays.toString(jisoo.solution("bananab")));
		System.out.println(Arrays.toString(jisoo.solution("foobar")));

	}

	public int[] solution(String s) {
		char[] chars = s.toCharArray();
		int[] answer = new int[s.length()];

		// index를 기록할 int배열
		int[] indexRecord = new int[26];

		// 나온 적 없는 경우 : -1로 다 채워넣기
		Arrays.fill(indexRecord, -1);

		for (int i = 0; i < chars.length; i++) {
			if (indexRecord[chars[i] - 'a'] == -1) { // 이전에 index가 없었을 때
				answer[i] = -1;
			} else {
				// 이전에 index가 있는 경우 answer에 지금 index와 얼마나 차이 나는지 저장
				answer[i] = i - indexRecord[chars[i] - 'a'];
			}

			// 지금 index로 업데이트
			indexRecord[chars[i] - 'a'] = i;
		}
		return answer;
	}
}

/*
정확성  테스트(0.01ms ~ 0.97ms)

테스트 1 〉통과 (0.04ms, 75.4MB)
테스트 2 〉통과 (0.04ms, 77.5MB)
테스트 3 〉통과 (0.04ms, 78.3MB)
테스트 4 〉통과 (0.08ms, 77.9MB)
테스트 5 〉통과 (0.62ms, 86.3MB)
테스트 6 〉통과 (0.25ms, 78.4MB)
테스트 7 〉통과 (0.60ms, 77MB)
테스트 8 〉통과 (0.22ms, 84.7MB)
테스트 9 〉통과 (0.97ms, 82.3MB)
테스트 10 〉통과 (0.14ms, 72.7MB)
테스트 11 〉통과 (0.93ms, 86.4MB)
테스트 12 〉통과 (0.03ms, 75.1MB)
테스트 13 〉통과 (0.04ms, 76.5MB)
테스트 14 〉통과 (0.08ms, 74MB)
테스트 15 〉통과 (0.03ms, 86.3MB)
테스트 16 〉통과 (0.02ms, 73.8MB)
테스트 17 〉통과 (0.03ms, 82.6MB)
테스트 18 〉통과 (0.13ms, 79.4MB)
테스트 19 〉통과 (0.15ms, 79.5MB)
테스트 20 〉통과 (0.04ms, 64MB)
테스트 21 〉통과 (0.02ms, 83.8MB)
테스트 22 〉통과 (0.28ms, 67.9MB)
테스트 23 〉통과 (0.08ms, 80.8MB)
테스트 24 〉통과 (0.09ms, 79MB)
테스트 25 〉통과 (0.08ms, 73.7MB)
테스트 26 〉통과 (0.04ms, 83.7MB)
테스트 27 〉통과 (0.12ms, 69.2MB)
테스트 28 〉통과 (0.10ms, 78.3MB)
테스트 29 〉통과 (0.03ms, 78.7MB)
테스트 30 〉통과 (0.59ms, 84.9MB)
 */