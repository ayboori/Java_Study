// 소수 찾기
package Test09.t0908;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo js = new Jisoo();

		long before = System.currentTimeMillis();
		js.solution(1_000_000);
		long after = System.currentTimeMillis();
		
		System.out.println("시간: " + (after - before) + "ms");	// 11ms
	}

	// 에라토스테네스의 체 이용
	// num의 최대값 1_000_000
	public int solution(int num) {
		boolean[] prime = new boolean[num + 1];
		int count = 0;
		// 2부터 루트 num까지 나누어줍니다.
		for (int i = 2; i <= Math.sqrt(num); i++) {

			// 체크하는 수를 제외하고 첫 수의 배수들을 소수에서 제외시킨다.
			if (!prime[i]) {
				for (int j = i * 2; j <= num; j += i) {
					if (!prime[j]) prime[j] = true;
				}
			}
		}

		// false처리된 것만 세서 return한다.
		for (int i = 2; i <= num; i++) {
			if (!prime[i]) {
				count++;
			}
		}
		return count;
	}
}
/*
정확성  테스트(0.03ms ~ 12.21ms)

테스트 1 〉통과 (0.03ms, 76.1MB)
테스트 2 〉통과 (0.05ms, 78.4MB)
테스트 3 〉통과 (0.08ms, 77.5MB)
테스트 4 〉통과 (0.16ms, 73.7MB)
테스트 5 〉통과 (0.06ms, 84.6MB)
테스트 6 〉통과 (0.42ms, 77.1MB)
테스트 7 〉통과 (0.13ms, 73.6MB)
테스트 8 〉통과 (0.52ms, 70.9MB)
테스트 9 〉통과 (0.84ms, 79.7MB)
테스트 10 〉통과 (11.79ms, 70.2MB)
테스트 11 〉통과 (12.21ms, 74.4MB)
테스트 12 〉통과 (9.54ms, 74.6MB)

효율성  테스트 (14.16ms ~ 25.07ms)

테스트 1 〉통과 (25.07ms, 52.2MB)
테스트 2 〉통과 (14.16ms, 53.1MB)
테스트 3 〉통과 (14.37ms, 53.3MB)
테스트 4 〉통과 (16.10ms, 52.8MB)

 */