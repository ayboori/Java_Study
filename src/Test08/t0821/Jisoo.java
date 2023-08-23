// 신규 아이디 추천
package Test08.t0821;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();

		String t1 = "...!@BaT#*..y.abcdefghijklm"; // "bat.y.abcdefghi"
		String t2 = "z-+.^."; // "z--"
		String t3 = "=.="; // "aaa"
		String t4 = "123_.def"; // "123_.def"
		String t5 = "abcdefghijklmn.p"; // "abcdefghijklmn"

		System.out.println(jisoo.solution(t1));
		System.out.println(jisoo.solution(t2));
		System.out.println(jisoo.solution(t3));
		System.out.println(jisoo.solution(t4));
		System.out.println(jisoo.solution(t5));
	}

	public String solution(String newId) {
		// 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		// 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		newId = newId.toLowerCase().replaceAll("[^a-z0-9\\-_\\.]", "");

		// 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		newId = newId.replaceAll("\\.+", "\\.");

		// 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		StringBuilder sb = new StringBuilder(newId);
		if (newId.equals(".")) {
			sb = new StringBuilder();
		} else {
			if (sb.charAt(0) == '.') {
				sb.deleteCharAt(0);
			}
			if (sb.charAt(sb.length() - 1) == '.') {
				sb.deleteCharAt(sb.length() - 1);
			}
		}

		// 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		if (sb.length() == 0) {
			sb.append('a');
		}

		// 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		if (sb.length() >= 16) {
			sb.delete(15, sb.length());
		}


		// 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		if (sb.charAt(sb.length() - 1) == '.') {
			sb.deleteCharAt(sb.length() - 1);
		}

		// 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		if (sb.length() <= 2) {
			char ch = sb.charAt(sb.length() - 1);
			for (int i = 0; sb.length() <= 2; i++) {
				sb.append(ch);
			}
		}

		return sb.toString();
	}
}

/*
정확성 테스트(0.15ms ~ 3.42ms)

테스트 1 〉통과 (0.15ms, 77.8MB)
테스트 2 〉통과 (0.16ms, 80.1MB)
테스트 3 〉통과 (0.19ms, 77.4MB)
테스트 4 〉통과 (0.22ms, 71.2MB)
테스트 5 〉통과 (0.24ms, 75.5MB)
테스트 6 〉통과 (0.15ms, 73.1MB)
테스트 7 〉통과 (0.16ms, 74.9MB)
테스트 8 〉통과 (0.21ms, 76.1MB)
테스트 9 〉통과 (0.15ms, 78.6MB)
테스트 10 〉통과 (0.15ms, 73.3MB)
테스트 11 〉통과 (0.21ms, 75MB)
테스트 12 〉통과 (0.29ms, 70.9MB)
테스트 13 〉통과 (0.51ms, 74.6MB)
테스트 14 〉통과 (0.23ms, 76.8MB)
테스트 15 〉통과 (0.38ms, 75MB)
테스트 16 〉통과 (0.58ms, 72.4MB)
테스트 17 〉통과 (1.33ms, 76.9MB)
테스트 18 〉통과 (1.84ms, 76MB)
테스트 19 〉통과 (2.21ms, 76.1MB)
테스트 20 〉통과 (2.88ms, 78.1MB)
테스트 21 〉통과 (3.24ms, 71.6MB)
테스트 22 〉통과 (3.42ms, 76.6MB)
테스트 23 〉통과 (1.61ms, 73.6MB)
테스트 24 〉통과 (1.54ms, 66.7MB)
테스트 25 〉통과 (1.81ms, 76.8MB)
테스트 26 〉통과 (1.19ms, 73.2MB)
 */