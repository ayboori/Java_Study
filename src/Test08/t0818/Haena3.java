package Test08.t0818;


import java.util.Arrays;

// 프로그래머스 lv.1 폰켓몬
public class Haena3 {
    public int solution(int[] nums) {
        // stream -> distinct를 사용해 중복값을 제거한 후 개수를 센다.
        // 중복값 제거한 개수와 최대값 중 작은 수를 return 한다.
        return (int) Math.min(Arrays.stream(nums).distinct().count(),nums.length / 2);
    }


    public static void main(String[] args) {
        Haena3 sol = new Haena3();
        System.out.println(sol.solution(new int[]{3, 1, 2, 3}));
        System.out.println(sol.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(sol.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }
}

/* 테스트 통과 시간 : 2.16ms ~ 10.83ms
테스트 1 〉	통과 (2.34ms, 74.5MB)
테스트 2 〉	통과 (7.10ms, 70.4MB)
테스트 3 〉	통과 (2.23ms, 79MB)
테스트 4 〉	통과 (3.10ms, 76.5MB)
테스트 5 〉	통과 (2.17ms, 82.2MB)
테스트 6 〉	통과 (1.97ms, 76.6MB)
테스트 7 〉	통과 (1.87ms, 79.4MB)
테스트 8 〉	통과 (2.35ms, 87.4MB)
테스트 9 〉	통과 (3.66ms, 73.8MB)
테스트 10 〉	통과 (2.38ms, 69MB)
테스트 11 〉	통과 (1.70ms, 76.5MB)
테스트 12 〉	통과 (2.16ms, 72.7MB)
테스트 13 〉	통과 (3.20ms, 77.9MB)
테스트 14 〉	통과 (2.30ms, 80.1MB)
테스트 15 〉	통과 (2.20ms, 78.4MB)
테스트 16 〉	통과 (6.77ms, 86MB)
테스트 17 〉	통과 (9.94ms, 78.5MB)
테스트 18 〉	통과 (7.98ms, 86.2MB)
테스트 19 〉	통과 (10.83ms, 87MB)
테스트 20 〉	통과 (7.17ms, 78.6MB)
 */