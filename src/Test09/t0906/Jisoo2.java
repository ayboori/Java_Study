// 소수 만들기
package Test09.t0906;

public class Jisoo2 {
	public static void main(String[] args) {
		Jisoo2 js = new Jisoo2();
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

	// num은 소수인가 판별하는 메서드
	// 2부터 루트 num까지 돌려서 나눠지는지 찾는다.
	public boolean isPrimeNumber(int num) {
		int sqrt = (int) Math.sqrt(num);
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}

/*
정확성  테스트(0.02ms ~ 2.28ms)

테스트 1 〉통과 (0.44ms, 77MB)
테스트 2 〉통과 (0.47ms, 72.9MB)
테스트 3 〉통과 (0.22ms, 73.9MB)
테스트 4 〉통과 (0.17ms, 74.4MB)
테스트 5 〉통과 (0.46ms, 75.6MB)
테스트 6 〉통과 (0.71ms, 74.4MB)
테스트 7 〉통과 (0.08ms, 73.3MB)
테스트 8 〉통과 (2.03ms, 87.7MB)
테스트 9 〉통과 (0.22ms, 77.7MB)
테스트 10 〉통과 (1.92ms, 76.4MB)
테스트 11 〉통과 (0.04ms, 77.7MB)
테스트 12 〉통과 (0.06ms, 72.9MB)
테스트 13 〉통과 (0.06ms, 72MB)
테스트 14 〉통과 (0.04ms, 77.2MB)
테스트 15 〉통과 (0.04ms, 73.1MB)
테스트 16 〉통과 (1.58ms, 76.3MB)
테스트 17 〉통과 (1.15ms, 82.6MB)
테스트 18 〉통과 (0.04ms, 75.4MB)
테스트 19 〉통과 (0.05ms, 73.3MB)
테스트 20 〉통과 (1.84ms, 77.5MB)
테스트 21 〉통과 (1.88ms, 71.7MB)
테스트 22 〉통과 (0.27ms, 81.9MB)
테스트 23 〉통과 (0.02ms, 74.8MB)
테스트 24 〉통과 (1.70ms, 76.3MB)
테스트 25 〉통과 (2.28ms, 81.1MB)
테스트 26 〉통과 (0.03ms, 75.6MB)
 */