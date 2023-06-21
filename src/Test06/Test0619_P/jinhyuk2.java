package Test06.Test0619_P;

import java.util.ArrayList;

public class jinhyuk2 {

    public class Jinhyuk {
        class Solution {
            public String solution(String s) {

                // asnwer 초기화
                String answer = "";

                // 문자열을 띄어쓰기로 분리(공백문자 연속해서 나올 수 없음)
                String[] splitWord = s.split("\\s");

                // result라는 리스트 생성
                ArrayList<String> result = new ArrayList<>();

                // 첫글자와 나머지글자들을 나눔
                for (int i = 0; i < splitWord.length; i++) {
                    String firstWord = splitWord[i].substring(0, 1);
                    String restWord = splitWord[i].substring(1);

                    // 첫 글자를 대문자로 변환
                    firstWord = firstWord.toUpperCase();

                    // 나머지를 소문자로 변환
                    restWord = restWord.toLowerCase();

                    // result 변환후 결과값을 합쳐서 다음
                    result.add(firstWord + restWord);
                }
                // answer에 result 리스트 속 값을 담음
                answer = String.join(" ", result);

                // 정답을 출력
                return answer;
            }
        }
    }
}
