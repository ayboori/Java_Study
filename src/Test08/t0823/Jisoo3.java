// 2016년
package Test08.t0823;

public class Jisoo3 {
	public static void main(String[] args) {
		Jisoo3 jisoo = new Jisoo3();
		System.out.println(jisoo.solution(5, 24));
	}

	public String solution(int a, int b) {
		String[] dayStr = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
		int days = 0;
		int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < a - 1; i++) {
			days += months[i];
		}
		days += b;
		return dayStr[days % 7];
	}
}

/*
(0.02 ~ 0.03)

테스트 1 〉통과 (0.02ms, 77.1MB)
테스트 2 〉통과 (0.03ms, 76.6MB)
테스트 3 〉통과 (0.03ms, 70.8MB)
테스트 4 〉통과 (0.03ms, 74.1MB)
테스트 5 〉통과 (0.03ms, 68.9MB)
테스트 6 〉통과 (0.02ms, 74.3MB)
테스트 7 〉통과 (0.03ms, 77.9MB)
테스트 8 〉통과 (0.04ms, 71.7MB)
테스트 9 〉통과 (0.04ms, 70.8MB)
테스트 10 〉통과 (0.04ms, 79.2MB)
테스트 11 〉통과 (0.03ms, 79.6MB)
테스트 12 〉통과 (0.04ms, 75.1MB)
테스트 13 〉통과 (0.03ms, 78.3MB)
테스트 14 〉통과 (0.03ms, 74.1MB)
 */