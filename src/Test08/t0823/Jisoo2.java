// 2016년
package Test08.t0823;

import java.util.Calendar;

public class Jisoo2 {
	public static void main(String[] args) {
		Jisoo2 jisoo = new Jisoo2();
		System.out.println(jisoo.solution(5, 24));
	}

	public String solution(int a, int b) {
		String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		Calendar date1 = Calendar.getInstance();
		date1.set(2016, a - 1, b);
		return days[date1.get(Calendar.DAY_OF_WEEK) - 1];
	}
}

/*
(17.57 ~ 61.52)

테스트 1 〉통과 (20.53ms, 93.7MB)
테스트 2 〉통과 (35.88ms, 84MB)
테스트 3 〉통과 (43.20ms, 89.8MB)
테스트 4 〉통과 (22.03ms, 72.1MB)
테스트 5 〉통과 (32.57ms, 71.9MB)
테스트 6 〉통과 (61.52ms, 87.8MB)
테스트 7 〉통과 (48.15ms, 73.6MB)
테스트 8 〉통과 (49.59ms, 81.1MB)
테스트 9 〉통과 (57.21ms, 73.4MB)
테스트 10 〉통과 (19.74ms, 83.9MB)
테스트 11 〉통과 (24.85ms, 78MB)
테스트 12 〉통과 (38.07ms, 76.9MB)
테스트 13 〉통과 (42.23ms, 72.9MB)
테스트 14 〉통과 (17.57ms, 78.5MB)
 */