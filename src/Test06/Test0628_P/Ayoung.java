// lv.1 시저 암호
package Test06.Test0628_P;

import java.util.Arrays;

public class Ayoung {
    public StringBuilder solution(String s, int n) {
        char [] charArray = s.toCharArray(); // String을 char 배열로 변경
        StringBuilder answer = new StringBuilder();

        for (char c : charArray){
            int ascii = (int) c;
            if(c != ' '){ // 공백이 아닐 때만 밀기
                ascii += n;
            }

            if(c <= 90 && ascii > 90 || // 대문자이면서 밀면 범위 벗어남
                    c >=97 && c <= 122 && ascii > 122){ // 소문자이면서 밀면 범위 벗어남
                ascii -= 26; // 초기값으로
            }
            answer.append((char)ascii); // 연산한 값을 부착
        }
        return answer;
    }

    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution("AB",1));
        System.out.println(ay.solution("z",1));
        System.out.println(ay.solution("A f Z",3));
    }
}

/*
테스트 1 〉	통과 (0.04ms, 68.5MB)
테스트 2 〉	통과 (0.04ms, 76.6MB)
테스트 3 〉	통과 (0.05ms, 82.5MB)
테스트 4 〉	통과 (0.07ms, 69MB)
테스트 5 〉	통과 (0.05ms, 71.8MB)
테스트 6 〉	통과 (0.03ms, 74.4MB)
테스트 7 〉	통과 (0.03ms, 74.7MB)
테스트 8 〉	통과 (0.04ms, 76.9MB)
테스트 9 〉	통과 (0.04ms, 65.9MB)
테스트 10 〉	통과 (0.15ms, 78.2MB)
테스트 11 〉	통과 (0.06ms, 79.1MB)
테스트 12 〉	통과 (0.07ms, 76.8MB)
테스트 13 〉	통과 (1.03ms, 73.2MB)
 */