package Test08.t0804;

import java.util.Arrays;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();

        String s1 = "banana";
        String s2 = "foobar";

        System.out.println(Arrays.toString(jh.solution(s1)));
        System.out.println(Arrays.toString(jh.solution(s2)));
    }
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        /*
        * 일단 첫번째 값은 무조건 -1,
        * 해당 index 부터는 index[0] 부터 해당 index-1 까지 하나하나 비교.
        * */

        answer[0] = -1; // index[0]은 무조건 -1

        // 인덱스 1부터 차례로 반복문 돌리기
        for(int i=1; i<s.length(); i++){
            // banana.lastIndexOf(마지막 index에 가까운 해당 i번의 index 위치를 찾는다, 근데 i-1번째(도 포함) 안쪽에서 찾을거야.)
            // i-1로 지정한 이유는 자신은 포함하면 안되니깐.(book.lastIndexOf(s.charAt(1), 1) -> o, o 두개가 포함됨.
            int index = s.lastIndexOf(s.charAt(i), i-1);

            // index는 -1이면 ? 참 : 거짓
            // 자신과 가장 가까운 문자의 거리를 구하는 거니깐 i-index
            answer[i] = (index == -1) ? -1 : i-index;
        }

        return answer;
    }

//    테스트 1 〉	통과 (0.02ms, 77.1MB)
//    테스트 2 〉	통과 (0.06ms, 70.3MB)
//    테스트 3 〉	통과 (0.04ms, 70.7MB)
//    테스트 4 〉	통과 (0.31ms, 80.1MB)
//    테스트 5 〉	통과 (1.70ms, 85.3MB)
//    테스트 6 〉	통과 (0.61ms, 78.8MB)
//    테스트 7 〉	통과 (1.46ms, 77.2MB)
//    테스트 8 〉	통과 (0.58ms, 76.5MB)
//    테스트 9 〉	통과 (2.15ms, 79.6MB)
//    테스트 10 〉	통과 (0.55ms, 75.6MB)
//    테스트 11 〉	통과 (2.44ms, 75.6MB)
//    테스트 12 〉	통과 (0.02ms, 75MB)
//    테스트 13 〉	통과 (0.03ms, 71.4MB)
//    테스트 14 〉	통과 (0.16ms, 73.2MB)
//    테스트 15 〉	통과 (0.02ms, 74.9MB)
//    테스트 16 〉	통과 (0.02ms, 83.9MB)
//    테스트 17 〉	통과 (0.05ms, 67.7MB)
//    테스트 18 〉	통과 (0.30ms, 73.9MB)
//    테스트 19 〉	통과 (0.65ms, 75.4MB)
//    테스트 20 〉	통과 (0.09ms, 71.6MB)
//    테스트 21 〉	통과 (0.02ms, 71.9MB)
//    테스트 22 〉	통과 (0.74ms, 79.1MB)
//    테스트 23 〉	통과 (0.10ms, 76MB)
//    테스트 24 〉	통과 (0.18ms, 77.5MB)
//    테스트 25 〉	통과 (0.20ms, 68.4MB)
//    테스트 26 〉	통과 (0.04ms, 73.9MB)
//    테스트 27 〉	통과 (0.15ms, 71.5MB)
//    테스트 28 〉	통과 (0.14ms, 83.1MB)
//    테스트 29 〉	통과 (0.03ms, 70.5MB)
//    테스트 30 〉	통과 (2.09ms, 77.8MB)

}
