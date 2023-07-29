package Test07.Test0707_P;

import java.util.Arrays;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();
		int[] t1 = {1, 3, 2, 5, 4};
		int[] t2 = {2, 2, 3, 3};
		System.out.println(jisoo.solution(t1, 9));
		System.out.println(jisoo.solution(t2, 10));
	}

	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			answer += d[i];
			if (answer > budget) {
				return i;
			}
		}
		return d.length;
	}

}

/*

처음에 예산 내에 예산을 쓰는 것이 아니라 예산을 정확히 다 쓴다는 건 줄 알고 하루 내내 걸렸다..ㅠ
내 주말...

정확성  테스트
테스트 1 〉통과 (0.33ms, 73.5MB)
테스트 2 〉통과 (0.40ms, 75.2MB)
테스트 3 〉통과 (0.50ms, 78MB)
테스트 4 〉통과 (0.41ms, 74.8MB)
테스트 5 〉통과 (0.50ms, 77.5MB)
테스트 6 〉통과 (0.44ms, 79.7MB)
테스트 7 〉통과 (0.39ms, 79.6MB)
테스트 8 〉통과 (0.60ms, 74.9MB)
테스트 9 〉통과 (0.51ms, 73.4MB)
테스트 10 〉통과 (0.35ms, 73.4MB)
테스트 11 〉통과 (0.53ms, 74.9MB)
테스트 12 〉통과 (0.55ms, 81MB)
테스트 13 〉통과 (0.43ms, 73.1MB)
테스트 14 〉통과 (0.55ms, 72.7MB)
테스트 15 〉통과 (0.34ms, 73.8MB)
테스트 16 〉통과 (0.35ms, 72.8MB)
테스트 17 〉통과 (0.40ms, 73.8MB)
테스트 18 〉통과 (0.58ms, 75.4MB)
테스트 19 〉통과 (0.36ms, 72.8MB)
테스트 20 〉통과 (0.36ms, 76.3MB)
테스트 21 〉통과 (0.40ms, 71MB)
테스트 22 〉통과 (0.37ms, 73.4MB)
테스트 23 〉통과 (0.35ms, 81.1MB)
 */