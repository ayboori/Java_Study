package Test08.t0804;

import java.util.Arrays;
import java.util.HashMap;

public class Haena3 {
	public int[] solution(String s) {
		// s의 길이와 같은 answer 배열을 만든다.
		int[] answer = new int[s.length()];

		// 알파벳별 인덱스 배열 만들기 (초기값을 모두 -1로 세팅)
		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}

		// 알파벳별 인덱스에서 기존 알파벳 값이 있는지 확인 후
		// 없으면 answer '-1', 있으면 answer '현재 인덱스 - 기존 인덱스' 넣기
		// 알파벳별 인덱스에 현재 인덱스 넣기
		for (int i = 0; i < s.length(); i++) {
			int target = alphabet[s.charAt(i) - 'a'];
			if (target == -1) {
				answer[i] = -1;
			} else {
				answer[i] = i - target;
			}
			alphabet[s.charAt(i) - 'a'] = i;
		}

		return answer;
	}

	public static void main(String[] args) {
		Haena3 sol = new Haena3();
		System.out.println(Arrays.toString(sol.solution("banana")));
		System.out.println(Arrays.toString(sol.solution("foobar")));
		System.out.println(Arrays.toString(sol.solution("baaab")));
	}
}

/*
테스트 1 〉	통과 (0.04ms, 80.7MB)
테스트 2 〉	통과 (0.02ms, 68.7MB)
테스트 3 〉	통과 (0.03ms, 74.8MB)
테스트 4 〉	통과 (0.13ms, 73MB)
테스트 5 〉	통과 (1.05ms, 79.9MB)
테스트 6 〉	통과 (0.55ms, 75.3MB)
테스트 7 〉	통과 (1.12ms, 86.5MB)
테스트 8 〉	통과 (0.41ms, 74.9MB)
테스트 9 〉	통과 (0.59ms, 81.9MB)
테스트 10 〉	통과 (0.27ms, 84.7MB)
테스트 11 〉	통과 (0.82ms, 82.5MB)
테스트 12 〉	통과 (0.03ms, 73.5MB)
테스트 13 〉	통과 (0.01ms, 75.1MB)
테스트 14 〉	통과 (0.09ms, 77.3MB)
테스트 15 〉	통과 (0.03ms, 75.7MB)
테스트 16 〉	통과 (0.02ms, 76.6MB)
테스트 17 〉	통과 (0.04ms, 74.5MB)
테스트 18 〉	통과 (0.22ms, 79.4MB)
테스트 19 〉	통과 (0.16ms, 76MB)
테스트 20 〉	통과 (0.07ms, 80MB)
테스트 21 〉	통과 (0.02ms, 71.3MB)
테스트 22 〉	통과 (0.42ms, 76.3MB)
테스트 23 〉	통과 (0.05ms, 74.2MB)
테스트 24 〉	통과 (0.06ms, 72.5MB)
테스트 25 〉	통과 (0.09ms, 70.3MB)
테스트 26 〉	통과 (0.02ms, 79MB)
테스트 27 〉	통과 (0.08ms, 75MB)
테스트 28 〉	통과 (0.07ms, 77.9MB)
테스트 29 〉	통과 (0.02ms, 77.1MB)
테스트 30 〉	통과 (0.65ms, 73.8MB)
 */