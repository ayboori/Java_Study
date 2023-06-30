// lv.1 같은 숫자는 싫어
package Test06.Test0630_P;

import java.util.ArrayList;
import java.util.Arrays;

public class Haena2 {
	public static void main(String[] args) {
		SolutionHn2 sol = new SolutionHn2();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
		System.out.println(Arrays.toString(sol.solution(new int[]{4,4,4,3,3})));
	}
}

class SolutionHn2 {
	public int[] solution(int[] arr) {
		// 답을 담을 List 생성
		ArrayList<Integer> arrList = new ArrayList<>();

		// 첫번째 원소를 담은 후, 이후 원소부터 이전 숫자와 비교하여 다른 경우에만 list에 담도록 함
		arrList.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				arrList.add(arr[i]);
			}
		}

		// list의 원소를 int 배열에 담아 반환
		int[] answer = new int[arrList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arrList.get(i);
		}

		return answer;
	}
}

/*
[정확성 테스트]
테스트 1 〉	통과 (0.03ms, 80.7MB)
테스트 2 〉	통과 (0.06ms, 77.2MB)
테스트 3 〉	통과 (0.08ms, 80.8MB)
테스트 4 〉	통과 (0.09ms, 73.2MB)
테스트 5 〉	통과 (0.06ms, 66.1MB)
테스트 6 〉	통과 (0.07ms, 75MB)
테스트 7 〉	통과 (0.08ms, 74MB)
테스트 8 〉	통과 (0.04ms, 75.5MB)
테스트 9 〉	통과 (0.07ms, 74.1MB)
테스트 10 〉	통과 (0.05ms, 65.8MB)
테스트 11 〉	통과 (0.05ms, 81.1MB)
테스트 12 〉	통과 (0.05ms, 80.1MB)
테스트 13 〉	통과 (0.08ms, 77.3MB)
테스트 14 〉	통과 (0.05ms, 67.6MB)
테스트 15 〉	통과 (0.08ms, 80.9MB)
테스트 16 〉	통과 (0.08ms, 73.4MB)
테스트 17 〉	통과 (0.03ms, 73.4MB)

[효율성 테스트]
테스트 1 〉	통과 (24.26ms, 114MB)
테스트 2 〉	통과 (28.77ms, 109MB)
테스트 3 〉	통과 (25.75ms, 115MB)
테스트 4 〉	통과 (28.07ms, 117MB)
 */