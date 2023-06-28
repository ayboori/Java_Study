// lv.1 시저 암호
// 1 <= n <= 25
// s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있다.
// 공백은 밀어도 공백
package Test06.Test0628_P;

public class Jisoo {
    public static void main(String[] args) {
        Jisoo js = new Jisoo();

        long beforeTime = System.currentTimeMillis();

        System.out.println(js.solution("AB", 1));
        System.out.println(js.solution("z", 1));
        System.out.println(js.solution("a B z", 4));

        long afterTime = System.currentTimeMillis();
        // System.currentTimeMillis() 메서드를 이용하면 걸린 시간을 알아낼 수 있다!
        System.out.println("시간차이 : " + (afterTime - beforeTime));
    }

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            // afterPush로 민 이후 char을 구해서 sb에 append.
            sb.append(afterPush(s.charAt(i), n));
        }
        // StringBuilder를 String으로 변환하여 return
        return sb.toString();
    }

    public char afterPush(char ch, int n) {
        if (ch == ' ') {
            // 공백이면 그대로 return
            return ch;
        } else if (65 <= ch && ch <= 90) {
            // ch가 대문자일 때, ch + n이 90이 넘으면 26을 빼서 return, 그렇지 않으면 민 대로 return
            return ch + n > 90 ? (char) (ch + n - 26) : (char) (ch + n);
        } else {
            // ch가 소문자일 때, ch + n이 122를 넘으면 26을 빼서 return, 그렇지 않으면 민 대로 return
            return ch + n > 122 ? (char) (ch + n - 26) : (char) (ch + n);
        }
    }
}
// n이 25까지일 때는 괜찮지만 그 이상을 넘어버리면 이 방법을 쓰지 못한다. n이 커졌을 때의 방법을 구해보자.

/*
정확성  테스트 (0.03ms ~ 0.77ms)

테스트 1 〉통과 (0.03ms, 71.3MB)
테스트 2 〉통과 (0.04ms, 77.3MB)
테스트 3 〉통과 (0.04ms, 77.7MB)
테스트 4 〉통과 (0.04ms, 72.6MB)
테스트 5 〉통과 (0.07ms, 78.8MB)
테스트 6 〉통과 (0.04ms, 72.8MB)
테스트 7 〉통과 (0.04ms, 76.2MB)
테스트 8 〉통과 (0.04ms, 75.9MB)
테스트 9 〉통과 (0.03ms, 78.7MB)
테스트 10 〉통과 (0.06ms, 72.7MB)
테스트 11 〉통과 (0.03ms, 78.8MB)
테스트 12 〉통과 (0.04ms, 79.7MB)
테스트 13 〉통과 (0.77ms, 69.5MB)
 */