// 폰켓몬
package Test08.t0818;

import java.util.HashSet;
import java.util.Set;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();

		int[] nums1 = {3, 1, 2, 3};
		int[] nums2 = {3, 3, 3, 2, 2, 4};
		int[] nums3 = {3, 3, 3, 2, 2, 2};

		System.out.println(jisoo.solution(nums1));
		System.out.println(jisoo.solution(nums2));
		System.out.println(jisoo.solution(nums3));
	}

	public int solution(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			set.add(i);
		}
		return Math.min(set.size(), nums.length / 2);
	}
}

/*
정확성  테스트
테스트 1 〉통과 (0.05ms, 75.4MB)
테스트 2 〉통과 (0.08ms, 68MB)
테스트 3 〉통과 (0.06ms, 67.7MB)
테스트 4 〉통과 (0.08ms, 78.8MB)
테스트 5 〉통과 (0.09ms, 76.4MB)
테스트 6 〉통과 (0.08ms, 75.6MB)
테스트 7 〉통과 (0.29ms, 79.5MB)
테스트 8 〉통과 (0.32ms, 77.5MB)
테스트 9 〉통과 (0.22ms, 78MB)
테스트 10 〉통과 (0.19ms, 77.6MB)
테스트 11 〉통과 (0.29ms, 73.8MB)
테스트 12 〉통과 (0.35ms, 75MB)
테스트 13 〉통과 (1.08ms, 75.2MB)
테스트 14 〉통과 (0.65ms, 67.7MB)
테스트 15 〉통과 (0.62ms, 77.1MB)
테스트 16 〉통과 (3.61ms, 77.4MB)
테스트 17 〉통과 (3.93ms, 82.3MB)
테스트 18 〉통과 (4.34ms, 75.8MB)
테스트 19 〉통과 (2.69ms, 77.6MB)
테스트 20 〉통과 (2.58ms, 84.7MB)
 */