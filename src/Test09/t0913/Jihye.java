package Test09.t0913;

import java.util.*;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(jh.solution(N, stages)));

    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; // 결과를 저장할 배열
        int[] count = new int[N]; // 스테이지에 도달한 플레이어의 수를 저장할 배열
        Map<Integer, Double> fail = new HashMap<>(); // key(스테이지), value(실패율)
        int total = stages.length; // 전체 플레이어수를 저장

        // 각 스테이지에 도달한 플레이어 수를 count배열에 넣기
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1) {
                continue;
            }
            count[stages[i] - 1]++;
        }

        // 실패율 계산하기
        for (int i = 0; i < count.length; i++) {
            // 만약 플레이어 수가 0인 경우 실패율 0
            if (total == 0) {
                fail.put(i, 0d);
                continue;
            }

            fail.put(i, (double) count[i] / (double) total);
            total -= count[i];
        }

        // List에 fail의 키값을 넣어줍니다.
        List<Map.Entry<Integer, Double>> sortedFail = new ArrayList<>(fail.entrySet());

        // 실패율을 기준으로 내림차순 정렬
        Collections.sort(sortedFail, (entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()));

        // List의 정렬된 스테이지를 배열에 담기
        for (int i = 0; i < N; i++) {
            // 0부터 시작해서 +1
            answer[i] = sortedFail.get(i).getKey() + 1;
        }

        return answer;
    }

//    테스트 1 〉	통과 (0.58ms, 79.5MB)
//    테스트 2 〉	통과 (0.62ms, 75.2MB)
//    테스트 3 〉	통과 (3.33ms, 82.1MB)
//    테스트 4 〉	통과 (4.09ms, 89.1MB)
//    테스트 5 〉	통과 (5.94ms, 85.9MB)
//    테스트 6 〉	통과 (0.93ms, 74.5MB)
//    테스트 7 〉	통과 (1.13ms, 74.2MB)
//    테스트 8 〉	통과 (4.63ms, 81.4MB)
//    테스트 9 〉	통과 (9.12ms, 93MB)
//    테스트 10 〉	통과 (4.54ms, 85.6MB)
//    테스트 11 〉	통과 (5.31ms, 90.2MB)
//    테스트 12 〉	통과 (6.97ms, 90.5MB)
//    테스트 13 〉	통과 (5.17ms, 90.6MB)
//    테스트 14 〉	통과 (0.80ms, 73.7MB)
//    테스트 15 〉	통과 (2.56ms, 82MB)
//    테스트 16 〉	통과 (2.58ms, 78MB)
//    테스트 17 〉	통과 (3.04ms, 78MB)
//    테스트 18 〉	통과 (1.69ms, 78MB)
//    테스트 19 〉	통과 (0.88ms, 77MB)
//    테스트 20 〉	통과 (2.00ms, 82.4MB)
//    테스트 21 〉	통과 (3.43ms, 73.2MB)
//    테스트 22 〉	통과 (8.38ms, 92.7MB)
//    테스트 23 〉	통과 (3.99ms, 83.3MB)
//    테스트 24 〉	통과 (4.07ms, 91MB)
//    테스트 25 〉	통과 (0.77ms, 69.6MB)
//    테스트 26 〉	통과 (0.50ms, 76MB)
//    테스트 27 〉	통과 (0.49ms, 78.1MB)
}

