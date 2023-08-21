package Test08.t0818;

import java.util.HashSet;

public class Ayoung {

    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution(new int[]{3, 1, 2, 3}));
        System.out.println(ay.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(ay.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    public int solution(int[] nums) {
        int limit = nums.length / 2; // 최대로 가질 수 있는 포켓몬의 수

        // nums 내에 중복을 제외한 종류가 몇 개인지 센다
        // Set은 중복을 제거하는 타입이므로 활용!
        HashSet<Integer> PoketType = new HashSet<>();

        for (int num : nums) {
            PoketType.add(num);
        }

        int type = PoketType.size(); // 포켓몬의 총 종

        // 총 종류의 갯수가 limit보다 작으면 종류의 수 return, 아닐 경우 limit을 리턴
        return type < limit ? type : limit;
    }
}
/*
0.04 ~ 6.57ms
| 테스트 1 〉 | 통과 (0.04ms, 73.3MB) |
| 테스트 2 〉 | 통과 (0.12ms, 78.3MB) |
| 테스트 3 〉 | 통과 (0.04ms, 65.5MB) |
| 테스트 4 〉 | 통과 (0.06ms, 66.4MB) |
| 테스트 5 〉 | 통과 (0.05ms, 71.9MB) |
| 테스트 6 〉 | 통과 (0.16ms, 77.6MB) |
| 테스트 7 〉 | 통과 (0.19ms, 75.8MB) |
| 테스트 8 〉 | 통과 (0.28ms, 75.1MB) |
| 테스트 9 〉 | 통과 (0.38ms, 73.3MB) |
| 테스트 10 〉 | 통과 (0.40ms, 76.1MB) |
| 테스트 11 〉 | 통과 (0.27ms, 74.6MB) |
| 테스트 12 〉 | 통과 (0.37ms, 72.1MB) |
| 테스트 13 〉 | 통과 (1.07ms, 82.2MB) |
| 테스트 14 〉 | 통과 (0.80ms, 74.5MB) |
| 테스트 15 〉 | 통과 (0.88ms, 79.7MB) |
| 테스트 16 〉 | 통과 (3.47ms, 83.3MB) |
| 테스트 17 〉 | 통과 (3.84ms, 83.7MB) |
| 테스트 18 〉 | 통과 (7.15ms, 81.6MB) |
| 테스트 19 〉 | 통과 (6.57ms, 69.7MB) |
| 테스트 20 〉 | 통과 (1.52ms, 88MB) |
 */