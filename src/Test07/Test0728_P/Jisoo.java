// 문자열 내 마음대로 정렬하기
package Test07.Test0728_P;

import java.util.Arrays;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo js = new Jisoo();
		String[] t1 = {"sun", "bed", "car"};
		String[] t2 = {"abce", "abcd", "cdx"};
		String[] t3 = {"sun"};

		System.out.println(Arrays.toString(js.solution(t1, 1)));
		System.out.println(Arrays.toString(js.solution(t2, 2)));
		System.out.println(Arrays.toString(js.solution(t3, 1)));
	}

	public String[] solution(String[] strings, int n) {
		// n번째 알파벳이 몇 개 있는지 기록해 놓을 int배열
		int[] standard = new int[26];
		for (int i = 0; i < strings.length; i++) {
			// n번째 알파벳을 int배열에 넣기 위한 식.
			// 'a' : 0, 'b' : 1, 'c' : 2, ... 으로 들어간다.
			standard[strings[i].charAt(n) - 'a']++;
		}

		// n번째 알파벳 순으로 정렬하는데 같은 알파벳이라면 사전 순으로 앞선 문자열이 앞쪽에 위치하므로
		// 먼저 정렬해 준 뒤, 앞에서부터 꺼내 쓴다.
		Arrays.sort(strings);

		String[] answer = new String[strings.length];
		// answer의 index
		int answerIndex = 0;

		// for문 로직
		// 1. standard[i]가 0이 아닌 애들만 생각하자. 테스트케이스 2번의 경우 c와 x만 생각.
		// 2. count는 n번째 알파벳이 같은 문자열이 몇 개인지. c는 2, x는 1일것.
		// 3. stringsIndex는 주어진 배열을 순차적으로 돌아 특정 알파벳이 있는 문자열을 검색해야 하는데
		//    그 때 쓰이는 Index
		for (int i = 0; i < standard.length; i++) {
			if (standard[i] != 0) {
				int count = standard[i];	// c: 2, x:1

				// 여기서부터는 또 하나의 for문이라고 생각하면 된다. stringsIndex 돌면서 특정 알파벳 있는지 검사하고,
				// 특정 알파벳 있으면 answer에 차곡차곡 넣어주는 로직
				// 많이 걸릴 거 같지만 count만큼 돌아가기 때문에 오래 걸리지 않음.
				int stringsIndex = 0;
				while (count != 0) {
					if (strings[stringsIndex].charAt(n) == i + 'a') {
						// 특정 알파벳 일치하면 answer에 넣어주기
						answer[answerIndex] = strings[stringsIndex];
						stringsIndex++;
						answerIndex++;
						count--;
					} else {
						stringsIndex++;
					}
				}
			}
		}
		return answer;
	}
}

/*
뭔가 시간 땡기려고 엄청 머리 써서
푸는데 너무 오래 걸림 ㅋㅋ ㅠ 어려워따 이번거

정확성  테스트 (0.18ms ~ 0.51ms)

테스트 1 〉통과 (0.24ms, 68.2MB)
테스트 2 〉통과 (0.27ms, 73.7MB)
테스트 3 〉통과 (0.26ms, 74.3MB)
테스트 4 〉통과 (0.27ms, 73.7MB)
테스트 5 〉통과 (0.20ms, 73.6MB)
테스트 6 〉통과 (0.25ms, 72.3MB)
테스트 7 〉통과 (0.29ms, 79.4MB)
테스트 8 〉통과 (0.28ms, 90.4MB)
테스트 9 〉통과 (0.26ms, 84.4MB)
테스트 10 〉통과 (0.44ms, 73MB)
테스트 11 〉통과 (0.18ms, 74.8MB)
테스트 12 〉통과 (0.51ms, 77.4MB)
 */
