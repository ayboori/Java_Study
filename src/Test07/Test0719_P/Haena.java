package Test07.Test0719_P;
// 프로그래머스 lv.1 숫자 문자열과 영단어

public class Haena {
	public int solution(String s) {
		// 답을 만들 StringBuilder 생성
		StringBuilder sb = new StringBuilder();

		// 주어진 문자열을 for 문으로 돌기
		for (int i = 0; i < s.length();) {

			// 숫자가 주어질 경우 숫자를 바로 append 후 i++
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sb.append(s.charAt(i));
				i++;

			// 숫자가 아닐 경우
			} else {
				// i 인덱스 부터 마지막 글자까지 substring 한 글자를
				// 메소드로 보내 글자에 해당하는 숫자와 글자의 길이를 찾는다.
				int[] numAndLength = strToInt(s.substring(i));

				// 글자에 해당하는 숫자 append
				sb.append(numAndLength[0]);
				// 글자의 길이 만큼 i를 미룬다.
				i += numAndLength[1];
			}
		}

		// StringBuilder를 String 전환 후 다시 int로 전환하여 리턴한다.
		return Integer.parseInt(sb.toString());
	}

	public int[] strToInt(String s) {
		int[] numAndLength = new int[2];

		// {글자에 해당하는 숫자, 글자의 길이} 반환
		switch (s.substring(0, 3)) {
			case "zer" : numAndLength = new int[]{0, 4}; break;
			case "one" : numAndLength = new int[]{1, 3}; break;
			case "two" : numAndLength = new int[]{2, 3}; break;
			case "thr" : numAndLength = new int[]{3, 5}; break;
			case "fou" : numAndLength = new int[]{4, 4}; break;
			case "fiv" : numAndLength = new int[]{5, 4}; break;
			case "six" : numAndLength = new int[]{6, 3}; break;
			case "sev" : numAndLength = new int[]{7, 5}; break;
			case "eig" : numAndLength = new int[]{8, 5}; break;
			case "nin" : numAndLength = new int[]{9, 4}; break;
		}
		return numAndLength;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(sol.solution("one4seveneight"));
		System.out.println(sol.solution("23four5six7"));
		System.out.println(sol.solution("2three45sixseven"));
		System.out.println(sol.solution("123"));
	}
}

/*
테스트 1 〉	통과 (0.06ms, 74.4MB)
테스트 2 〉	통과 (0.06ms, 77.5MB)
테스트 3 〉	통과 (0.07ms, 74.6MB)
테스트 4 〉	통과 (0.06ms, 73.6MB)
테스트 5 〉	통과 (0.05ms, 76.3MB)
테스트 6 〉	통과 (0.09ms, 71.7MB)
테스트 7 〉	통과 (0.04ms, 72.8MB)
테스트 8 〉	통과 (0.08ms, 71.8MB)
테스트 9 〉	통과 (0.06ms, 77.4MB)
테스트 10 〉	통과 (0.03ms, 79.6MB)
 */