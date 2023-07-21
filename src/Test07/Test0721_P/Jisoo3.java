// 크기가 작은 부분 문자열

package Test07.Test0721_P;

public class Jisoo3 {
	public static void main(String[] args) {
		Jisoo3 js = new Jisoo3();

		System.out.println(js.solution("3141592", "271"));
		System.out.println(js.solution("500220839878", "7"));
		System.out.println(js.solution("10203", "15"));

	}
	/*
	1. 각 문자열을 char[]로 만든다.
	2. 순서대로 char값을 비교한다. "3141592" "271"의 경우,
		1) '3', '1', '4' & '2', '7', '1' 비교
		2) '1', '4', '1' & '2', '7', '1' 비교
		3) '4', '1', '5' & '2', '7', '1' 비교
		...
		5) '5', '9', '2' & '2', '7', '1' 비교
	 */
	public int solution(String t, String p) {
		int answer = 0;
		int tLen = t.length();
		int pLen = p.length();
		char[] tArr = t.toCharArray();
		char[] pArr = p.toCharArray();
		for (int i = 0; i <= tLen - pLen; i++) {
			for (int j = 0; j < pLen; j++) {
				// t가 작으면 얘는 작은 값이기 때문에 더 비교할 필요 없이 answer++해주고 for문 탈출
				if (tArr[i + j] < pArr[j]) {
					answer++;
					break;

				// t와 p가 똑같으면 다음 index에서 비교
				} else if (tArr[i + j] == pArr[j]) {

				// t가 p보다 크면 큰값이기 때문에 더 비교할 필요 없이 for문 탈출
				} else {
					break;
				}

				// t와 p가 계속 같아서 마지막 index까지 오게 되었다면 같은 값이므로 answer++해준다.
				if (j == pLen - 1) {
					answer++;
				}
			}
		}
		return answer;
	}
}
/*
정확성  테스트 (0.02ms ~ 0.80ms) >>> 이궈궈던~~~ 그래도 가독성은 처음 풀었던 게 더 좋은 거 같음.

테스트 1 〉통과 (0.13ms, 76.3MB)
테스트 2 〉통과 (0.80ms, 77.6MB)
테스트 3 〉통과 (0.79ms, 77MB)
테스트 4 〉통과 (0.38ms, 81.4MB)
테스트 5 〉통과 (0.09ms, 80MB)
테스트 6 〉통과 (0.45ms, 78.8MB)
테스트 7 〉통과 (0.48ms, 76.5MB)
테스트 8 〉통과 (0.23ms, 74.8MB)
테스트 9 〉통과 (0.11ms, 82.6MB)
테스트 10 〉통과 (0.05ms, 74.3MB)
테스트 11 〉통과 (0.47ms, 72.6MB)
테스트 12 〉통과 (0.50ms, 77.1MB)
테스트 13 〉통과 (0.33ms, 78.1MB)
테스트 14 〉통과 (0.24ms, 70MB)
테스트 15 〉통과 (0.47ms, 71.4MB)
테스트 16 〉통과 (0.23ms, 78.8MB)
테스트 17 〉통과 (0.39ms, 80.1MB)
테스트 18 〉통과 (0.75ms, 90.7MB)
테스트 19 〉통과 (0.31ms, 79.2MB)
테스트 20 〉통과 (0.11ms, 73.8MB)
테스트 21 〉통과 (0.03ms, 75MB)
테스트 22 〉통과 (0.06ms, 74.7MB)
테스트 23 〉통과 (0.12ms, 73.3MB)
테스트 24 〉통과 (0.03ms, 77.4MB)
테스트 25 〉통과 (0.03ms, 74.2MB)
테스트 26 〉통과 (0.03ms, 76.6MB)
테스트 27 〉통과 (0.03ms, 72.9MB)
테스트 28 〉통과 (0.02ms, 78.3MB)
테스트 29 〉통과 (0.03ms, 73.4MB)
테스트 30 〉통과 (0.07ms, 77.3MB)
테스트 31 〉통과 (0.03ms, 86.3MB)
테스트 32 〉통과 (0.02ms, 66.5MB)
테스트 33 〉통과 (0.04ms, 76.9MB)
테스트 34 〉통과 (0.03ms, 81.7MB)
테스트 35 〉통과 (0.02ms, 75.7MB)
테스트 36 〉통과 (0.03ms, 78.3MB)
테스트 37 〉통과 (0.03ms, 75.3MB)
테스트 38 〉통과 (0.03ms, 73.6MB)
 */