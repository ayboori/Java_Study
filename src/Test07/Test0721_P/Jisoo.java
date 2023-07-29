// 크기가 작은 부분 문자열

package Test07.Test0721_P;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo js = new Jisoo();

		System.out.println(js.solution("3141592", "271"));
		System.out.println(js.solution("500220839878", "7"));
		System.out.println(js.solution("10203", "15"));

	}

	public int solution(String t, String p) {
		int answer = 0;
		int tLen = t.length();
		int pLen = p.length();
		long pLong = Long.parseLong(p);
		for (int i = 0; i <= tLen - pLen; i++) {
			if (Long.parseLong(t.substring(i, i + pLen)) <= pLong) {
				answer++;
			}
		}
		return answer;
	}
}
/*
정확성  테스트 ( 0.06ms ~ 5.42ms )

테스트 1 〉통과 (2.34ms, 75MB)
테스트 2 〉통과 (2.95ms, 75.9MB)
테스트 3 〉통과 (2.94ms, 71MB)
테스트 4 〉통과 (2.60ms, 77.7MB)
테스트 5 〉통과 (2.22ms, 77.3MB)
테스트 6 〉통과 (2.41ms, 78.9MB)
테스트 7 〉통과 (4.90ms, 74.7MB)
테스트 8 〉통과 (2.35ms, 81.3MB)
테스트 9 〉통과 (1.55ms, 72.3MB)
테스트 10 〉통과 (0.24ms, 76.5MB)
테스트 11 〉통과 (2.86ms, 75.8MB)
테스트 12 〉통과 (4.79ms, 77.5MB)
테스트 13 〉통과 (4.41ms, 81.1MB)
테스트 14 〉통과 (2.92ms, 72.9MB)
테스트 15 〉통과 (3.77ms, 82.1MB)
테스트 16 〉통과 (2.91ms, 85.2MB)
테스트 17 〉통과 (3.86ms, 75.4MB)
테스트 18 〉통과 (5.42ms, 78.9MB)
테스트 19 〉통과 (2.57ms, 76.4MB)
테스트 20 〉통과 (1.25ms, 77.3MB)
테스트 21 〉통과 (0.08ms, 74.9MB)
테스트 22 〉통과 (0.99ms, 77.1MB)
테스트 23 〉통과 (1.79ms, 79.3MB)
테스트 24 〉통과 (0.14ms, 73.3MB)
테스트 25 〉통과 (0.54ms, 71.6MB)
테스트 26 〉통과 (0.28ms, 73.7MB)
테스트 27 〉통과 (0.27ms, 75.4MB)
테스트 28 〉통과 (0.15ms, 73.7MB)
테스트 29 〉통과 (0.17ms, 77.3MB)
테스트 30 〉통과 (2.87ms, 71MB)
테스트 31 〉통과 (0.08ms, 73.3MB)
테스트 32 〉통과 (0.06ms, 74.9MB)
테스트 33 〉통과 (0.07ms, 68.6MB)
테스트 34 〉통과 (0.09ms, 72.4MB)
테스트 35 〉통과 (0.10ms, 75MB)
테스트 36 〉통과 (0.13ms, 72.8MB)
테스트 37 〉통과 (0.07ms, 71.1MB)
테스트 38 〉통과 (0.13ms, 72.4MB)
 */