// K번째 수
package Test08.t0807;

import java.util.Arrays;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();

		int[] array1 = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		System.out.println(Arrays.toString(jisoo.solution(array1, commands1)));
		// [5, 6, 3]
	}

	// 1. Arrays.copyOfRange()를 이용하여 배열 부분 복사
	// 2. Arrays.sort()로 복사한 배열 정렬
	// 3. 특정 index -> answer에 저장
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}
		return answer;
	}

}

/*
정확성  테스트(0.42ms ~ 0.68ms)

테스트 1 〉통과 (0.49ms, 87MB)
테스트 2 〉통과 (0.47ms, 69.7MB)
테스트 3 〉통과 (0.55ms, 76.7MB)
테스트 4 〉통과 (0.48ms, 67.9MB)
테스트 5 〉통과 (0.66ms, 84.3MB)
테스트 6 〉통과 (0.68ms, 75.3MB)
테스트 7 〉통과 (0.42ms, 73.1MB)
 */


