package Test08.t0821;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        String new_id1 = "...!@BaT#*..y.abcdefghijklm";
        String new_id2 = "z-+.^.";
        String new_id3 = "=.=";
        String new_id4 = "123_.def";
        String new_id5 = "abcdefghijklmn.p";

        System.out.println(jinhyuk.solution(new_id1));
        System.out.println(jinhyuk.solution(new_id2));
        System.out.println(jinhyuk.solution(new_id3));
        System.out.println(jinhyuk.solution(new_id4));
        System.out.println(jinhyuk.solution(new_id5));
    }

    public String solution(String new_id) {
        String step1 = new_id.toLowerCase(); //소문자로 바꾸기

        String step2 = step1.replaceAll("[^a-z0-9-_.]", ""); //소문자와 숫자, -_.를 제외한 문자 제거하기

        String step3 = step2.replaceAll("[.]{2,}", "."); // . 이 2개 이상이면 . 하나로 바꾸기

        String step4 = step3.replaceAll("^[.]|[.]$", ""); // . 이 처음이나 끝에 있으면 제거하기

        String step5;
        if (step4.isEmpty()) { //빈 문자열이면
            step5 = "a"; // a 넣기
        } else {
            step5 = step4; // 아니면 step4 그대로
        }

        String step6;
        if (step5.length() >= 16) { // 16자 이상이면
            step6 = step5.substring(0, 15); // 15자 까지만 남기기
        } else {
            step6 = step5; // 아니면 step5 그대로
        }

        step6 = step6.replaceAll("[.]$", ""); // .이 끝에 있으면 제거하기

        String step7 = step6;
        while (step7.length() <= 2) { // 2자 이하면
            step7 += step6.charAt(step6.length() - 1); // 마지막 문자를 끝에 붙이기
        }

        return step7; // 결과 반환
    }
}
/*
        {{ Trouble Shooting }}
(1)    if (step4 == null) {
            String step5 = "a";
        } else { String step5 = step4; }
        에서 step5가 선언되어 있지 않아서 오류가 생김

        String step5;
        if (step4 == null) {
            step5 = "a";
        } else { step5 = step4; }
        으로 선언하고 이용하는 방식으로 수정했습니다.
        ---------------------------------------------
(2)     String step6 = step5.length() >= 16 ? step5.substring(0, 16) : step5;
        16전까지로 알고 있었는데 아니여서

        String step6 = step5.length() >= 16 ? step5.substring(0, 15) : step5;
        다음과 같이 수정함
        ---------------------------------------------
(3)     if (step4 == null) 부분이 빈문자가 아니라 null값인지를 보는 거였어서
        isEmpty()를 사용하여 문자열이 비어있는지 확인하는 것으로 수정
        ---------------------------------------------
(4)     step6.replaceAll("[.]$", ""); 부분만 넣었었는데
        step6 = step6.replaceAll("[.]$", ""); 으로 수정

[[ 테스트 통과 시간 0.16~12.54ms ]]
테스트 1 〉	통과 (0.20ms, 73.7MB)
테스트 2 〉	통과 (9.78ms, 76.4MB)
테스트 3 〉	통과 (12.54ms, 79.9MB)
테스트 4 〉	통과 (0.23ms, 73.5MB)
테스트 5 〉	통과 (0.34ms, 72.8MB)
테스트 6 〉	통과 (0.24ms, 73.3MB)
테스트 7 〉	통과 (0.19ms, 72.9MB)
테스트 8 〉	통과 (0.28ms, 75.9MB)
테스트 9 〉	통과 (9.65ms, 75.8MB)
테스트 10 〉	통과 (0.16ms, 72.4MB)
테스트 11 〉	통과 (0.34ms, 73.5MB)
테스트 12 〉	통과 (0.51ms, 76.4MB)
테스트 13 〉	통과 (9.17ms, 74.5MB)
테스트 14 〉	통과 (0.38ms, 80.1MB)
테스트 15 〉	통과 (0.29ms, 70MB)
테스트 16 〉	통과 (0.79ms, 83.9MB)
테스트 17 〉	통과 (1.10ms, 73.2MB)
테스트 18 〉	통과 (2.10ms, 78.1MB)
테스트 19 〉	통과 (2.71ms, 67.8MB)
테스트 20 〉	통과 (2.48ms, 74.2MB)
테스트 21 〉	통과 (2.94ms, 77.4MB)
테스트 22 〉	통과 (11.59ms, 76.6MB)
테스트 23 〉	통과 (12.34ms, 78MB)
테스트 24 〉	통과 (1.62ms, 79.2MB)
테스트 25 〉	통과 (1.35ms, 75.4MB)
테스트 26 〉	통과 (1.16ms, 75MB)
*/