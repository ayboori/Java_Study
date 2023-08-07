// K번째 수
package Test08.t0807;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Jisoo3 {
	public static void main(String[] args) {
		Jisoo3 jisoo = new Jisoo3();

		int[] array1 = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		System.out.println(Arrays.toString(jisoo.solution3(array1, commands1)));
		// [5, 6, 3]
	}

	// ArrayList에 판단할 값들 넣어주기
	// Collection.sort()로 정렬
	// 특정 index 값 answer에 가져오기
	public int[] solution3(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				temp.add(array[j]);
			}
			Collections.sort(temp);
			answer[i] = temp.get(commands[i][2] - 1);
		}
		return answer;
	}

}

/*
정확성  테스트( 0.20ms ~ 0.32ms )

테스트 1 〉	통과 (0.31ms, 73.1MB)
테스트 2 〉	통과 (0.32ms, 76.8MB)
테스트 3 〉	통과 (0.20ms, 73.3MB)
테스트 4 〉	통과 (0.29ms, 73.1MB)
테스트 5 〉	통과 (0.28ms, 72.1MB)
테스트 6 〉	통과 (0.21ms, 71MB)
테스트 7 〉	통과 (0.22ms, 68.2MB)

 */


