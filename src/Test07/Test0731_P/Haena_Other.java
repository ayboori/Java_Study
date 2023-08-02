// 두 개 뽑아서 더하기
package Test07.Test0731_P;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Haena_Other {
	public int[] solution(int[] numbers) {
		Set<Integer> set = new HashSet<>();

		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}

		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		Haena_Other sol = new Haena_Other();
		System.out.println(Arrays.toString(sol.solution(new int[]{2, 1, 3, 4, 1})));
		System.out.println(Arrays.toString(sol.solution(new int[]{5, 0, 2, 7})));
	}
}

/*
테스트 1 〉	통과 (2.26ms, 79.3MB)
테스트 2 〉	통과 (3.66ms, 78.7MB)
테스트 3 〉	통과 (5.58ms, 76.6MB)
테스트 4 〉	통과 (3.40ms, 71.9MB)
테스트 5 〉	통과 (10.30ms, 77.7MB)
테스트 6 〉	통과 (5.59ms, 78.3MB)
테스트 7 〉	통과 (6.06ms, 77.7MB)
테스트 8 〉	통과 (3.03ms, 78.2MB)
테스트 9 〉	통과 (3.18ms, 76.4MB)
 */