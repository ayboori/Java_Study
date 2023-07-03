// 3진법 뒤집기
package Test07.Test0703_P;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();

		System.out.println(jisoo.solution(45));
		System.out.println(jisoo.solution(125));
	}

	public int solution(int n) {
		// 1. n=45라면 3으로 나누면서 3을 나눈 나머지를 StringBuilder에 저장.
		StringBuilder sb = new StringBuilder();

		// 2. StringBuilder -> 22111이 됨. 3진법으로 바꾸고, 앞뒤 반전하는 과정을 한 번에 할 수 있다.
		//    (45를 3진법으로 바꾸면 11122이다.)
		while (n != 0) {
			sb.append(n % 3);
			n = n / 3;
		}

		// 3. 22111(3)을 10진법으로 바꾸려면 오른쪽 끝에서부터 1, 3, 9, ... 를 곱하여 더하면 된다.
		// 이 때 곱하는 수를 multiple이라 하고, 더해주는 값을 answer이라고 해준다.
		int multiple = 1;
		int answer = 0;

		// for문을 i=sb.length()-1부터 0까지 i--해준다.
		for (int i = sb.length() - 1; i >= 0; i--) {

			// charAt()-'0'으로 숫자를 구하고 multiple과 곱한 값을 answer에 더해준다.
			answer += (sb.charAt(i) - '0') * multiple;

			// multiple에 3을 곱해준다.
			multiple *= 3;
		}

		// 그러면 answer = 1*1 + 1*3 + 1*9 + 2*27 + 2*81 = 229로 예제와 같이 답을 구할 수 있다.
		return answer;
	}
}

// 예전에는 Integer.toString() 메서드를 이용하여 했는데,
// 메서드를 사용하지 말고 직접 구해보고 싶어서 한 번 해봤음!

/*
정확성  테스트

테스트 1 〉통과 (0.04ms, 72.4MB)
테스트 2 〉통과 (0.04ms, 73.8MB)
테스트 3 〉통과 (0.04ms, 72.9MB)
테스트 4 〉통과 (0.06ms, 74.5MB)
테스트 5 〉통과 (0.05ms, 78MB)
테스트 6 〉통과 (0.04ms, 77.9MB)
테스트 7 〉통과 (0.05ms, 69.8MB)
테스트 8 〉통과 (0.04ms, 74.5MB)
테스트 9 〉통과 (0.04ms, 69.8MB)
테스트 10 〉통과 (0.06ms, 73.9MB)
 */