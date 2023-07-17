package Test07.Test0717_P;

import java.util.Arrays;

public class Haena {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		StringBuilder[] strArr1 = new StringBuilder[arr1.length];
		StringBuilder[] strArr2 = new StringBuilder[arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			strArr1[i] = new StringBuilder();
			if (Integer.toBinaryString(arr1[i]).length() < n) {
				strArr1[i].append("0".repeat(n - Integer.toBinaryString(arr1[i]).length()));
			}
			strArr1[i].append(Integer.toBinaryString(arr1[i]));

			strArr2[i] = new StringBuilder();
			if (Integer.toBinaryString(arr2[i]).length() < n) {
				strArr2[i].append("0".repeat(n - Integer.toBinaryString(arr2[i]).length()));
			}
			strArr2[i].append(Integer.toBinaryString(arr2[i]));
		}
		String[] answer = new String[strArr1.length];
		for (int i = 0; i < answer.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < strArr1[i].length(); j++) {
				if (strArr1[i].charAt(j) == '1' || strArr2[i].charAt(j) == '1') {
					sb.append("#");
				} else sb.append(" ");
			}
			answer[i] = sb.toString();
		}
		return answer;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(Arrays.toString(sol.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
		System.out.println(Arrays.toString(sol.solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
	}
}

/*
테스트 1 〉	통과 (0.16ms, 75.4MB)
테스트 2 〉	통과 (0.29ms, 65.4MB)
테스트 3 〉	통과 (0.10ms, 75.1MB)
테스트 4 〉	통과 (0.19ms, 74.3MB)
테스트 5 〉	통과 (0.15ms, 72.3MB)
테스트 6 〉	통과 (0.26ms, 71.3MB)
테스트 7 〉	통과 (0.12ms, 81.8MB)
테스트 8 〉	통과 (0.13ms, 75.4MB)
 */