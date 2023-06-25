// lv.2 JadenCase 문자열 만들기
package Test06.Test0619_P;

public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        String a = "Welcome to my world";
        String b = "This  is an aPPle";
        String c = "3People are sTanDing";

        System.out.println(ay.solution( a ));
        System.out.println(ay.solution( b ));
        System.out.println(ay.solution( c ));
    }
    class Solution {
        public StringBuilder solution(String s) {
            StringBuilder answer = new StringBuilder();
            boolean flag = true; // 공백 이후의 첫번째 문자열인지 확인하는 함수

            for (int i = 0 ; i < s.length(); i++){
                if(flag){ // 앞의 문자열이 공백이었으면
                    answer.append(Character.toUpperCase(s.charAt(i))); // 대문자로
                }else{ // 아니면
                    answer.append(Character.toLowerCase(s.charAt(i))); // 소문자로
                }

                if(s.charAt(i) == ' '){
                    flag = true;
                }else{
                    flag = false;
                } // 현재 문자열 공백인지 아닌지에 따라 다음의 플래그 세팅
            }
            return answer;
        }
    }
}

/*
테스트 1 〉	통과 (0.05ms, 71.6MB)
테스트 2 〉	통과 (0.12ms, 74.5MB)
테스트 3 〉	통과 (0.09ms, 83.8MB)
테스트 4 〉	통과 (0.10ms, 71MB)
테스트 5 〉	통과 (0.13ms, 72.4MB)
테스트 6 〉	통과 (0.23ms, 73MB)
테스트 7 〉	통과 (0.08ms, 75.4MB)
테스트 8 〉	통과 (0.05ms, 72.1MB)
테스트 9 〉	통과 (0.09ms, 74.8MB)
테스트 10 〉	통과 (0.04ms, 74.2MB)
테스트 11 〉	통과 (0.29ms, 74.7MB)
테스트 12 〉	통과 (0.11ms, 75.4MB)
테스트 13 〉	통과 (0.10ms, 77.8MB)
테스트 14 〉	통과 (0.07ms, 71.4MB)
테스트 15 〉	통과 (0.12ms, 84.6MB)
테스트 16 〉	통과 (0.04ms, 72.3MB)
테스트 17 〉	통과 (0.11ms, 77.9MB)
테스트 18 〉	통과 (0.04ms, 71.8MB)
 */