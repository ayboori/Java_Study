// 숫자 문자열과 영단어
package Test07.Test0719_P;

import java.util.stream.LongStream;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();

		System.out.println(jisoo.solution("one4seveneight"));
		System.out.println(jisoo.solution("23four5six7"));
		System.out.println(jisoo.solution("2three45sixseven"));
		System.out.println(jisoo.solution("123"));
	}

	public int solution(String s) {
		s = s.replaceAll("zero", "0");
		s = s.replaceAll("one", "1");
		s = s.replaceAll("two", "2");
		s = s.replaceAll("three", "3");
		s = s.replaceAll("four", "4");
		s = s.replaceAll("five", "5");
		s = s.replaceAll("six", "6");
		s = s.replaceAll("seven", "7");
		s = s.replaceAll("eight", "8");
		s = s.replaceAll("nine", "9");

		return Integer.parseInt(s);
	}

}

// 다른 사람의 풀이 중 "zero" ~ "nine"을 배열에 넣고 replaceAll에 배열값과 index를 넣어
// for문으로 돌려서 더 깔끔하게 코드를 짜는 방법도 있었다.

/*
정확성  테스트 ( 0.30ms ~ 0.62ms )

테스트 1 〉통과 (0.49ms, 73.6MB)
테스트 2 〉통과 (0.41ms, 72.2MB)
테스트 3 〉통과 (0.55ms, 81.6MB)
테스트 4 〉통과 (0.30ms, 71.1MB)
테스트 5 〉통과 (0.55ms, 72.8MB)
테스트 6 〉통과 (0.39ms, 66.5MB)
테스트 7 〉통과 (0.55ms, 78MB)
테스트 8 〉통과 (0.46ms, 70.1MB)
테스트 9 〉통과 (0.62ms, 72.4MB)
테스트 10 〉통과 (0.32ms, 74.7MB)
 */
