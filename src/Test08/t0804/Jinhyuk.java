package Test08.t0804;

import java.util.Arrays;
import java.util.HashSet;

public class Jinhyuk {

    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        String s1 = "banana";
        String s2 = "foobar";

        System.out.println(Arrays.toString(jinhyuk.solution(s1)));
        System.out.println(Arrays.toString(jinhyuk.solution(s2)));
    }

    public int[] solution(String s) {

        int answer[] = new int[s.length()]; //정답 배열의 길이는 s의 길이과 같다.
        String splitS[] = s.split(""); //한글자씩 분리

        for (int i = 0; i < splitS.length; i++) { // 이중 포문을 사용

            boolean overlap = false; // 중복 여부를 확인하는 overlap 설정

            for (int j = i; j >= 0; j--) { // i부터 0까지
                if ((i != j) && (splitS[i].equals(splitS[j]))) { //같은 글자가 아닌데 같을 경우
                    answer[i] = i - j; // 중복된 경우 두 글자 사이의 거리를 저장
                    overlap = true; // 중복될시 true로 바꾸고
                    break; // 더 먼거 비교하기 전에 나가준다.
                }
            }
            if (!overlap) { // 중복이 아닌 경우
                answer[i] = -1; // -1을 저장한다.
            }
        }
        return answer; //결과 반환
    }
}

/* 속도 0.12~14.02ms
테스트 1 〉	통과 (0.13ms, 76.2MB)
테스트 2 〉	통과 (0.34ms, 75.5MB)
테스트 3 〉	통과 (0.35ms, 73.7MB)
테스트 4 〉	통과 (2.19ms, 81MB)
테스트 5 〉	통과 (12.12ms, 82.3MB)
테스트 6 〉	통과 (5.91ms, 76.7MB)
테스트 7 〉	통과 (11.83ms, 82.6MB)
테스트 8 〉	통과 (8.52ms, 92.5MB)
테스트 9 〉	통과 (14.02ms, 89.8MB)
테스트 10 〉	통과 (3.80ms, 74.6MB)
테스트 11 〉	통과 (13.48ms, 91MB)
테스트 12 〉	통과 (0.12ms, 74.5MB)
테스트 13 〉	통과 (0.17ms, 77.4MB)
테스트 14 〉	통과 (1.57ms, 74.6MB)
테스트 15 〉	통과 (0.17ms, 74MB)
테스트 16 〉	통과 (0.17ms, 76.7MB)
테스트 17 〉	통과 (0.36ms, 79.6MB)
테스트 18 〉	통과 (3.59ms, 83.6MB)
테스트 19 〉	통과 (3.76ms, 81.2MB)
테스트 20 〉	통과 (1.20ms, 77.4MB)
테스트 21 〉	통과 (0.25ms, 73.2MB)
테스트 22 〉	통과 (7.29ms, 84.6MB)
테스트 23 〉	통과 (1.52ms, 77.7MB)
테스트 24 〉	통과 (1.70ms, 72.6MB)
테스트 25 〉	통과 (2.78ms, 71.6MB)
테스트 26 〉	통과 (0.74ms, 87MB)
테스트 27 〉	통과 (2.63ms, 81MB)
테스트 28 〉	통과 (1.69ms, 67.1MB)
테스트 29 〉	통과 (0.13ms, 78.6MB)
테스트 30 〉	통과 (13.98ms, 81MB)
 */