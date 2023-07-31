// 두 개 뽑아서 더하기
package Test07.Test0731_P;

import java.util.*;

public class Haena {
	public int[] solution(int[] numbers) {
		// 1. 중복이 허용되지 않는 Set을 만든다.
		Set<Integer> answerSet = new HashSet<>();

		// 2. 배열을 돌며 서로 다른 인덱스의 값를 더한 값을 set에 추가한다.
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				answerSet.add(numbers[i] + numbers[j]);
			}
		}

		// 3. 만들어진 Set을 int 배열로 반환한다.
		int[] answer = Arrays.stream(answerSet.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();

		// 4. int 배열을 정렬한 후 반환한다.
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(Arrays.toString(sol.solution(new int[]{2, 1, 3, 4, 1})));
		System.out.println(Arrays.toString(sol.solution(new int[]{5, 0, 2, 7})));
	}
}

/*
테스트 1 〉	통과 (2.32ms, 77.4MB)
테스트 2 〉	통과 (3.17ms, 76.1MB)
테스트 3 〉	통과 (2.38ms, 76.2MB)
테스트 4 〉	통과 (3.31ms, 77.3MB)
테스트 5 〉	통과 (2.34ms, 74.1MB)
테스트 6 〉	통과 (2.62ms, 75.6MB)
테스트 7 〉	통과 (3.20ms, 79.1MB)
테스트 8 〉	통과 (3.46ms, 72.4MB)
테스트 9 〉	통과 (3.30ms, 77.5MB)
 */