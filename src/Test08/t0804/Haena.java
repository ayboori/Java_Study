package Test08.t0804;

import java.util.Arrays;

public class Haena {
	public int[] solution(String s) {
		// s의 길이와 같은 answer 배열을 만든다.
		int[] answer = new int[s.length()];

		// answer[0]를 -1로 세팅
		int index = 0;
		answer[index] = -1;

		// for문을 돌며 현재 인덱스부터 앞까지 확인하며 현재와 같은 알파벳이 있는지 확인
		// 없으면 answer '-1', 있으면 answer '현재 인덱스 - 이전 인덱스' 후 break;
		for (int i = 1; i < s.length(); i++) {
			answer[++index] = -1;
			for (int j = i - 1; j >= 0; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					answer[index] = i - j;
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(Arrays.toString(sol.solution("banana")));
		System.out.println(Arrays.toString(sol.solution("foobar")));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 77MB)
테스트 2 〉	통과 (0.19ms, 72MB)
테스트 3 〉	통과 (0.13ms, 77.2MB)
테스트 4 〉	통과 (1.65ms, 72.3MB)
테스트 5 〉	통과 (7.45ms, 76MB)
테스트 6 〉	통과 (6.82ms, 84.1MB)
테스트 7 〉	통과 (7.57ms, 87.8MB)
테스트 8 〉	통과 (3.09ms, 72.2MB)
테스트 9 〉	통과 (11.16ms, 84.1MB)
테스트 10 〉	통과 (2.18ms, 82.1MB)
테스트 11 〉	통과 (7.08ms, 73.4MB)
테스트 12 〉	통과 (0.03ms, 70.7MB)
테스트 13 〉	통과 (0.02ms, 70.8MB)
테스트 14 〉	통과 (0.73ms, 75.9MB)
테스트 15 〉	통과 (0.03ms, 71.4MB)
테스트 16 〉	통과 (0.05ms, 75MB)
테스트 17 〉	통과 (0.10ms, 73.4MB)
테스트 18 〉	통과 (1.68ms, 70.8MB)
테스트 19 〉	통과 (2.93ms, 78.1MB)
테스트 20 〉	통과 (0.74ms, 78.4MB)
테스트 21 〉	통과 (0.06ms, 75.7MB)
테스트 22 〉	통과 (6.60ms, 85.1MB)
테스트 23 〉	통과 (0.68ms, 71.7MB)
테스트 24 〉	통과 (0.88ms, 82.4MB)
테스트 25 〉	통과 (0.73ms, 78.8MB)
테스트 26 〉	통과 (0.21ms, 76.7MB)
테스트 27 〉	통과 (0.69ms, 77.9MB)
테스트 28 〉	통과 (0.89ms, 77.6MB)
테스트 29 〉	통과 (0.02ms, 73.6MB)
테스트 30 〉	통과 (7.61ms, 76.6MB)
 */