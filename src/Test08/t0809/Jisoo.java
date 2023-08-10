// 콜라 문제
package Test08.t0809;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();
		System.out.println(jisoo.solution(2, 1, 20));
		System.out.println(jisoo.solution(3, 1, 20));
		System.out.println(jisoo.solution(3, 2, 20));
	}

	public int solution(int a, int b, int n) {
		int answer = 0;
		while (n >= a) { // n < a 일때까지 계속 돌린다.
			answer += n / a * b; // 교환하기
			n = (n / a * b) + n % a; // n / a * b : 받은 콜라, n % a : 남은 콜라
		}
		return answer;
	}
}

/*
정확성  테스트 (0.01 ~ 0.03ms)

테스트 1 〉통과 (0.03ms, 76.6MB)
테스트 2 〉통과 (0.03ms, 76.3MB)
테스트 3 〉통과 (0.02ms, 78.8MB)
테스트 4 〉통과 (0.02ms, 74.9MB)
테스트 5 〉통과 (0.02ms, 72.2MB)
테스트 6 〉통과 (0.02ms, 75.8MB)
테스트 7 〉통과 (0.01ms, 77.3MB)
테스트 8 〉통과 (0.02ms, 82MB)
테스트 9 〉통과 (0.02ms, 73MB)
테스트 10 〉통과 (0.02ms, 78.1MB)
테스트 11 〉통과 (0.02ms, 69.6MB)
테스트 12 〉통과 (0.08ms, 66.6MB)
테스트 13 〉통과 (0.02ms, 74.5MB)
테스트 14 〉통과 (0.02ms, 77.6MB)
 */