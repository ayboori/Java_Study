package Test09.t0913;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        int N = 7;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(donghwan.solution(N, stages)));
    }

    public int[] solution(int N, int[] stages) {
        int[] players = new int[N+2]; // 각 스테이지에 머물러 있는 플레이어 수를 저장할 배열.
        int[] reach = new int[N+2]; // 각 스테이지에 도달한 플레이어 수를 저장할 배열.
        double[] failureRates = new double[N]; // 실패율을 저장할 배열.

        for (int stage : stages) { // 향샹된 반복문 사용.
            players[stage]++; // 각 스테이지에 머물러 있는 플레이어 수 계산.
        }

        int totalPlayers = stages.length; // 전체 플레이어 수 저장.

        for (int i = 1; i <= N; i++) { // failureRates 배열에 접근하기 위한 반복문.
            if (totalPlayers == 0) { // 전체 플러이어 수가 없을때 조건문.
                failureRates[i-1] = 0; // 전체 플레이어가 없으면 실패율은 0.
            } else {
                failureRates[i-1] = (double) players[i] / totalPlayers; // 실패율 계산.
                totalPlayers -= players[i]; // 해당 스테이지에 도달한 플레이어 수만큼 전체 플레이어 수에서 빼줌.
            }
            reach[i+1] = players[i] + reach[i]; // 각 스테이지까지 도달한 플레이어 수 계산.
        }

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) { // 배열에 접근하기위한 반복문.
            int maxIndex = 0; // maxIndex 값을 받기위한 변수 선언.
            for (int j = 1; j < N; j++) {
                if (failureRates[j] > failureRates[maxIndex]) {
                    maxIndex = j; // 실패율이 더 큰 경우 해당 인덱스로 업데이트.
                }
            }
            answer[i] = maxIndex + 1; // 최대 실패율의 스테이지를 정답 배열에 추가.
            failureRates[maxIndex] = -1; // 최대 실패율을 -1로 설정하여 다음 최대값을 찾을 수 있도록 함.
        }

        return answer; // answer 반환.
    }
}

//        테스트 1 〉	통과 (0.04ms, 74.1MB)
//        테스트 2 〉	통과 (0.04ms, 75.2MB)
//        테스트 3 〉	통과 (3.00ms, 74.9MB)
//        테스트 4 〉	통과 (3.11ms, 80.9MB)
//        테스트 5 〉	통과 (4.84ms, 85MB)
//        테스트 6 〉	통과 (0.23ms, 71.6MB)
//        테스트 7 〉	통과 (0.46ms, 74.3MB)
//        테스트 8 〉	통과 (2.24ms, 91.4MB)
//        테스트 9 〉	통과 (4.45ms, 89.5MB)
//        테스트 10 〉	통과 (1.93ms, 82.5MB)
//        테스트 11 〉	통과 (2.70ms, 80.5MB)
//        테스트 12 〉	통과 (3.71ms, 83.6MB)
//        테스트 13 〉	통과 (2.66ms, 109MB)
//        테스트 14 〉	통과 (0.03ms, 76.5MB)
//        테스트 15 〉	통과 (1.38ms, 75.1MB)
//        테스트 16 〉	통과 (0.61ms, 88.3MB)
//        테스트 17 〉	통과 (1.36ms, 75.7MB)
//        테스트 18 〉	통과 (0.67ms, 82.7MB)
//        테스트 19 〉	통과 (0.26ms, 76MB)
//        테스트 20 〉	통과 (1.11ms, 82.2MB)
//        테스트 21 〉	통과 (1.83ms, 90.9MB)
//        테스트 22 〉	통과 (5.54ms, 88.3MB)
//        테스트 23 〉	통과 (2.79ms, 86.4MB)
//        테스트 24 〉	통과 (2.68ms, 82.6MB)
//        테스트 25 〉	통과 (0.02ms, 77.5MB)
//        테스트 26 〉	통과 (0.02ms, 78.6MB)
//        테스트 27 〉	통과 (0.02ms, 78.4MB)
