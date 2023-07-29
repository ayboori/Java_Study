package Test07.Test0707_P;
// 프로그래머스 lv.1 예산

import java.util.Arrays;

public class Haena {
	public static void main(String[] args) {
		SolutionHn sol = new SolutionHn();
		System.out.println(sol.solution(new int[]{1, 3, 2, 5, 4}, 9));
		System.out.println(sol.solution(new int[]{2, 2, 3, 3}, 10));
	}
}

class SolutionHn {
	public int solution(int[] d, int budget) {
		// 최대한 많은 부서를 지원할 수 있도록 필요 예산이 적은 부서부터 차례대로 정렬
		Arrays.sort(d);

		int payments = 0; // 지원한 금액 계산
		int cnt = 0; // 지원한 부서 카운트

		// 오름차순으로 정렬된 배열을 돌면서 부서에 금액을 지원하고 예산을 초과할 경우 멈춤
		for (int i : d) {
			payments += i;
			if(payments > budget) {
				break;
			}
			cnt++;
		}
		return cnt;
	}
}

/*
테스트 1 〉	통과 (0.45ms, 69.6MB)
테스트 2 〉	통과 (0.34ms, 77MB)
테스트 3 〉	통과 (0.61ms, 77MB)
테스트 4 〉	통과 (0.41ms, 75.5MB)
테스트 5 〉	통과 (0.42ms, 70.4MB)
테스트 6 〉	통과 (0.53ms, 77.4MB)
테스트 7 〉	통과 (0.39ms, 73.9MB)
테스트 8 〉	통과 (0.39ms, 75.6MB)
테스트 9 〉	통과 (0.55ms, 76.7MB)
테스트 10 〉	통과 (0.40ms, 68.4MB)
테스트 11 〉	통과 (0.63ms, 78.2MB)
테스트 12 〉	통과 (0.38ms, 75MB)
테스트 13 〉	통과 (0.46ms, 74.8MB)
테스트 14 〉	통과 (0.46ms, 73.9MB)
테스트 15 〉	통과 (0.39ms, 73.6MB)
테스트 16 〉	통과 (0.36ms, 74.6MB)
테스트 17 〉	통과 (0.40ms, 75.4MB)
테스트 18 〉	통과 (0.40ms, 67.6MB)
테스트 19 〉	통과 (0.56ms, 75MB)
테스트 20 〉	통과 (0.50ms, 75.1MB)
테스트 21 〉	통과 (0.38ms, 73MB)
테스트 22 〉	통과 (0.36ms, 75.5MB)
테스트 23 〉	통과 (0.32ms, 75.1MB)
 */
