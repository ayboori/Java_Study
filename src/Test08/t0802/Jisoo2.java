package Test08.t0802;

public class Jisoo2 {
	public static void main(String[] args) {
		Jisoo2 jisoo = new Jisoo2();
		int[] food1 = {1, 3, 4, 6};
		int[] food2 = {1, 7, 1, 2};

		System.out.println(jisoo.solution(food1));
		// 1 22 333 0 333 22 1
		System.out.println(jisoo.solution(food2));
		// 111 3 0 3 111
	}

	// for문으로 찹찹 붙이고, 0붙이고, 뒤집은 것을 붙이는 방식
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < food.length; i++) {
			for (int j = 1; j <= food[i] / 2; j++) {
				sb.append(i);
			}
		}
		StringBuilder sb2 = new StringBuilder(sb);
		sb.append(0);
		sb.append(sb2.reverse());
		return sb.toString();
	}
}

/*
정확성  테스트 (0.05ms ~ 1.07ms)

테스트 1 〉통과 (0.68ms, 77.5MB)
테스트 2 〉통과 (0.71ms, 74.2MB)
테스트 3 〉통과 (0.55ms, 74.3MB)
테스트 4 〉통과 (0.58ms, 75.7MB)
테스트 5 〉통과 (0.20ms, 78.9MB)
테스트 6 〉통과 (0.81ms, 74.5MB)
테스트 7 〉통과 (0.61ms, 77.5MB)
테스트 8 〉통과 (0.54ms, 75.7MB)
테스트 9 〉통과 (0.43ms, 74.6MB)
테스트 10 〉통과 (0.35ms, 74.5MB)
테스트 11 〉통과 (0.05ms, 77MB)
테스트 12 〉통과 (0.06ms, 69.3MB)
테스트 13 〉통과 (0.06ms, 77MB)
테스트 14 〉통과 (1.07ms, 76.5MB)
테스트 15 〉통과 (0.04ms, 78.3MB)
테스트 16 〉통과 (0.05ms, 75.1MB)
테스트 17 〉통과 (0.07ms, 74.4MB)
테스트 18 〉통과 (0.04ms, 70.6MB)
테스트 19 〉통과 (0.04ms, 78.6MB)
테스트 20 〉통과 (0.06ms, 75MB)
 */