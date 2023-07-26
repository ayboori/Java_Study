package Test07.Test0726_P;

import java.util.HashMap;
import java.util.Map;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        String today = "2021.07.21";
        String[] terms = {"a 3", "b 12"};
        String[] privacies = {"2021.01.01 a", "2020.12.01 b", "2020.10.02 a"};

        System.out.println(jinhyuk.solution(today, terms, privacies));
    }

    public int[] solution(String today, String[] terms, String[] privacies) {

        Map<String, Integer> termsMap = new HashMap<>(); //해쉬amp 생성
        for (int i = 0; i < terms.length; i++) {        // terms 길이만큼 반복
            String term = terms[i];     // terms i번째를 term에 저장
            String[] split = term.split(" "); // term을 공백 기준으로 나눠 split에 저장
            termsMap.put(split[0], Integer.parseInt(split[1])); // split의 0번째를 key로, 1번째를 value로 저장
        }

        String[] todaySplit = today.split("\\."); //오늘 날짜를 .으로 분리
        int todayYear = Integer.parseInt(todaySplit[0]); //연 월 일 나눠주기
        int todayMonth = Integer.parseInt(todaySplit[1]);
        int todayDay = Integer.parseInt(todaySplit[2]);


        int count = 0; //count 선언

        for (int i = 0; i < privacies.length; i++) {  // privacies 길이만큼 반복
            String[] split = privacies[i].split(" "); // privacies i번째공백 기준으로 나눠 split에 저장
            String[] privaciesDate = split[0].split("\\."); // 나눈 스플릿을 .으로 다시 나눠버림
            int year = Integer.parseInt(privaciesDate[0]);
            int month = Integer.parseInt(privaciesDate[1])+termsMap.get(split[1]);;
            int day = Integer.parseInt(privaciesDate[2]);

            year += month / 12; //12가 넘는다면 1을 연도에 더해줌
            month = month % 12 == 0 ? 12 : month % 12; //12월이면 그대로 아니면 나머지를 달로
            year = month == 12 ? year - 1 : year; // 12월일때는 아까 12이상일때랑 같이 더해지니까 -1해줌

            if (year < todayYear || //아니 파기해야하는 문제였네 수정
                    (year == todayYear && month < todayMonth) || // 연도 같고 월이 작으면 패스
                    (year == todayYear && month == todayMonth && day <= todayDay)) { // 연도월이 같고 일이 같거나작으면 패스
                count++;

            }
        }
        int[] answer = new int[count]; //배열크기는 count
        int count2 = 0;
        for (int i = 0; i < privacies.length; i++) {  // privacies를 다시 한번 순회
            String[] split = privacies[i].split(" ");
            String[] privaciesDate = split[0].split("\\.");
            int year = Integer.parseInt(privaciesDate[0]);
            int month = Integer.parseInt(privaciesDate[1]) + termsMap.get(split[1]);
            int day = Integer.parseInt(privaciesDate[2]);

            year += month / 12;
            month = month % 12 == 0 ? 12 : month % 12;
            year = month == 12 ? year - 1 : year;

            if (year < todayYear ||
                    (year == todayYear && month < todayMonth) ||
                    (year == todayYear && month == todayMonth && day <= todayDay)) {
                answer[count2] = i + 1;  // 조건에 맞는 개인정보를 찾으면 answer 배열에 저장
                count2++;
            }
        }

        return answer; //결과 (~˘▾˘)~
    }
}
/*      속도 0.15~7.94ms
        테스트 1 〉	통과 (0.15ms, 74.6MB)
        테스트 2 〉	통과 (0.35ms, 73.9MB)
        테스트 3 〉	통과 (0.21ms, 73.2MB)
        테스트 4 〉	통과 (0.25ms, 76.8MB)
        테스트 5 〉	통과 (0.28ms, 83.9MB)
        테스트 6 〉	통과 (0.64ms, 72.4MB)
        테스트 7 〉	통과 (1.80ms, 68.6MB)
        테스트 8 〉	통과 (1.60ms, 75.6MB)
        테스트 9 〉	통과 (2.26ms, 70.6MB)
        테스트 10 〉	통과 (1.34ms, 83MB)
        테스트 11 〉	통과 (7.94ms, 79.6MB)
        테스트 12 〉	통과 (2.13ms, 78.1MB)
        테스트 13 〉	통과 (1.46ms, 74MB)
        테스트 14 〉	통과 (1.78ms, 87.8MB)
        테스트 15 〉	통과 (1.26ms, 70.2MB)
        테스트 16 〉	통과 (1.88ms, 78.4MB)
        테스트 17 〉	통과 (2.03ms, 86.9MB)
        테스트 18 〉	통과 (2.69ms, 77.7MB)
        테스트 19 〉	통과 (2.27ms, 68.1MB)
        테스트 20 〉	통과 (2.45ms, 70.9MB)
        채점 결과
        정확성: 100.0
        합계: 100.0 / 100.0
        */