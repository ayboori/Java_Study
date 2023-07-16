// 최소 직사각형
package Test07.Test0714_P;

public class Jisoo {

	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();
		int[][] t1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int[][] t2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int[][] t3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

		System.out.println(jisoo.solution(t1));
		System.out.println(jisoo.solution(t2));
		System.out.println(jisoo.solution(t3));
	}

	public int solution(int[][] sizes) {
		int height = 0; // 작은 애 중에 큰 애
		int width = 0; // 큰 애 중에 큰 애
		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] < sizes[i][1]) {
				height = Math.max(height, sizes[i][0]);
				width = Math.max(width, sizes[i][1]);
			} else {
				height = Math.max(height, sizes[i][1]);
				width = Math.max(width, sizes[i][0]);
			}
		}
		return width * height;
	}
}

/*

테스트 1 〉통과 (0.04ms, 74.3MB)
테스트 2 〉통과 (0.04ms, 77.7MB)
테스트 3 〉통과 (0.03ms, 74.9MB)
테스트 4 〉통과 (0.03ms, 74.9MB)
테스트 5 〉통과 (0.03ms, 76.7MB)
테스트 6 〉통과 (0.03ms, 73.1MB)
테스트 7 〉통과 (0.03ms, 74.6MB)
테스트 8 〉통과 (0.04ms, 77.2MB)
테스트 9 〉통과 (0.03ms, 73.6MB)
테스트 10 〉통과 (0.03ms, 72.3MB)
테스트 11 〉통과 (0.04ms, 75.4MB)
테스트 12 〉통과 (0.08ms, 79MB)
테스트 13 〉통과 (0.17ms, 78.8MB)
테스트 14 〉통과 (0.39ms, 78.1MB)
테스트 15 〉통과 (1.26ms, 83.2MB)
테스트 16 〉통과 (0.59ms, 77.4MB)
테스트 17 〉통과 (0.74ms, 87.9MB)
테스트 18 〉통과 (1.39ms, 86.2MB)
테스트 19 〉통과 (1.33ms, 85.4MB)
테스트 20 〉통과 (1.42ms, 90.5MB)

 */
