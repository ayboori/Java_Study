// 2016년
package Test08.t0823;

import java.util.Calendar;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();
		System.out.println(jisoo.solution(5, 24));
	}

	public String solution(int a, int b) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		date1.set(2016, 0, 1);
		date2.set(2016, a - 1, b);
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000 / (24 * 60 * 60);
		return switch ((int) (difference % 7)) {
			case 0 -> "FRI";
			case 1 -> "SAT";
			case 2 -> "SUN";
			case 3 -> "MON";
			case 4 -> "TUE";
			case 5 -> "WED";
			case 6 -> "THU";
			default -> "";
		};
	}
}

/*
(16.96 ~ 36.83)

테스트 1 〉통과 (16.96ms, 80MB)
테스트 2 〉통과 (23.61ms, 80.5MB)
테스트 3 〉통과 (20.17ms, 82.7MB)
테스트 4 〉통과 (20.84ms, 92.5MB)
테스트 5 〉통과 (25.70ms, 82.5MB)
테스트 6 〉통과 (22.65ms, 68.3MB)
테스트 7 〉통과 (20.57ms, 75.1MB)
테스트 8 〉통과 (24.01ms, 81MB)
테스트 9 〉통과 (36.83ms, 77MB)
테스트 10 〉통과 (25.75ms, 72.4MB)
테스트 11 〉통과 (34.28ms, 76MB)
테스트 12 〉통과 (22.76ms, 77.6MB)
테스트 13 〉통과 (30.94ms, 83.9MB)
테스트 14 〉통과 (33.30ms, 71.8MB)
 */