// 3진법 뒤집기
package Test07.Test0703_P;

public class Jisoo2 {
	public static void main(String[] args) {
		Jisoo2 jisoo = new Jisoo2();

		System.out.println(jisoo.solution(45));
		System.out.println(jisoo.solution(125));
	}

	// 메서드를 이용하여 구해보기
	public int solution(int n) {
		// reverse() 메서드를 이용하기 위하여 StringBuilder 초기화
		StringBuilder sb = new StringBuilder();
		// n을 3진법으로 변환
		sb.append(Integer.toString(n, 3));
		// 3진법으로 변환한 걸 뒤집기
		sb.reverse();
		// 뒤집은 것(3진수)을 다시 10진법으로 변환
		int answer = Integer.parseInt(sb.toString(),3);
		return answer;
	}
}
/*
다른 사람의 풀이에서 보인 메서드
Math.pow(int a, int b) : a의 b제곱 -> 나중에 3진수를 10진법으로 변환할 때 쓰였음.

사용한 메서드
Integer.toString(int n, int radix) : int n을 radix진법으로 바꾸어 String으로 return
StringBuilder.reverse() : StringBuilder에 들어있는 문자열을 거꾸로 뒤집는다.
Integer.parseInt(String str, int radix) : radix진법인 str을 다시 10진법으로 바꾸어 int로 return.

시간적으로 따지면 비슷비슷하다~ 메서드를 안 썼을 때가 진짜 약간 더 빠른 느낌?
하지만 가독성은 메서드를 이용하는 쪽이 확실히 더 높은 것 같다!
두 방법 다 알아두면 좋을 거 같다!

정확성  테스트

테스트 1 〉통과 (0.06ms, 77.1MB)
테스트 2 〉통과 (0.06ms, 76.7MB)
테스트 3 〉통과 (0.08ms, 73.6MB)
테스트 4 〉통과 (0.07ms, 75.8MB)
테스트 5 〉통과 (0.05ms, 74.7MB)
테스트 6 〉통과 (0.07ms, 70.8MB)
테스트 7 〉통과 (0.06ms, 72MB)
테스트 8 〉통과 (0.05ms, 71.4MB)
테스트 9 〉통과 (0.08ms, 78.2MB)
테스트 10 〉통과 (0.07ms, 75MB)
 */