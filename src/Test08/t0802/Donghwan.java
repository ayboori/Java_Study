package Test08.t0802;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();



        System.out.println(donghwan.solution(new int[]{1, 3, 4, 6})); // "1223330333221"
        System.out.println(donghwan.solution(new int[]{1, 7, 1, 2})); // "111303111"
    }
    public String solution(int[] food) {
        StringBuilder builder = new StringBuilder();

        for (int i=1; i<food.length; i++) { // food배열을 반복문으로 food.length만큼 반복.
            int total = food[i] / 2; // 0번째 인덱스에는 음식 중간에 배치되기때문에 i번째 인덱스에 있는 값 /2를 total에 저장.
            builder.append(String.valueOf(i).repeat(total)); // repeat를 사용해 파라미터로 주어진 값만큼 반복하고 반환값을 valueOf를 사용해 문자열로 변환 후 append(추가)를 해줌.
        }

        String answer = builder + "0"; // 정렬된 builder 중간에 물이 들어가야되기때문에 0 을 추가해준 문자열을 answer에 저장.
        return answer + builder.reverse(); // 정렬해둔 answer에 StringBuilder에 기능 중 하나인 reverse를 사용해 문자열을 거꾸로 뒤집어서 answer에 추가.
    }
}

//        테스트 1 〉	통과 (2.90ms, 85.4MB)
//        테스트 2 〉	통과 (2.20ms, 76.5MB)
//        테스트 3 〉	통과 (3.06ms, 71MB)
//        테스트 4 〉	통과 (2.94ms, 78.8MB)
//        테스트 5 〉	통과 (2.01ms, 72.2MB)
//        테스트 6 〉	통과 (2.75ms, 74.6MB)
//        테스트 7 〉	통과 (3.03ms, 75MB)
//        테스트 8 〉	통과 (2.64ms, 76.7MB)
//        테스트 9 〉	통과 (2.65ms, 75.4MB)
//        테스트 10 〉	통과 (2.05ms, 73.1MB)
//        테스트 11 〉	통과 (1.92ms, 85.9MB)
//        테스트 12 〉	통과 (2.56ms, 75.7MB)
//        테스트 13 〉	통과 (2.45ms, 76.2MB)
//        테스트 14 〉	통과 (2.97ms, 75.7MB)
//        테스트 15 〉	통과 (2.51ms, 71.8MB)
//        테스트 16 〉	통과 (2.41ms, 87MB)
//        테스트 17 〉	통과 (3.48ms, 75.4MB)
//        테스트 18 〉	통과 (4.00ms, 75.2MB)
//        테스트 19 〉	통과 (2.30ms, 77.6MB)
//        테스트 20 〉	통과 (2.30ms, 74.3MB)