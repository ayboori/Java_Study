// 과일 장수
package Test09.t0901;

import java.util.Arrays;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo js = new Jisoo();
		int[] score1 = {1, 2, 3, 1, 2, 3, 1};
		int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

		System.out.println(js.solution(3, 4, score1));
		System.out.println(js.solution(4, 3, score2));
	}

	/**
	 * 한 상자에 사과 m개
	 * 상제에 담긴 사과 중 가장 낮은 점수 p점. 사과 한 상자의 가격 = p * m
	 * (최하품)1 <= 사과 점수 <= k(최상품)
	 * score : 사과의 점수
	 * 남는 사과는 버린다.
	 */

	/**
	 * ex. 14개의 사과가 있을 때, 한 박스당 사과를 3개씩 담는다고 하면 12개를 팔 수 있고
	 * 나머지 두 개는 못 먹는다. => 0, 1의 인덱스의 사과는 못 먹는 사과.
	 * 2번 인덱스, 5번 인덱스, 8번 인덱스, ...의 점수에 곱하기 3개를 해서 점수를 내주면 된다.
	 */
	public int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		int startIndex = score.length % m;
		for (int i = startIndex; i < score.length; i += m) {
			answer += score[i] * m;
		}
		return answer;
	}
}

/*
Array의 길이가 최대 100만이기 때문에 아마 정렬하는데 시간이 많이 걸렸을 것이다.

프로그래머스 서버 상황에 따라 최대 50~73ms 정도 걸리는 것 같다.

정확성  테스트(0.35ms ~ 50.01ms)

테스트 1 〉통과 (0.37ms, 72.4MB)
테스트 2 〉통과 (0.37ms, 73.9MB)
테스트 3 〉통과 (0.52ms, 72.9MB)
테스트 4 〉통과 (1.39ms, 72.5MB)
테스트 5 〉통과 (0.45ms, 75MB)
테스트 6 〉통과 (6.85ms, 91.6MB)
테스트 7 〉통과 (6.97ms, 85.7MB)
테스트 8 〉통과 (1.26ms, 79.2MB)
테스트 9 〉통과 (5.65ms, 71.1MB)
테스트 10 〉통과 (4.52ms, 77.2MB)
테스트 11 〉통과 (45.11ms, 134MB)
테스트 12 〉통과 (35.49ms, 141MB)
테스트 13 〉통과 (50.01ms, 125MB)
테스트 14 〉통과 (49.49ms, 146MB)
테스트 15 〉통과 (48.06ms, 141MB)
테스트 16 〉통과 (0.43ms, 75.1MB)
테스트 17 〉통과 (0.35ms, 69.5MB)
테스트 18 〉통과 (0.55ms, 72.8MB)
테스트 19 〉통과 (0.51ms, 90MB)
테스트 20 〉통과 (0.45ms, 74.9MB)
테스트 21 〉통과 (0.40ms, 72.5MB)
테스트 22 〉통과 (0.35ms, 74.3MB)
테스트 23 〉통과 (0.36ms, 75.9MB)
테스트 24 〉통과 (0.55ms, 76.5MB)
 */