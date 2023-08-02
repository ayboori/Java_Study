package Test08.t0802;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();
		int[] food1 = {1, 3, 4, 6};
		int[] food2 = {1, 7, 1, 2};

		System.out.println(jisoo.solution(food1));
		// 1 22 333 0 333 22 1
		System.out.println(jisoo.solution(food2));
		// 111 3 0 3 111
	}

	// for문 돌면서 붙이고, 0붙이고, for문 거꾸로 돌면서 붙이고
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < food.length; i++) {
			for (int j = 1; j <= food[i] / 2; j++) {
				sb.append(i);
			}
		}
		sb.append(0);
		for (int i = food.length - 1; i >= 1; i--) {
			for (int j = 1; j <= food[i] / 2; j++) {
				sb.append(i);
			}
		}
		return sb.toString();
	}
}

/*
정확성  테스트 (0.03ms ~ 1.37ms)

테스트 1 〉통과 (0.78ms, 72.7MB)
테스트 2 〉통과 (0.67ms, 76.1MB)
테스트 3 〉통과 (0.59ms, 72.7MB)
테스트 4 〉통과 (0.74ms, 76.6MB)
테스트 5 〉통과 (0.30ms, 74.8MB)
테스트 6 〉통과 (0.85ms, 76.3MB)
테스트 7 〉통과 (0.76ms, 76.9MB)
테스트 8 〉통과 (0.87ms, 86.7MB)
테스트 9 〉통과 (0.52ms, 83.3MB)
테스트 10 〉통과 (0.48ms, 72.4MB)
테스트 11 〉통과 (0.05ms, 79MB)
테스트 12 〉통과 (0.03ms, 77MB)
테스트 13 〉통과 (0.03ms, 70MB)
테스트 14 〉통과 (1.37ms, 74.3MB)
테스트 15 〉통과 (0.05ms, 74MB)
테스트 16 〉통과 (0.03ms, 68.1MB)
테스트 17 〉통과 (0.02ms, 74.4MB)
테스트 18 〉통과 (0.04ms, 79.8MB)
테스트 19 〉통과 (0.03ms, 72.8MB)
테스트 20 〉통과 (0.03ms, 75.3MB)
 */