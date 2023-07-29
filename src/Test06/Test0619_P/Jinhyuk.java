// lv.2 JadenCase 문자열 만들기
package Test06.Test0619_P;

public class Jinhyuk {
    class Solution {
        public String solution(String s) {
            // StringBuilder은 모든유형의 데이터를 받아들인다.
            // StringBuilder 객체 생성
            StringBuilder answer = new StringBuilder();

            // space 선언 및 초기화
            boolean space = true;

            // for반복문을 사용
            for (int i = 0; i < s.length(); i++) {

                // s의 각 문자들은 cut으로 저장
                char cut = s.charAt(i);
                // cut 이 띄어쓰기인지 아닌지 확인
                if (cut == ' ') {
                    //space 를 트루로 설정
                    space = true;
                    // result 속에 cut 문자들을 넣는다.
                    answer.append(cut);
                    // cut 가 띄어쓰기가 아니라면
                } else {
                    // space 가 트루일 경우
                    if (space) {
                        // answer 에다가 cut 들을 대문자로 변환하여 추가
                        answer.append(Character.toUpperCase(cut));
                        // space 값을 false로 설정
                        space = false;
                    } else {
                        // space 가 false 인 경우
                        // answer 에 cut 을 소문자로 변환하여 추가
                        answer.append(Character.toLowerCase(cut));
                    }
                }
            }
            // answer 속 값들을 문자열로 출력!!!
            return answer.toString();
        }
    }
}
