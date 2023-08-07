package Test08.t0804;

import java.util.Arrays;
import java.util.HashMap;

public class Haena2 {
	public int[] solution(String s) {
		// s의 길이와 같은 answer 배열을 만든다.
		int[] answer = new int[s.length()];

		// 맵 <Key: 알파벳, Value: 인덱스>
		HashMap<Character, Integer> charIndex = new HashMap<>();

		// 맵에 기존 알파벳 값(Key)이 있는지 확인 후
		// 없으면 answer '-1', 있으면 answer '현재 인덱스 - 기존 인덱스' 넣기
		// Map에 <알파벳, 현재 인덱스> 넣기
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			if (!charIndex.containsKey(key)) {
				answer[i] = -1;
			} else {
				answer[i] = i - charIndex.get(key);
			}
			charIndex.put(key, i);
		}

		return answer;
	}

	public static void main(String[] args) {
		Haena2 sol = new Haena2();
		System.out.println(Arrays.toString(sol.solution("banana")));
		System.out.println(Arrays.toString(sol.solution("foobar")));
	}
}

/*
테스트 1 〉	통과 (0.16ms, 77.3MB)
테스트 2 〉	통과 (0.23ms, 68.4MB)
테스트 3 〉	통과 (0.28ms, 76.2MB)
테스트 4 〉	통과 (0.82ms, 76.9MB)
테스트 5 〉	통과 (3.08ms, 67.2MB)
테스트 6 〉	통과 (1.62ms, 79.5MB)
테스트 7 〉	통과 (4.76ms, 89.1MB)
테스트 8 〉	통과 (1.30ms, 78.9MB)
테스트 9 〉	통과 (2.66ms, 90MB)
테스트 10 〉	통과 (1.05ms, 84MB)
테스트 11 〉	통과 (2.68ms, 78.7MB)
테스트 12 〉	통과 (0.18ms, 80.1MB)
테스트 13 〉	통과 (0.24ms, 72.6MB)
테스트 14 〉	통과 (0.67ms, 71.4MB)
테스트 15 〉	통과 (0.13ms, 74.1MB)
테스트 16 〉	통과 (0.17ms, 76.9MB)
테스트 17 〉	통과 (0.17ms, 73.9MB)
테스트 18 〉	통과 (1.13ms, 87.1MB)
테스트 19 〉	통과 (1.00ms, 79.6MB)
테스트 20 〉	통과 (0.63ms, 74.9MB)
테스트 21 〉	통과 (0.31ms, 77.6MB)
테스트 22 〉	통과 (2.76ms, 82.5MB)
테스트 23 〉	통과 (0.46ms, 73.4MB)
테스트 24 〉	통과 (0.59ms, 69.4MB)
테스트 25 〉	통과 (1.17ms, 66.3MB)
테스트 26 〉	통과 (0.31ms, 76MB)
테스트 27 〉	통과 (0.73ms, 77.3MB)
테스트 28 〉	통과 (0.64ms, 80MB)
테스트 29 〉	통과 (0.15ms, 75.8MB)
테스트 30 〉	통과 (4.05ms, 79.7MB)
 */