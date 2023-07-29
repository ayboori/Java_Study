// 이상한 문자 만들기
package Test07.Test0705_P;

public class Other_J_2 {
	public static void main(String[] args) {
		Other_J_2 otherJ2 = new Other_J_2();

		System.out.println(otherJ2.solution("try hello world"));
	}

	public String solution(String s) {

		String answer = "";
		int cnt = 0;
		String[] array = s.split("");

		for (String ss : array) {
			cnt = ss.contains(" ") ? 0 : cnt + 1;
			answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		return answer;
	}
}
/*
코드가 짧아서 그런지 다른 사람의 풀이 중 좋아요를 가장 많이 받았던 코드

느린 이유? 아마도 concat일 것 같다.

1. concat을 StringBuilder append로 바꿔본다면?
  줄어들긴 했지만 테스트 4의 경우 0.76ms로 다른 풀이보다 느린 편.

2. 1번으로 수정 후, 다시 원인 분석
  char[] 를 쓰느냐 String[]을 쓰느냐의 차이 같기도 하다. 바꿔보자.
  테스트 4가 0.11ms로 줄어들었다1

정확성  테스트

테스트 1 〉통과 (1.52ms, 74.6MB)
테스트 2 〉통과 (1.27ms, 75.9MB)
테스트 3 〉통과 (1.30ms, 71.4MB)
테스트 4 〉통과 (2.70ms, 69MB)
테스트 5 〉통과 (1.36ms, 72.1MB)
테스트 6 〉통과 (1.51ms, 75.6MB)
테스트 7 〉통과 (1.92ms, 82.4MB)
테스트 8 〉통과 (2.74ms, 75.8MB)
테스트 9 〉통과 (1.53ms, 78.9MB)
테스트 10 〉통과 (2.10ms, 73.3MB)
테스트 11 〉통과 (2.06ms, 75.1MB)
테스트 12 〉통과 (2.68ms, 74.8MB)
테스트 13 〉통과 (1.63ms, 73MB)
테스트 14 〉통과 (1.90ms, 74.2MB)
테스트 15 〉통과 (1.38ms, 72.2MB)
테스트 16 〉통과 (2.22ms, 76.1MB)
 */
