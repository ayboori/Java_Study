// 문자열 내 마음대로 정렬하기
package Test07.Test0728_P;

import java.util.*;

public class Haena {
	public String[] solution(String[] strings, int n) {
		// 주어진 String 배열을 사전순으로 정렬하기
		Arrays.sort(strings);
		// 정렬된 배열을 LinkedHashMap에 <Key: string, Value: targetChar>로 담기
		Map<String, Character> stringChar = new LinkedHashMap<>();
		for (int i = 0; i < strings.length; i++) {
			stringChar.put(strings[i], strings[i].charAt(n));
		}
		// value: targetChar를 ArrayList에 담아 정렬하기
		List<Character> valueList = new ArrayList<>(stringChar.values());
		Collections.sort(valueList);
		// 정렬된 value: targetChar를 토대로 Key: string울 가져와 answer에 담아 return 하기
		// value: targetChar 값이 중복되는 경우를 고려해 이미 answer에 담긴 Key는 삭제하기
		// 처음에 사전순으로 LinkedHashMap에 담겼으므로 targetChar가 중복되도 사전순으로 먼저 answer에 담기게 됨
		String[] answer = new String[strings.length];
		for (int i = 0; i < strings.length; i++) {
			answer[i] = getKeyByValue(stringChar, valueList.get(i));
			stringChar.remove(answer[i]);
		}
		return answer;
	}

	// Map에서 Value를 통해 Key를 가져오는 메소드
	public static String getKeyByValue(Map<String, Character> map, Character value) {
		for (Map.Entry<String, Character> entry : map.entrySet()) {
			if (entry.getValue().equals(value)) {
				return entry.getKey();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(Arrays.toString(sol.solution(new String[]{"sun", "bed", "car"}, 1)));
		System.out.println(Arrays.toString(sol.solution(new String[]{"abce", "abcd", "cdx"}, 2)));
	}
}

/*
테스트 1 〉	통과 (0.61ms, 77.6MB)
테스트 2 〉	통과 (0.57ms, 81MB)
테스트 3 〉	통과 (1.00ms, 75.6MB)
테스트 4 〉	통과 (0.85ms, 71.1MB)
테스트 5 〉	통과 (0.57ms, 70.8MB)
테스트 6 〉	통과 (1.13ms, 79.5MB)
테스트 7 〉	통과 (0.71ms, 75.4MB)
테스트 8 〉	통과 (0.77ms, 77.3MB)
테스트 9 〉	통과 (0.70ms, 78.5MB)
테스트 10 〉	통과 (1.11ms, 71.6MB)
테스트 11 〉	통과 (0.46ms, 73.3MB)
테스트 12 〉	통과 (1.61ms, 72.7MB)
 */
