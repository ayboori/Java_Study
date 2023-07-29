// 삼총사
package Test07.Test0712_P;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();
		int[] t1 = {-2, 3, 0, 2, -5};
		int[] t2 = {-3, -2, -1, 0, 1, 2, 3};
		int[] t3 = {-1, 1, -1, 1};

		System.out.println(jisoo.solution(t1));
		System.out.println(jisoo.solution(t2));
		System.out.println(jisoo.solution(t3));

	}

	public int solution(int[] number) {
		int answer = 0;
		for (int i = 0; i < number.length - 2; i++) {
			for (int j = i + 1; j < number.length - 1; j++) {
				for (int k = j + 1; k < number.length; k++) {
					if (number[i] + number[j] + number[k] == 0) {
						answer++;
					}
				}
			}
		}

		return answer;
	}
}

/*
정확성  테스트
테스트 1 〉통과 (0.03ms, 77.8MB)
테스트 2 〉통과 (0.02ms, 75.9MB)
테스트 3 〉통과 (0.02ms, 73.4MB)
테스트 4 〉통과 (0.02ms, 72.5MB)
테스트 5 〉통과 (0.02ms, 77.5MB)
테스트 6 〉통과 (0.02ms, 74.6MB)
테스트 7 〉통과 (0.04ms, 77MB)
테스트 8 〉통과 (0.02ms, 78.4MB)
테스트 9 〉통과 (0.02ms, 79MB)
테스트 10 〉통과 (0.03ms, 72.6MB)
테스트 11 〉통과 (0.02ms, 74.6MB)
테스트 12 〉통과 (0.03ms, 70.9MB)
테스트 13 〉통과 (0.03ms, 77.1MB)
 */
