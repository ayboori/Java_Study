// 이상한 문자 만들기
package Test07.Test0705_P;

import java.util.Random;

/*
문자열을 수정할 때, char[] 와, StringBuilder 중 어떤 것이 더 빠를까? 테스트 해보기

 * usingCharArray() 메서드
 toCharArray() 를 이용하여 char[] 상태에서 수정하고, String.valueof(chars)로 return

 * usingStringBuilder() 메서드
 StirngBuilder 생성자에 수정시킬 문자열을 넣어, setCharAt() 메서드를 이용하고
 StringBuilder.toString()로 return

 StringBuilder가 더 빠르긴 했다..!
 하지만 조건이 추가된다거나 하면 두 메서드 다 비슷한 시간이 걸렸다.
 취향대로 쓰면 될 것 같다!
 */
public class Jisoo_Test {
	public static void main(String[] args) {
		String str = solution(1_000_000_000);

		long before1 = System.currentTimeMillis();
		usingCharArray(str);
		long after1 = System.currentTimeMillis();
		System.out.println("char[] 이용하여 String 수정 : " + (after1 - before1));

		long before2 = System.currentTimeMillis();
		usingStringBuilder(str);
		long after2 = System.currentTimeMillis();
		System.out.println("StringBuilder 이용하여 String 수정 : " + (after2 - before2));

	}

	public static String usingCharArray(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char) (chars[i] + 1);
		}
		return String.valueOf(chars);
	}

	public static String usingStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			sb.setCharAt(i, (char) (sb.charAt(i) + 1));
		}
		return sb.toString();
	}

	// 소문자, 대문자로 이루어진 문자열을 랜덤으로 length길이만큼 생성
	public static String solution(int length) {
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int randomNumber = random.nextInt(2); // 0 또는 1을 랜덤으로 생성
			char randomChar;
			if (randomNumber == 0) {
				// 소문자 알파벳 (a ~ z)
				randomChar = (char) (random.nextInt(26) + 'a');
			} else {
				// 대문자 알파벳 (A ~ Z)
				randomChar = (char) (random.nextInt(26) + 'A');
			}
			sb.append(randomChar);
		}

		return sb.toString();
	}

}
