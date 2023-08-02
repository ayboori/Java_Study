package Test08.t0802;

public class Jisoo3 {
	public static void main(String[] args) {
		Jisoo3 jisoo = new Jisoo3();
		int[] food1 = {1, 3, 4, 6};
		int[] food2 = {1, 7, 1, 2};

		System.out.println(jisoo.solution(food1));
		// 1 22 333 0 333 22 1
		System.out.println(jisoo.solution(food2));
		// 111 3 0 3 111
	}

	// 0을 넣고 가운데부터 찹찹찹 붙이는 방식
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder("0");
		for (int i = food.length - 1; i >= 1; i--) {
			for (int j = 1; j <= food[i] / 2; j++) {
				sb.insert(0, i);
				sb.append(i);
			}
		}
		return sb.toString();
	}
}

/*
아무래도 StringBuilder도 내부 구현으로 들어가면 배열 형태로 구현이 되어 있는데,
0번 자리에 insert를 하면서 뒤에 붙였던 애들이 한 index씩 밀리면서
시간이 늦어진 것으로 추측!

정확성 테스트(0.04ms ~ 3.17ms)

테스트 1 〉통과 (2.84ms, 77.3MB)
테스트 2 〉통과 (2.09ms, 76.4MB)
테스트 3 〉통과 (1.09ms, 73.3MB)
테스트 4 〉통과 (3.17ms, 73.6MB)
테스트 5 〉통과 (0.68ms, 85.1MB)
테스트 6 〉통과 (1.62ms, 80.3MB)
테스트 7 〉통과 (1.88ms, 73.6MB)
테스트 8 〉통과 (1.72ms, 71.4MB)
테스트 9 〉통과 (1.27ms, 77.3MB)
테스트 10 〉통과 (1.24ms, 75.7MB)
테스트 11 〉통과 (0.05ms, 75.9MB)
테스트 12 〉통과 (0.06ms, 77.8MB)
테스트 13 〉통과 (0.06ms, 74.1MB)
테스트 14 〉통과 (2.67ms, 80.6MB)
테스트 15 〉통과 (0.04ms, 74.8MB)
테스트 16 〉통과 (0.06ms, 79.2MB)
테스트 17 〉통과 (0.05ms, 78.2MB)
테스트 18 〉통과 (0.04ms, 74.2MB)
테스트 19 〉통과 (0.05ms, 77.9MB)
테스트 20 〉통과 (0.09ms, 76.8MB)
 */