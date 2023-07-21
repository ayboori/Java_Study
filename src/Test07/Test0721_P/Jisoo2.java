// 크기가 작은 부분 문자열

package Test07.Test0721_P;

public class Jisoo2 {
	public static void main(String[] args) {
		Jisoo2 js = new Jisoo2();

		System.out.println(js.solution("3141592", "271"));
		System.out.println(js.solution("500220839878", "7"));
		System.out.println(js.solution("10203", "15"));

	}

	public int solution(String t, String p) {
		int answer = 0;
		int tLen = t.length();
		int pLen = p.length();
		// substring과 p를 비교한다.(char값으로 비교한다.)
		for (int i = 0; i <= tLen - pLen; i++) {
			String temp = t.substring(i, i + pLen);
			// substring한 temp가 p와 같으면 answer에 ++하고 다음 for문으로
			if (temp.equals(p)) {
				answer++;
				continue;
			}
			// substring한 temp를 앞에서부터 char값으로 비교하여 대소를 비교한다.
			// char값을 비교하여 작으면 answer++
			// char값을 비교하여 같으면 다음 값을 비교한다.
			// char값을 비교하여 더 크면 break;로 비교를 하지 않는다.
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) < p.charAt(j)) {
					answer++;
					break;
				} else if (temp.charAt(j) == p.charAt(j)) {
					continue;
				} else {
					break;
				}
			}
		}
		return answer;
	}
}
/*
시간은 더 짧아졌지만 가독성이 훨씬 떨어진다. 이 정도 시간 차이가 나면 그냥 Long.parseLong() 매서드를 써서
짧게 쓰는게 더 좋은 것 같다!

? 근데 charAt으로 비교하는거면 char[]로 만들어서 비교하면 더 빠르지 않을까? > Jisoo3

정확성  테스트 ( 0.02ms ~ 2.59ms )

테스트 1 〉통과 (0.53ms, 76MB)
테스트 2 〉통과 (2.05ms, 72.1MB)
테스트 3 〉통과 (1.38ms, 74.8MB)
테스트 4 〉통과 (0.75ms, 72MB)
테스트 5 〉통과 (0.42ms, 75.8MB)
테스트 6 〉통과 (2.18ms, 75.9MB)
테스트 7 〉통과 (2.01ms, 77.3MB)
테스트 8 〉통과 (0.72ms, 78.8MB)
테스트 9 〉통과 (0.20ms, 74.6MB)
테스트 10 〉통과 (0.08ms, 75.6MB)
테스트 11 〉통과 (0.96ms, 77.1MB)
테스트 12 〉통과 (2.59ms, 68.9MB)
테스트 13 〉통과 (1.58ms, 77.6MB)
테스트 14 〉통과 (0.80ms, 72.8MB)
테스트 15 〉통과 (0.90ms, 92.2MB)
테스트 16 〉통과 (0.78ms, 73.6MB)
테스트 17 〉통과 (1.43ms, 73MB)
테스트 18 〉통과 (1.73ms, 75.8MB)
테스트 19 〉통과 (0.54ms, 84.9MB)
테스트 20 〉통과 (0.34ms, 78.6MB)
테스트 21 〉통과 (0.04ms, 72.6MB)
테스트 22 〉통과 (0.09ms, 74.1MB)
테스트 23 〉통과 (0.22ms, 71.5MB)
테스트 24 〉통과 (0.03ms, 74.3MB)
테스트 25 〉통과 (0.04ms, 63.3MB)
테스트 26 〉통과 (0.04ms, 76.4MB)
테스트 27 〉통과 (0.04ms, 64.6MB)
테스트 28 〉통과 (0.02ms, 78.9MB)
테스트 29 〉통과 (0.05ms, 72.1MB)
테스트 30 〉통과 (0.23ms, 75MB)
테스트 31 〉통과 (0.03ms, 72.2MB)
테스트 32 〉통과 (0.03ms, 75.7MB)
테스트 33 〉통과 (0.02ms, 69.6MB)
테스트 34 〉통과 (0.03ms, 76.6MB)
테스트 35 〉통과 (0.05ms, 72.2MB)
테스트 36 〉통과 (0.04ms, 81.2MB)
테스트 37 〉통과 (0.03ms, 75.8MB)
테스트 38 〉통과 (0.03ms, 65.5MB)
 */