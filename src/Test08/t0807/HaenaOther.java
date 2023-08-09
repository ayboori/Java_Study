package Test08.t0807;

import java.util.Arrays;

public class HaenaOther {
	public int[] solution(int[] array, int[][] commands) {
		// 주어진 commands의 길이 만큼의 1차원 배열을 생성한다.(answer)
		int[] answer = new int[commands.length];

		// commands를 for문으로 돌면서 [start, end, k]를 확인한다.
		for (int i = 0; i < commands.length; i++) {
			// 주어진 array에 start번째부터 end번째까지 자른 배열을 만든다.
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);

			// 자른 배열을 정렬한다.
			Arrays.sort(temp);

			// 정렬된 배열에서 k번째 숫자를 찾아 answer에 차례대로 담는다.
			answer[i] = temp[commands[i][2]-1];
		}
		return answer;
	}

	public static void main(String[] args) {
		HaenaOther sol = new HaenaOther();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
	}
}

/*
테스트 1 〉	통과 (0.38ms, 74.7MB)
테스트 2 〉	통과 (0.49ms, 75.8MB)
테스트 3 〉	통과 (0.36ms, 75.9MB)
테스트 4 〉	통과 (0.47ms, 76.9MB)
테스트 5 〉	통과 (0.41ms, 73.6MB)
테스트 6 〉	통과 (0.56ms, 73.8MB)
테스트 7 〉	통과 (0.33ms, 74.6MB)
 */