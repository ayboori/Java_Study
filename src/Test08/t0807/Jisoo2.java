// K번째 수
package Test08.t0807;

import java.util.Arrays;

public class Jisoo2 {
	public static void main(String[] args) {
		Jisoo2 jisoo = new Jisoo2();

		int[] array1 = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		System.out.println(Arrays.toString(jisoo.solution2(array1, commands1)));
		// [5, 6, 3]
	}

	// 1. Arrays.copyOfRange() 대신 정해진 길이만큼 배열 만들고
	// for문으로 순서대로 원소 넣어주기(직접 복사)
	// 2. Arrays.sort() 로 정렬
	// 3. answer에 특정 index 값 찾아서 넣어주기
	public int[] solution2(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {

			// 1.
			int[] temp = new int[commands[i][1] - commands[i][0] + 1];
			for (int j = 0; j < temp.length; j++) {
				temp[j] = array[commands[i][0] - 1 + j];
			}

			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}
		return answer;
	}

}

/*
정확성  테스트(0.34ms ~ 0.53ms)

테스트 1 〉	통과 (0.48ms, 75.5MB)
테스트 2 〉	통과 (0.34ms, 77.6MB)
테스트 3 〉	통과 (0.46ms, 71.6MB)
테스트 4 〉	통과 (0.53ms, 73.6MB)
테스트 5 〉	통과 (0.36ms, 71.7MB)
테스트 6 〉	통과 (0.42ms, 67.8MB)
테스트 7 〉	통과 (0.37ms, 73.3MB)
 */


