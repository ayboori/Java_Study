// 두 개 뽑아서 더하기
package Test07.Test0731_P;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();
		int[] numbers1 = {2, 1, 3, 4, 1};
		int[] numbers2 = {5, 0, 2, 7};

		System.out.println(Arrays.toString(jisoo.solution(numbers1)));
		System.out.println(Arrays.toString(jisoo.solution(numbers2)));

		// 최대 길이로 해서 테스트
		int[] numbers3 = new int[100];
		for (int i = 0; i < 100; i++) {
			numbers3[i] = i;
		}

		// 테스트해보기
		Long before = System.currentTimeMillis();
		jisoo.solution(numbers3);
		Long after = System.currentTimeMillis();
		System.out.println("after-before = " + (after - before));
	}

	public int[] solution(int[] numbers) {
		// 중복된 합을 없애기 위해 Set 사용
		Set<Integer> sums = new HashSet<>();

		// sums에 합 추가
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				sums.add(numbers[i] + numbers[j]);
			}
		}

		// Set을 배열로.
		// 향상된 for문에서 지혜님이 이렇게 쓰시는 방법 보고 참고.
		int[] answer = new int[sums.size()];
		int index = 0;
		for (Integer i : sums) {
			answer[index] = i;
			index++;
		}

		// 오름차순 정렬
		Arrays.sort(answer);
		return answer;
	}

}

/*
지혜님 말 생각나서 이래저래 돌려봤는데 0.5ms정도 차이 나는 것 같다..!

풀이 0.53ms ~ 1.49ms

테스트 1 〉	통과 (0.70ms, 70.7MB)
테스트 2 〉	통과 (0.59ms, 77.3MB)
테스트 3 〉	통과 (0.53ms, 76.7MB)
테스트 4 〉	통과 (0.53ms, 71.3MB)
테스트 5 〉	통과 (0.61ms, 67.8MB)
테스트 6 〉	통과 (0.86ms, 76.1MB)
테스트 7 〉	통과 (1.49ms, 78.1MB)
테스트 8 〉	통과 (1.49ms, 68.9MB)
테스트 9 〉	통과 (1.27ms, 80.4MB)
 */