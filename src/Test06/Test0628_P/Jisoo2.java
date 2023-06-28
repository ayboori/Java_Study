// lv.1 시저 암호
// 1 <= n <= 25
// s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있다.
// 공백은 밀어도 공백
package Test06.Test0628_P;

public class Jisoo2 {
    public static void main(String[] args) {
        Jisoo2 js = new Jisoo2();

        long beforeTime = System.currentTimeMillis();

        String test = RandomStringGenerator.generateRandomString(8000);
        test = js.solution(test,30);

        long afterTime = System.currentTimeMillis();

        System.out.println("걸린 시간 : " + (afterTime - beforeTime));

        System.out.println(js.solution("AB", 1));
        System.out.println(js.solution("z", 1));
        System.out.println(js.solution("a B z", 4));
    }

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(afterPush(s.charAt(i), n));
        }
        return sb.toString();
    }

    public char afterPush(char ch, int n) {
        if (ch == ' ') {
            return ch;
        } else if (65 <= ch && ch <= 90) {
            return (char) ((ch + n - 'A') % 26 + 'A');
        } else {
            return (char) ((ch + n - 'a') % 26 + 'a');
        }
    }
}
// n이 많이 커지면 이 방법을 이용하여 풀 수 있을 것이다.
// 아래는 숫자에 따른 character의 대응이다.
//
//       A              B              C              D              E              F
//
//      65+0           65+1           65+2           65+3           65+4           65+5
//  65 + 26 + 0    65 + 26 + 1    65 + 26 + 2    65 + 26 + 3    65 + 26 + 4    65 + 26 + 5
// 65 + 26*2 + 0  65 + 26*2 + 1  65 + 26*2 + 2  65 + 26*2 + 3  65 + 26*2 + 4  65 + 26*2 + 5
//
// ch + n 에서 65를 빼준 뒤, 26의 나머지를 구한다. 나머지와 65를 다시 더해준다.

/*
정확성 테스트 (0.03ms ~ 1.52ms)
테스트 1 〉통과 (0.05ms, 78.9MB)
테스트 2 〉통과 (0.03ms, 77.1MB)
테스트 3 〉통과 (0.03ms, 74.8MB)
테스트 4 〉통과 (0.03ms, 73.5MB)
테스트 5 〉통과 (0.05ms, 78.9MB)
테스트 6 〉통과 (0.04ms, 74.5MB)
테스트 7 〉통과 (0.03ms, 75.5MB)
테스트 8 〉통과 (0.04ms, 75.6MB)
테스트 9 〉통과 (0.04ms, 77.1MB)
테스트 10 〉통과 (0.03ms, 72.7MB)
테스트 11 〉통과 (0.03ms, 70.4MB)
테스트 12 〉통과 (0.03ms, 75.9MB)
테스트 13 〉통과 (1.52ms, 66.5MB)
 */