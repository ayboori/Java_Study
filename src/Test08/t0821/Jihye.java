package Test08.t0821;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();
        String new_id = "...!@BaT#*..y.abcdefghijklm";

        System.out.println(jh.solution(new_id));
    }

    /*
    * 1단계 : new_id를 소문자로 치환
    * 2단계 : new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
    * 3단계 : new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
    * 4단계 : new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거
    * 5단계 : new_id가 빈 문자열이라면, new_id에 "a"를 대입
    * 6단계 : new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
    *        만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
    * 7단계 : new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙인다.
    * */
    public String solution(String new_id) {
        String answer = "";

        answer = new_id.toLowerCase(); // 1단계
        answer = answer.replaceAll("[^a-z0-9-_.]", ""); // 2단계
        answer = answer.replaceAll("[.]+", "."); // 3단계

        // 4단계
        while (answer.startsWith(".") || answer.endsWith(".")) {
            if (answer.length() > 0) {
                if (answer.startsWith("."))
                    answer = answer.substring(1);

                if (answer.endsWith("."))
                    answer = answer.substring(0, answer.length() - 1);
            }

            // 5단계
            if (answer.length() == 0)
                answer = "a";
        }

        // 6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15); // 문자열 길이를 15로 제한
            if (answer.endsWith("."))
                answer = answer.substring(0, answer.length() - 1);
        }


        // 7단계
        String last = answer.substring(answer.length() - 1);
        while (answer.length() < 3) {
            answer += last;
        }

        return answer;
    }

//    테스트 1 〉	통과 (0.18ms, 75.2MB)
//    테스트 2 〉	통과 (1.43ms, 75MB)
//    테스트 3 〉	통과 (2.07ms, 73.5MB)
//    테스트 4 〉	통과 (0.21ms, 71.6MB)
//    테스트 5 〉	통과 (0.29ms, 75.5MB)
//    테스트 6 〉	통과 (0.17ms, 77.6MB)
//    테스트 7 〉	통과 (0.15ms, 74.8MB)
//    테스트 8 〉	통과 (0.19ms, 74.2MB)
//    테스트 9 〉	통과 (1.31ms, 72.6MB)
//    테스트 10 〉	통과 (0.13ms, 74.5MB)
//    테스트 11 〉	통과 (0.19ms, 72.9MB)
//    테스트 12 〉	통과 (0.31ms, 75.5MB)
//    테스트 13 〉	통과 (1.49ms, 70.6MB)
//    테스트 14 〉	통과 (0.20ms, 76.6MB)
//    테스트 15 〉	통과 (0.30ms, 80.4MB)
//    테스트 16 〉	통과 (0.67ms, 84MB)
//    테스트 17 〉	통과 (1.00ms, 70.1MB)
//    테스트 18 〉	통과 (1.73ms, 78.2MB)
//    테스트 19 〉	통과 (2.33ms, 75.7MB)
//    테스트 20 〉	통과 (2.80ms, 75.5MB)
//    테스트 21 〉	통과 (3.09ms, 77.2MB)
//    테스트 22 〉	통과 (3.91ms, 75.1MB)
//    테스트 23 〉	통과 (2.40ms, 74.2MB)
//    테스트 24 〉	통과 (1.52ms, 74MB)
//    테스트 25 〉	통과 (1.41ms, 73.5MB)
//    테스트 26 〉	통과 (1.57ms, 85.2MB)
}
