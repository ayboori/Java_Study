// 소수 만들기
package Test09.t0906;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo js = new Jisoo();
		int[] nums1 = {1, 2, 3, 4};
		int[] nums2 = {1, 2, 7, 6, 4};
		System.out.println(js.solution(nums1));
		System.out.println(js.solution(nums2));
	}

	public int solution(int[] nums) {
		int primeCount = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (isPrimeNumber(nums[i] + nums[j] + nums[k])) {
						primeCount++;
					}
				}
			}
		}
		return primeCount;
	}

	/////////////////////////////////////////////////////////

	// num은 소수인가 판별하는 메서드 - 에라토스테네스의 체 이용
	public boolean isPrimeNumber(int num) {
		// 어디까지 나눠줄 것인지 정하기
		int sqrt = (int) Math.sqrt(num);

		// index를 sqrt까지 쓰기 위해.
		// int[]를 쓰지 않은 이유. int는 4byte이지만 boolean은 1byte이므로.
		boolean[] primeArray = new boolean[sqrt + 1];

		// 2부터 sqrt까지 나눠본다.
		for (int i = 2; i <= sqrt; i++) {
			if (!primeArray[i]) {		// i가 나눠볼 수라면
				if (num % i == 0) {		// i로 나눠보고 나눠진다면
					return false;		// 소수가 아니므로 false 반환
				}

				// i로 나누어지지 않았다면 i의 배수들은 나눠줄 필요 없으므로 i의 배수는 true 처리.
				int index = i + i;
				while (index <= sqrt) {
					if (!primeArray[index]) {
						primeArray[index] = true;
					}
					index += i;
				}
			}
		}

		// 어떤 수로도 나누어지지 않았다면 소수이므로 true를 반환
		return true;
	}

}

/*
정확성  테스트(0.04ms ~ 5.26ms)

테스트 1 〉통과 (0.85ms, 80.3MB)
테스트 2 〉통과 (0.76ms, 75.7MB)
테스트 3 〉통과 (0.32ms, 70.9MB)
테스트 4 〉통과 (0.34ms, 79.7MB)
테스트 5 〉통과 (1.05ms, 77.7MB)
테스트 6 〉통과 (1.23ms, 78MB)
테스트 7 〉통과 (0.16ms, 72.4MB)
테스트 8 〉통과 (3.38ms, 82.8MB)
테스트 9 〉통과 (0.49ms, 75MB)
테스트 10 〉통과 (2.32ms, 78.3MB)
테스트 11 〉통과 (0.10ms, 77MB)
테스트 12 〉통과 (0.07ms, 76.9MB)
테스트 13 〉통과 (0.12ms, 75.9MB)
테스트 14 〉통과 (0.05ms, 78.8MB)
테스트 15 〉통과 (0.07ms, 74.9MB)
테스트 16 〉통과 (5.26ms, 82.6MB)
테스트 17 〉통과 (3.07ms, 74.6MB)
테스트 18 〉통과 (0.15ms, 76.4MB)
테스트 19 〉통과 (0.05ms, 77.6MB)
테스트 20 〉통과 (4.88ms, 69.4MB)
테스트 21 〉통과 (5.05ms, 77.1MB)
테스트 22 〉통과 (1.29ms, 77.2MB)
테스트 23 〉통과 (0.04ms, 76.6MB)
테스트 24 〉통과 (3.35ms, 72.4MB)
테스트 25 〉통과 (4.50ms, 79.8MB)
테스트 26 〉통과 (0.07ms, 71.6MB)
 */