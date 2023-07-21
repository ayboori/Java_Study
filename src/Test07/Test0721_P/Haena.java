package Test07.Test0721_P;
// 프로그래머스 lv. 1 크기가 작은 부분 문자열

public class Haena {
	public int solution(String t, String p) {
		int cnt = 0;

		// p를 숫자로 변환한다.
		long longP = Long.parseLong(p);

		// t를 p의 길이만큼 substring 한 값을 숫자로 변환 -> p의 숫자와 비교
		// p보다 작거나 같을 경우 카운트를 더한다.
		for (int i = 0; i <= t.length() - p.length(); i++) {
			String target = t.substring(i, i + p.length());
			if (Long.parseLong(target) <= longP) cnt++;
		}

		return cnt;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(sol.solution("3141592", "271"));
		System.out.println(sol.solution("500220839878", "7"));
		System.out.println(sol.solution("10203", "15"));
	}
}

/* 테스트 통과 시간 : 0.05ms ~ 6.74ms
테스트 1 〉	통과 (2.30ms, 74MB)
테스트 2 〉	통과 (4.69ms, 80.4MB)
테스트 3 〉	통과 (3.79ms, 74.6MB)
테스트 4 〉	통과 (2.35ms, 88MB)
테스트 5 〉	통과 (3.36ms, 73.6MB)
테스트 6 〉	통과 (2.76ms, 81.3MB)
테스트 7 〉	통과 (5.02ms, 73.2MB)
테스트 8 〉	통과 (2.34ms, 79.1MB)
테스트 9 〉	통과 (1.73ms, 78.3MB)
테스트 10 〉	통과 (0.25ms, 77.9MB)
테스트 11 〉	통과 (2.80ms, 73.8MB)
테스트 12 〉	통과 (5.44ms, 75.7MB)
테스트 13 〉	통과 (6.44ms, 76.1MB)
테스트 14 〉	통과 (4.62ms, 75.5MB)
테스트 15 〉	통과 (4.40ms, 73.8MB)
테스트 16 〉	통과 (2.83ms, 80MB)
테스트 17 〉	통과 (6.74ms, 74.9MB)
테스트 18 〉	통과 (4.08ms, 73MB)
테스트 19 〉	통과 (1.98ms, 77.9MB)
테스트 20 〉	통과 (1.40ms, 77.3MB)
테스트 21 〉	통과 (0.12ms, 76.3MB)
테스트 22 〉	통과 (0.99ms, 78.4MB)
테스트 23 〉	통과 (1.64ms, 73.6MB)
테스트 24 〉	통과 (0.20ms, 78.2MB)
테스트 25 〉	통과 (0.44ms, 74.7MB)
테스트 26 〉	통과 (0.19ms, 73.7MB)
테스트 27 〉	통과 (0.17ms, 71.3MB)
테스트 28 〉	통과 (0.14ms, 74.4MB)
테스트 29 〉	통과 (0.16ms, 71.8MB)
테스트 30 〉	통과 (1.08ms, 75.2MB)
테스트 31 〉	통과 (0.06ms, 74.1MB)
테스트 32 〉	통과 (0.08ms, 72.5MB)
테스트 33 〉	통과 (0.09ms, 72.6MB)
테스트 34 〉	통과 (0.07ms, 74.7MB)
테스트 35 〉	통과 (0.10ms, 75.1MB)
테스트 36 〉	통과 (0.12ms, 72.3MB)
테스트 37 〉	통과 (0.05ms, 72.7MB)
테스트 38 〉	통과 (0.09ms, 76.4MB)
 */