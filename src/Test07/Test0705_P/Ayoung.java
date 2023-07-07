package Test07.Test0705_P;
//프로그래머스 lv.1 이상한 문자 만들기(74%)
public class Ayoung {
    public static void main(String[] args) {
        Ayoung a = new Ayoung();
        System.out.println(solution("Try hello world"));
        System.out.println(solution("Try       HELLO   world"));
        System.out.println(solution("TRY HELLO  "));
    }

    public String solution(String s) {
        StringBuilder input = new StringBuilder(s); // StringBuilder의 함수를 사용하기 위해 변경

        boolean evenNum = true; // 짝수 번째 인덱스일 때 true

        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == ' '){ // 공백일 경우 짝수 인덱스로 세팅하고 더 이상 검사 X
                evenNum = true;
                continue;
            }

            if(evenNum){ // 짝수 번째 인덱스
                input.setCharAt(i,Character.toUpperCase(input.charAt(i))); // 해당 char 대문자로 변경
                evenNum = false; // 플래그 세팅
            }else{ // 홀수 번째 인덱스
                input.setCharAt(i,Character.toLowerCase(input.charAt(i))); // 해당 char 소문자로 변경
                evenNum = true; // 플래그 세팅
            }
        }
        return input.toString(); // String으로 변경해서 리턴
    }
}

/*
테스트 1 〉	통과 (0.08ms, 72.9MB)
테스트 2 〉	통과 (0.07ms, 80.1MB)
테스트 3 〉	통과 (0.07ms, 78.4MB)
테스트 4 〉	통과 (0.14ms, 75.3MB)
테스트 5 〉	통과 (0.09ms, 74.4MB)
테스트 6 〉	통과 (0.05ms, 74.2MB)
테스트 7 〉	통과 (0.08ms, 73.5MB)
테스트 8 〉	통과 (0.15ms, 73.8MB)
테스트 9 〉	통과 (0.08ms, 73MB)
테스트 10 〉	통과 (0.13ms, 73.5MB)
테스트 11 〉	통과 (0.13ms, 75.7MB)
테스트 12 〉	통과 (0.16ms, 79MB)
테스트 13 〉	통과 (0.08ms, 70.9MB)
테스트 14 〉	통과 (0.05ms, 76.3MB)
테스트 15 〉	통과 (0.11ms, 77.5MB)
테스트 16 〉	통과 (0.13ms, 72.6MB)
 */
