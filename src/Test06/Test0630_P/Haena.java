// lv.1 같은 숫자는 싫어
package Test06.Test0630_P;

import java.util.*;

public class Haena {
	public static void main(String[] args) {
		SolutionHn sol = new SolutionHn();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
		System.out.println(Arrays.toString(sol.solution(new int[]{4,4,4,3,3})));
	}
}

class SolutionHn {
	public int[] solution(int[] arr) {
		// 답을 담을 List 생성
		ArrayList<Integer> arrList = new ArrayList<>();

		// 첫번째 원소를 담은 후, 이후 원소부터 이전 숫자와 비교하여 다른 경우에만 list에 담도록 함
		arrList.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				arrList.add(arr[i]);
			}
		}

		// list의 원소를 int 배열에 담아 반환
		int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}
}

/*
[정확성 테스트]
테스트 1 〉	통과 (2.22ms, 88.8MB)
테스트 2 〉	통과 (1.86ms, 73MB)
테스트 3 〉	통과 (1.87ms, 74.6MB)
테스트 4 〉	통과 (2.22ms, 74MB)
테스트 5 〉	통과 (4.91ms, 87MB)
테스트 6 〉	통과 (1.98ms, 73.1MB)
테스트 7 〉	통과 (1.84ms, 67.4MB)
테스트 8 〉	통과 (2.43ms, 75.1MB)
테스트 9 〉	통과 (3.62ms, 75.1MB)
테스트 10 〉	통과 (1.88ms, 74.3MB)
테스트 11 〉	통과 (2.27ms, 76.4MB)
테스트 12 〉	통과 (2.12ms, 78.4MB)
테스트 13 〉	통과 (2.68ms, 73.6MB)
테스트 14 〉	통과 (1.87ms, 78.5MB)
테스트 15 〉	통과 (2.14ms, 74.8MB)
테스트 16 〉	통과 (1.96ms, 78.7MB)
테스트 17 〉	통과 (2.05ms, 77.3MB)

[효율성 테스트]
테스트 1 〉	통과 (33.03ms, 110MB)
테스트 2 〉	통과 (32.04ms, 114MB)
테스트 3 〉	통과 (30.70ms, 110MB)
테스트 4 〉	통과 (34.33ms, 121MB)
 */