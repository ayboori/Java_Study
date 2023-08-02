package Test08.t0802;

// 푸드 파이트 대회

public class Haena {
	public String solution(int[] food) {
		// StringBuilder 만들기
		StringBuilder sb = new StringBuilder();

		// food 배열을 돌며 값의 /2만큼 반복해서 append 하기
		for (int i = 1; i < food.length; i++) {
			for (int j = 1; j <= food[i] / 2; j++) {
				sb.append(i);
			}
		}

		// reverse 한 값 만들기
		StringBuilder sbReverse = new StringBuilder();
		sbReverse.append(sb).reverse();

		// 기존 값 + '0' + reverse한 값 append 하기
		sb.append(0);
		sb.append(sbReverse);

		// StringBuilder를 String으로 변환 후 return
		return sb.toString();
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(sol.solution(new int[]{1, 3, 4, 6}));
		System.out.println(sol.solution(new int[]{1, 7, 1, 2}));
	}
}

/*
테스트 1 〉	통과 (0.60ms, 79.6MB)
테스트 2 〉	통과 (0.66ms, 71.6MB)
테스트 3 〉	통과 (0.41ms, 75.6MB)
테스트 4 〉	통과 (0.65ms, 77.7MB)
테스트 5 〉	통과 (0.25ms, 76MB)
테스트 6 〉	통과 (0.78ms, 65.5MB)
테스트 7 〉	통과 (0.54ms, 76.2MB)
테스트 8 〉	통과 (0.43ms, 72.5MB)
테스트 9 〉	통과 (0.53ms, 79MB)
테스트 10 〉	통과 (0.35ms, 73.2MB)
테스트 11 〉	통과 (0.04ms, 75MB)
테스트 12 〉	통과 (0.04ms, 76.2MB)
테스트 13 〉	통과 (0.05ms, 75.6MB)
테스트 14 〉	통과 (0.72ms, 75.8MB)
테스트 15 〉	통과 (0.07ms, 78.3MB)
테스트 16 〉	통과 (0.07ms, 80.5MB)
테스트 17 〉	통과 (0.05ms, 73.1MB)
테스트 18 〉	통과 (0.06ms, 73.2MB)
테스트 19 〉	통과 (0.04ms, 70.9MB)
테스트 20 〉	통과 (0.09ms, 74.7MB)
 */