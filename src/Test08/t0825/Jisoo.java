// 명예의 전당
package Test08.t0825;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo j = new Jisoo();

		int k1 = 3;
		int[] score1 = {10, 100, 20, 150, 1, 100, 200};
		// [10, 10, 10, 20, 20, 100, 100]
		int k2 = 4;
		int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		// [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]

		System.out.println(Arrays.toString(j.solution(k1, score1)));
		System.out.println(Arrays.toString(j.solution(k2, score2)));

	}

	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];

		// 명예의 전당
		List<Integer> rank = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			// 명예의 전당에 점수를 추가한다.
			rank.add(score[i]);

			// 명예의 전당을 정렬한다.
			Collections.sort(rank);

			// 명예의 전당의 사이즈가 k를 넘으면 가장 작은 값을 제거한다.
			if (rank.size() > k) {
				rank.remove(0);
			}

			// 명예의 전당에서 가장 낮은 점수를 answer 배열에 넣는다.
			answer[i]= rank.get(0);
		}

		return answer;
	}
}

/*
정확성  테스트(0.19ms ~ 5.47ms)

테스트 1 〉통과 (0.34ms, 78.4MB)
테스트 2 〉통과 (0.22ms, 76.2MB)
테스트 3 〉통과 (0.27ms, 74.7MB)
테스트 4 〉통과 (0.33ms, 74.4MB)
테스트 5 〉통과 (0.28ms, 76.9MB)
테스트 6 〉통과 (0.23ms, 73.7MB)
테스트 7 〉통과 (0.31ms, 79.6MB)
테스트 8 〉통과 (0.39ms, 70.5MB)
테스트 9 〉통과 (0.38ms, 66.1MB)
테스트 10 〉통과 (0.59ms, 74.3MB)
테스트 11 〉통과 (0.64ms, 75.4MB)
테스트 12 〉통과 (3.11ms, 78.7MB)
테스트 13 〉통과 (3.04ms, 76.7MB)
테스트 14 〉통과 (2.83ms, 72.8MB)
테스트 15 〉통과 (5.74ms, 74.2MB)
테스트 16 〉통과 (5.23ms, 75.2MB)
테스트 17 〉통과 (5.47ms, 83.3MB)
테스트 18 〉통과 (4.52ms, 78.6MB)
테스트 19 〉통과 (1.81ms, 79.8MB)
테스트 20 〉통과 (1.83ms, 78.9MB)
테스트 21 〉통과 (2.52ms, 75.4MB)
테스트 22 〉통과 (2.10ms, 76.6MB)
테스트 23 〉통과 (1.86ms, 76MB)
테스트 24 〉통과 (2.44ms, 78.3MB)
테스트 25 〉통과 (1.79ms, 72.8MB)
테스트 26 〉통과 (0.19ms, 74.6MB)
 */