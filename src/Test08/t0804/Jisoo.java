package Test08.t0804;

import java.util.Arrays;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();
		System.out.println(Arrays.toString(jisoo.solution("banana")));
		System.out.println(Arrays.toString(jisoo.solution("foobar")));

	}

	// 간단하게 String.lastIndexOf()이용해서 찾기
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		char[] strToCharArr = s.toCharArray();
		for (int i = 0; i < strToCharArr.length; i++) {
			int temp = s.substring(0, i).lastIndexOf(strToCharArr[i]);
			answer[i] = temp == -1 ? -1 : i - temp;
		}
		return answer;
	}
}

/*
정확성  테스트 (0.02ms ~ 23.84ms) -> 느려!

테스트 1 〉통과 (0.04ms, 76MB)
테스트 2 〉통과 (0.07ms, 73.5MB)
테스트 3 〉통과 (0.06ms, 78MB)
테스트 4 〉통과 (0.51ms, 81.9MB)
테스트 5 〉통과 (23.84ms, 105MB)
테스트 6 〉통과 (4.74ms, 91.7MB)
테스트 7 〉통과 (20.08ms, 105MB)
테스트 8 〉통과 (3.14ms, 85.1MB)
테스트 9 〉통과 (17.45ms, 116MB)
테스트 10 〉통과 (1.38ms, 78.8MB)
테스트 11 〉통과 (15.82ms, 102MB)
테스트 12 〉통과 (0.03ms, 74.7MB)
테스트 13 〉통과 (0.02ms, 65.7MB)
테스트 14 〉통과 (0.30ms, 79.4MB)
테스트 15 〉통과 (0.02ms, 71MB)
테스트 16 〉통과 (0.02ms, 71.6MB)
테스트 17 〉통과 (0.03ms, 82MB)
테스트 18 〉통과 (1.48ms, 78MB)
테스트 19 〉통과 (1.62ms, 77.8MB)
테스트 20 〉통과 (0.14ms, 80.2MB)
테스트 21 〉통과 (0.06ms, 70.7MB)
테스트 22 〉통과 (8.53ms, 103MB)
테스트 23 〉통과 (0.16ms, 72MB)
테스트 24 〉통과 (0.35ms, 78.1MB)
테스트 25 〉통과 (0.35ms, 76.7MB)
테스트 26 〉통과 (0.08ms, 71.5MB)
테스트 27 〉통과 (0.34ms, 75.2MB)
테스트 28 〉통과 (0.26ms, 78.5MB)
테스트 29 〉통과 (0.01ms, 74.2MB)
테스트 30 〉통과 (19.17ms, 110MB)
 */