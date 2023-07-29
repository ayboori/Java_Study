// [1차] 비밀지도
package Test07.Test0717_P;

import java.util.Arrays;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo js = new Jisoo();

		int[] t1_1 = {9, 20, 28, 18, 11};
		int[] t1_2 = {30, 1, 21, 17, 28};
		System.out.println(Arrays.toString(js.solution(5, t1_1, t1_2)));

		int[] t2_1 = {46, 33, 33, 22, 31, 50};
		int[] t2_2 = {27, 56, 19, 14, 14, 10};
		System.out.println(Arrays.toString(js.solution(6, t2_1, t2_2)));
	}

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		// OR 연산자으로 연산하고 2진법으로 바꾼다.
		// 2진법으로 바꾼 것의 길이가 n보다 작을 때, 앞에 0을 붙여준다.
		for (int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
			if (answer[i].length() < n) {
				answer[i] = "0".repeat(n - answer[i].length()) + answer[i];
			}
		}
		// 0 대신 공백, 1 대신 #을 넣어준다.
		for (int i = 0; i < n; i++) {
			answer[i] = answer[i].replaceAll("0", " ");
			answer[i] = answer[i].replaceAll("1", "#");
		}

		return answer;
	}
}

/*
정확성  테스트
테스트 1 〉통과 (0.53ms, 75.7MB)
테스트 2 〉통과 (2.38ms, 72MB)
테스트 3 〉통과 (1.84ms, 77.4MB)
테스트 4 〉통과 (2.01ms, 82.3MB)
테스트 5 〉통과 (2.56ms, 75.4MB)
테스트 6 〉통과 (2.74ms, 72.4MB)
테스트 7 〉통과 (2.42ms, 75.2MB)
테스트 8 〉통과 (0.26ms, 78.5MB)
 */