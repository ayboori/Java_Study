package Test07.Test0714_P;

public class Haena {
	public int solution(int[][] sizes) {
		// 명함의 짧은 길이 / 긴 길이를 따로 모은 1차원 배열 만들기
		int[] shortLength = new int[sizes.length];
		int[] longLength = new int[sizes.length];
		for (int i = 0; i < sizes.length; i++) {
			shortLength[i] = Math.min(sizes[i][0], sizes[i][1]);
			longLength[i] = Math.max(sizes[i][0], sizes[i][1]);
		}

		// 명함의 짧은 길이 / 긴 길이 배열 중 가장 큰 값 찾기
		int shortMax = 0;
		int longMax = 0;
		for (int i = 0; i < sizes.length; i++) {
			if (shortLength[i] > shortMax) shortMax = shortLength[i];
			if (longLength[i] > longMax) longMax = longLength[i];
		}

		// 명함의 짧은 길이 / 긴 길이 중 가장 큰 값을 곱한 값을 return
		return shortMax * longMax;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(sol.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
		System.out.println(sol.solution(new int[][]{{10,7},{12,3},{8,15},{14,7},{5,15}}));
		System.out.println(sol.solution(new int[][]{{14,4},{19,6},{6,16},{18,7},{7,11}}));
	}
}

/*
테스트 1 〉	통과 (0.04ms, 72.9MB)
테스트 2 〉	통과 (0.04ms, 73.6MB)
테스트 3 〉	통과 (0.05ms, 70.6MB)
테스트 4 〉	통과 (0.02ms, 71.7MB)
테스트 5 〉	통과 (0.03ms, 72.2MB)
테스트 6 〉	통과 (0.08ms, 72.2MB)
테스트 7 〉	통과 (0.03ms, 75.6MB)
테스트 8 〉	통과 (0.05ms, 77.7MB)
테스트 9 〉	통과 (0.04ms, 76MB)
테스트 10 〉	통과 (0.05ms, 80.6MB)
테스트 11 〉	통과 (0.38ms, 74.7MB)
테스트 12 〉	통과 (0.07ms, 78.1MB)
테스트 13 〉	통과 (0.21ms, 79.8MB)
테스트 14 〉	통과 (0.31ms, 76.7MB)
테스트 15 〉	통과 (0.50ms, 76.7MB)
테스트 16 〉	통과 (1.13ms, 73.6MB)
테스트 17 〉	통과 (1.16ms, 86.5MB)
테스트 18 〉	통과 (1.58ms, 81.5MB)
테스트 19 〉	통과 (1.65ms, 97.8MB)
테스트 20 〉	통과 (1.46ms, 90.4MB)
 */
