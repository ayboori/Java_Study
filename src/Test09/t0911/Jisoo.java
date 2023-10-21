// 신고 결과 받기
package Test09.t0911;

import java.util.*;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo js = new Jisoo();
		String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
		String[] report1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k1 = 2;
		// [2, 1, 1, 0]

		String[] id_list2 = {"con", "ryan"};
		String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k2 = 3;
		// [0, 0]

		System.out.println(Arrays.toString(js.solution(id_list1, report1, k1))); // [2, 1, 1, 0]
		System.out.println(Arrays.toString(js.solution(id_list2, report2, k2))); // [0, 0]

	}

	public int[] solution(String[] id_list, String[] report, int k) {
		// 동일한 유저에 대한 신고 횟수는 1회로 처리되므로 신고 중복을 제거해준다.
		Set<String> distinct = new HashSet<>(Arrays.asList(report));

		Map<String, Integer> reportCount = new HashMap<>();		// 얼마나 신고를 받았는지
		String[] reporter = new String[distinct.size()];		// 신고한 사람
		String[] reported = new String[distinct.size()];		// 신고받은 사람

		int index = 0;
		for (String str : distinct) {
			String[] split = str.split(" ");
			reporter[index] = split[0];		// 이용자 id
			reported[index] = split[1];		// 신고한 id

			// 신고횟수 ++
			reportCount.put(split[1], reportCount.getOrDefault(split[1], 0) + 1);
			index++;
		}

		// 메일을 얼마나 보내야 하는지 체크
		Map<String, Integer> mailCount = new HashMap<>();
		for (int i = 0; i < reported.length; i++) {
			if (reportCount.get(reported[i]) >= k) {
				mailCount.put(reporter[i], mailCount.getOrDefault(reporter[i], 0) + 1);
			}
		}

		// 메일 보내는 횟수 기록
		int[] answer = new int[id_list.length];
		for (int i = 0; i < id_list.length; i++) {
			answer[i] = mailCount.getOrDefault(id_list[i], 0);
		}

		return answer;
	}
}
/*
(0.17ms ~ 200.01ms)

테스트 1 〉통과 (0.34ms, 74.8MB)
테스트 2 〉통과 (0.49ms, 74.4MB)
테스트 3 〉통과 (192.01ms, 167MB)
테스트 4 〉통과 (0.50ms, 76MB)
테스트 5 〉통과 (0.45ms, 72.4MB)
테스트 6 〉통과 (4.35ms, 75MB)
테스트 7 〉통과 (6.75ms, 89.4MB)
테스트 8 〉통과 (8.86ms, 84.8MB)
테스트 9 〉통과 (116.51ms, 136MB)
테스트 10 〉통과 (114.24ms, 144MB)
테스트 11 〉통과 (200.01ms, 176MB)
테스트 12 〉통과 (1.56ms, 77.9MB)
테스트 13 〉통과 (1.49ms, 75.4MB)
테스트 14 〉통과 (104.85ms, 127MB)
테스트 15 〉통과 (108.21ms, 145MB)
테스트 16 〉통과 (1.03ms, 75.5MB)
테스트 17 〉통과 (1.03ms, 77.8MB)
테스트 18 〉통과 (1.93ms, 84.5MB)
테스트 19 〉통과 (2.55ms, 80MB)
테스트 20 〉통과 (97.42ms, 143MB)
테스트 21 〉통과 (114.97ms, 160MB)
테스트 22 〉통과 (0.17ms, 73.8MB)
테스트 23 〉통과 (0.17ms, 70.2MB)
테스트 24 〉통과 (0.20ms, 72.4MB)
 */
