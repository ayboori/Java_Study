package Test06.Test0626_P;

import java.util.Arrays;

public class Other_J {
	public static void main(String[] args) {
		Other_J otherJ = new Other_J();

		System.out.println(Arrays.toString(otherJ.solution(3, 12)));
		System.out.println(Arrays.toString(otherJ.solution(2, 5)));

	}

	public int[] solution(int a, int b) {
		int[] answer = new int[2];

		answer[0] = gcd(a, b);
		answer[1] = (a * b) / answer[0];
		return answer;
	}

	// 재귀함수로 최대공약수를 구한다.
	public static int gcd(int p, int q) {
		if (q == 0){
			return p;
		}
		return gcd(q, p % q);
	}
}

/*
테스트 1 〉통과 (0.03ms, 73.8MB)
테스트 2 〉통과 (0.01ms, 72.3MB)
테스트 3 〉통과 (0.02ms, 78.5MB)
테스트 4 〉통과 (0.02ms, 79.7MB)
테스트 5 〉통과 (0.02ms, 78.5MB)
테스트 6 〉통과 (0.03ms, 75.3MB)
테스트 7 〉통과 (0.02ms, 72.7MB)
테스트 8 〉통과 (0.02ms, 82.2MB)
테스트 9 〉통과 (0.01ms, 74.2MB)
테스트 10 〉통과 (0.02ms, 77.4MB)
테스트 11 〉통과 (0.02ms, 79.3MB)
테스트 12 〉통과 (0.02ms, 80.8MB)
테스트 13 〉통과 (0.02ms, 74.6MB)
테스트 14 〉통과 (0.02ms, 70.1MB)
테스트 15 〉통과 (0.03ms, 77.9MB)
테스트 16 〉통과 (0.01ms, 71.5MB)
 */