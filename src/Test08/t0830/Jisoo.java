// 모의고사
package Test08.t0830;

import java.util.ArrayList;
import java.util.Arrays;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();
		int[] answers1 = {1, 2, 3, 4, 5};    // [1]
		int[] answers2 = {1, 3, 2, 4, 2};    // [1, 2, 3]
		System.out.println(Arrays.toString(jisoo.solution(answers1)));
		System.out.println(Arrays.toString(jisoo.solution(answers2)));
	}

	/*
	 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	 */

	public int[] solution(int[] answers) {
		// 각각의 학생이 찍는 방식
		int[] pick1 = {1, 2, 3, 4, 5};
		int[] pick2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] pick3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		// 학생들의 점수 기록
		int[] scores = new int[3];

		// 나머지에 따라서 점수 더해주기
		for (int i = 0; i < answers.length; i++) {
			if (pick1[i % 5] == answers[i]) {
				scores[0]++;
			}
			if (pick2[i % 8] == answers[i]) {
				scores[1]++;
			}
			if (pick3[i % 10] == answers[i]) {
				scores[2]++;
			}
		}

		// 가장 높은 점수 구하기
		int maxScore = 0;
		for (int i = 0; i < scores.length; i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
			}
		}

		// 높은 점수인 학생 추가하기
		ArrayList<Integer> answerList = new ArrayList<>();
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == maxScore) {
				answerList.add(i + 1);
			}
		}

		// list 배열로 변환하기
		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}

/*

가장 높은 점수 구하기 ~ list 배열로 변환하기 까지의 로직을 조금 더 줄여볼 수 있을 거 같은데
일단 1ms 안쪽으로 나왔으니 패스

정확성  테스트(0.03ms ~ 0.87ms)

테스트 1 〉통과 (0.03ms, 76.1MB)
테스트 2 〉통과 (0.06ms, 72.5MB)
테스트 3 〉통과 (0.03ms, 73.5MB)
테스트 4 〉통과 (0.04ms, 76MB)
테스트 5 〉통과 (0.03ms, 75MB)
테스트 6 〉통과 (0.03ms, 74.2MB)
테스트 7 〉통과 (0.31ms, 77.8MB)
테스트 8 〉통과 (0.21ms, 77.8MB)
테스트 9 〉통과 (0.56ms, 73.2MB)
테스트 10 〉통과 (0.28ms, 72.1MB)
테스트 11 〉통과 (0.58ms, 75.9MB)
테스트 12 〉통과 (0.87ms, 83MB)
테스트 13 〉통과 (0.08ms, 74.5MB)
테스트 14 〉통과 (0.76ms, 83.9MB)
 */