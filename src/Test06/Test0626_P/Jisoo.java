// lv. 1 최대공약수와 최소공배수
package Test06.Test0626_P;

import java.util.Arrays;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();

		System.out.println(Arrays.toString(jisoo.solution(3, 12)));
		System.out.println(Arrays.toString(jisoo.solution(2, 5)));
	}

	public int[] solution(int n, int m) {
		// 최대공약수 구하기(greatest common divisor)
		int gcd = 1;
		int min = n < m ? n : m;
		for (int i = min; i >= 1; i--) {
			if (n % i == 0 && m % i == 0) {
				gcd = i;
				break;
			}
		}

		// 최소공배수 구하기(largest common multiple)
		// n = gcd * a , m = gcd * b 로 나타낼 수 있습니다.
		// lcm = gcd * a * b 이므로,
		// lcm = n * m / gcd;로 나타낼 수 있습니다.
		int lcm = n * m / gcd;
		return new int[] {gcd, lcm};
	}
}

/*
테스트 1 〉통과 (0.02ms, 74.2MB)
테스트 2 〉통과 (0.02ms, 77.3MB)
테스트 3 〉통과 (0.02ms, 75.1MB)
테스트 4 〉통과 (0.01ms, 71.9MB)
테스트 5 〉통과 (0.03ms, 75.9MB)
테스트 6 〉통과 (0.01ms, 79.5MB)
테스트 7 〉통과 (0.02ms, 72MB)
테스트 8 〉통과 (0.03ms, 76.7MB)
테스트 9 〉통과 (0.01ms, 79.5MB)
테스트 10 〉통과 (0.02ms, 76.8MB)
테스트 11 〉통과 (0.02ms, 75.4MB)
테스트 12 〉통과 (0.04ms, 77.8MB)
테스트 13 〉통과 (0.04ms, 73MB)
테스트 14 〉통과 (0.05ms, 79.4MB)
테스트 15 〉통과 (0.04ms, 73.5MB)
테스트 16 〉통과 (0.05ms, 79.9MB)
 */