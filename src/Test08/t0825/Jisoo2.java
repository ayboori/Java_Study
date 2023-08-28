// 명예의 전당
package Test08.t0825;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Jisoo2 {
	public static void main(String[] args) {
		Jisoo2 j = new Jisoo2();

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
		PriorityQueue<Integer> rank = new PriorityQueue<>();

		for (int i = 0; i < score.length; i++) {
			// 명예의 전당에 점수를 추가한다.
			rank.add(score[i]);

			// 명예의 전당이 정해진 사이즈를 넘어서면 가장 작은 점수를 제거한다.
			if (rank.size() > k) {
				rank.poll();
			}

			// answer 배열에는 명예의 전당에서 가장 낮은 점수를 넣는다.
			answer[i] = rank.peek();
		}
		return answer;
	}
}

/*
정확성  테스트(0.29ms ~ 2.16ms)

테스트 1 〉통과 (0.49ms, 76.8MB)
테스트 2 〉통과 (0.44ms, 71.5MB)
테스트 3 〉통과 (0.35ms, 75.6MB)
테스트 4 〉통과 (0.32ms, 75MB)
테스트 5 〉통과 (0.36ms, 74.5MB)
테스트 6 〉통과 (0.29ms, 76.5MB)
테스트 7 〉통과 (0.42ms, 73.9MB)
테스트 8 〉통과 (0.38ms, 76.6MB)
테스트 9 〉통과 (0.33ms, 76.8MB)
테스트 10 〉통과 (0.35ms, 80MB)
테스트 11 〉통과 (0.53ms, 79.8MB)
테스트 12 〉통과 (1.68ms, 78.3MB)
테스트 13 〉통과 (1.20ms, 93MB)
테스트 14 〉통과 (1.13ms, 67.7MB)
테스트 15 〉통과 (1.71ms, 80.7MB)
테스트 16 〉통과 (1.62ms, 83.9MB)
테스트 17 〉통과 (1.50ms, 80MB)
테스트 18 〉통과 (1.43ms, 77.1MB)
테스트 19 〉통과 (1.28ms, 78.7MB)
테스트 20 〉통과 (1.21ms, 78.5MB)
테스트 21 〉통과 (2.16ms, 81.1MB)
테스트 22 〉통과 (1.78ms, 80.1MB)
테스트 23 〉통과 (1.85ms, 73.7MB)
테스트 24 〉통과 (1.56ms, 76.3MB)
테스트 25 〉통과 (1.99ms, 80.9MB)
테스트 26 〉통과 (0.48ms, 73.7MB)
 */