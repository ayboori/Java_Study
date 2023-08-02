// 문자열 내 마음대로 정렬하기
package Test07.Test0728_P;

import java.util.Arrays;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        String[] strings1 = {"sun", "bed", "car"};
        String[] strings2 = {"abce", "abcd", "cdx"};

        int n1 = 1;
        int n2 = 2;

        System.out.println(Arrays.toString(jinhyuk.solution(strings1, n1)));
        System.out.println(Arrays.toString(jinhyuk.solution(strings2, n2)));
    }

    private boolean big(String s1, String s2, int n) { // 두 문자열을 비교하는 메소드 big
        if (s1.charAt(n) > s2.charAt(n)) { // n번째 문자를 비교하고
            return true; // s1이 크면 true를 리턴
        } else if (s1.charAt(n) == s2.charAt(n)) { // n번째 문자가 같으면
            return s1.compareTo(s2) > 0; // compareTo 메소드를 이용하여 두 문자열을 비교
        } else { // n번째 문자가 작으면 즉 s2가 크면
            return false; // false를 리턴해준다.
        }
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = strings .clone(); // answer에 strings를 복사(매우 유용할듯)

        for (int i = 0; i < answer.length; i++) { // 버블정렬 방식을 사용
            for (int j = 0; j < answer.length - i - 1; j++) { // strings의 길이만큼 반복
                // big 메소드를 이용하여 두 문자열 비교
                if (big(answer[j], answer[j + 1], n)) { // big 메소드가 true를 리턴하면
                    // 두 문자열의 위치를 바꿈 (저번에 했던거)
                    String str  = answer[j]; // temp에 answer[j]를 저장
                    answer[j] = answer[j + 1]; // answer[j]에 answer[j + 1]을 저장
                    answer[j + 1] = str; // answer[j + 1]에 temp를 저장
                }
            }
        }
        return answer; // 정렬된 배열을 리턴
    }

}

/*
테스트 1 〉	통과 (0.02ms, 81.3MB)
테스트 2 〉	통과 (0.04ms, 73.4MB)
테스트 3 〉	통과 (0.12ms, 73MB)
테스트 4 〉	통과 (0.12ms, 77.7MB)
테스트 5 〉	통과 (0.02ms, 66.1MB)
테스트 6 〉	통과 (0.34ms, 71MB)
테스트 7 〉	통과 (0.04ms, 81.7MB)
테스트 8 〉	통과 (0.05ms, 72.8MB)
테스트 9 〉	통과 (0.04ms, 68.5MB)
테스트 10 〉	통과 (0.30ms, 75.2MB)
테스트 11 〉	통과 (0.04ms, 74.6MB)
테스트 12 〉	통과 (0.53ms, 66.1MB)
*/
