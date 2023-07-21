// 크기가 작은 부분 문자열

package Test07.Test0721_P;

// 틀렸던 풀이
public class Jisoo_wrong {
	public static void main(String[] args) {
		Jisoo_wrong js = new Jisoo_wrong();

		System.out.println(js.solution("3141592", "271"));
		System.out.println(js.solution("500220839878", "7"));
		System.out.println(js.solution("10203", "15"));
		System.out.println(js.solution("10203","10203"));	// p의 길이 = t의 길이 일때 통과
		System.out.println(js.solution("2","1"));	// p의 길이 = t의 길이 = 1일때 통과
		System.out.println(js.solution("1","2"));	// p의 길이 = t의 길이 = 1일때 통과
		System.out.println(Integer.MAX_VALUE);

	}

	public int solution(String t, String p) {
		int answer = 0;
		int tLen = t.length();
		int pLen = p.length();
		int pInt = Integer.parseInt(p);
		for (int i = 0; i <= tLen - pLen; i++) {
			if (Integer.parseInt(t.substring(i, i + pLen)) <= pInt) {
				answer++;
			}
		}
		return answer;
	}
}

/*
런타임 에러!!! substring에서 뭔가 잘못됐나..?
p의 길이는 18개까지
int는 최대 2_147_483_647 열자리!
int라서 안되나 봄..?
Long.parseLong(str)을 이용해서 다시 풀어보자.

 */