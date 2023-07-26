// 개인정보 수집 유효기간
package Test07.Test0726_P;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo js = new Jisoo();

		String t1_1 = "2022.05.19";
		String[] t1_2 = {"A 6", "B 12", "C 3"};
		String[] t1_3 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

		String t2_1 = "2020.01.01";
		String[] t2_2 = {"Z 3", "D 5"};
		String[] t2_3 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

		String t3_1 = "2020.12.17";
		String[] t3_2 = {"A 12"};
		String[] t3_3 = {"2019.01.01 A", "2019.12.17 A"};

		System.out.println(Arrays.toString(js.solution(t1_1, t1_2, t1_3)));
		System.out.println(Arrays.toString(js.solution(t2_1, t2_2, t2_3)));
		System.out.println(Arrays.toString(js.solution(t3_1, t3_2, t3_3)));

	}

	public int[] solution(String today, String[] terms, String[] privacies) {
		List<Integer> answerList = new ArrayList<>();

		int todayYear = Integer.parseInt(today.substring(0, 4));
		int todayMonth = Integer.parseInt(today.substring(5, 7));
		int todayDay = Integer.parseInt(today.substring(8));

		// 약관에 따른 유효기간 미리 Map에 저장
		Map<Character, Integer> termsMap = new HashMap<>();
		for (int i = 0; i < terms.length; i++) {
			termsMap.put(terms[i].charAt(0), Integer.parseInt(terms[i].substring(2)));
		}

		// 유효기간 >= 오늘이면 보관, 유효기간 < 오늘이면 파기
		for (int i = 0; i < privacies.length; i++) {
			//privacies 날짜 int로 파싱하기
			int year = Integer.parseInt(privacies[i].substring(0, 4));
			int month = Integer.parseInt(privacies[i].substring(5, 7));
			int day = Integer.parseInt(privacies[i].substring(8, 10));

			// 유효기간 구하기
			month += termsMap.get(privacies[i].charAt(11));

			if (day == 1) {
				day = 28;
				month -= 1;
			} else {
				day -= 1;
			}
			if (month > 12) {
				if (month % 12 == 0) {
					year += month / 12 - 1;
					month = 12;
				} else {
					year += month / 12;
					month = month % 12;
				}
			}
			// 오늘과 유효기간 비교
			// 유효기간보다 현재가 크면 add하고 다음 for문
			// 적으면 바로 다음 for문 / 같으면 다음 비교인자에서 비교
			if (year < todayYear) {
				answerList.add(i + 1);
				continue;
			} else if (year > todayYear) {
				continue;
			}
			if (month < todayMonth) {
				answerList.add(i + 1);
				continue;
			} else if (month > todayMonth) {
				continue;
			}
			if (day < todayDay) {
				answerList.add(i + 1);
			}
		}

		// list 배열로 변환하여 return
		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
/*
정확성 테스트 ( 0.12ms ~ 0.91ms )

테스트 1 〉통과 (0.12ms, 74.3MB)
테스트 2 〉통과 (0.20ms, 77MB)
테스트 3 〉통과 (0.15ms, 76.3MB)
테스트 4 〉통과 (0.18ms, 76.7MB)
테스트 5 〉통과 (0.16ms, 77MB)
테스트 6 〉통과 (0.24ms, 74.9MB)
테스트 7 〉통과 (0.19ms, 83.1MB)
테스트 8 〉통과 (0.19ms, 72.2MB)
테스트 9 〉통과 (0.52ms, 80.5MB)
테스트 10 〉통과 (0.60ms, 75.3MB)
테스트 11 〉통과 (0.32ms, 73.8MB)
테스트 12 〉통과 (0.61ms, 79.3MB)
테스트 13 〉통과 (0.63ms, 76.7MB)
테스트 14 〉통과 (0.55ms, 89.2MB)
테스트 15 〉통과 (0.44ms, 72.9MB)
테스트 16 〉통과 (0.79ms, 72.2MB)
테스트 17 〉통과 (0.47ms, 75.3MB)
테스트 18 〉통과 (0.74ms, 71.9MB)
테스트 19 〉통과 (0.65ms, 86.8MB)
테스트 20 〉통과 (0.91ms, 86.4MB)
 */