package Test07.Test0705_P;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();
		System.out.println(jisoo.solution("try hello world"));
	}

	public String solution(String s) {
		// s를 소문자로 바꾸고 StringBuilder로 초기화.
		// setCharAt() 메서드를 사용하기 위하여
		StringBuilder sb = new StringBuilder(s.toLowerCase());

		// 단어를 바꾸는 스위치
		boolean flag = false;

		// 한 단어 내의 index
		int index = 0;

		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);

			// 공백이면 flag = false, index = 0으로 초기화.
			if (ch == ' ') {
				flag = false;
				index = 0;
			} else {
				flag = true;
			}

			// flag가 true이면 ( 공백이 아니게 되면 )
			if (flag) {

				// index가 짝수일 경우 대문자로 바꾸기
				if (index % 2 == 0) {
					sb.setCharAt(i, (char) (ch - 32));
				}

				// index 하나씩 ++해주기
				index++;
			}
		}

		// String으로 변환하여 return
		return sb.toString();
	}
}
/*
0.03 ~ 0.15ms

테스트 1 〉통과 (0.04ms, 84.5MB)
테스트 2 〉통과 (0.04ms, 89.5MB)
테스트 3 〉통과 (0.03ms, 72.7MB)
테스트 4 〉통과 (0.11ms, 82.3MB)
테스트 5 〉통과 (0.07ms, 72.6MB)
테스트 6 〉통과 (0.04ms, 77.7MB)
테스트 7 〉통과 (0.05ms, 70.3MB)
테스트 8 〉통과 (0.14ms, 73.8MB)
테스트 9 〉통과 (0.07ms, 77.4MB)
테스트 10 〉통과 (0.15ms, 75.7MB)
테스트 11 〉통과 (0.11ms, 79.2MB)
테스트 12 〉통과 (0.10ms, 83.3MB)
테스트 13 〉통과 (0.06ms, 76.1MB)
테스트 14 〉통과 (0.04ms, 76.3MB)
테스트 15 〉통과 (0.06ms, 74.3MB)
테스트 16 〉통과 (0.10ms, 72.6MB)
 */

