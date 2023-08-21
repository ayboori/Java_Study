package Test08.t0818;


import java.util.HashSet;

// 프로그래머스 lv.1 폰켓몬
public class Haena2 {
    public int solution(int[] nums) {
        // <폰켓몬의 종류>를 담을 HashSet을 선언한다.
        HashSet<Integer> set = new HashSet<>();

        // 주어진 nums 배열을 돌며 <폰켓몬의 종류>를 HashSet에 넣는다.
        // 단, 최대 가져갈 수 있는 개수에 도달할 경우 for문을 탈출한다.
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size() == nums.length / 2) {
                break;
            }
        }

        // set의 크기를 return 한다.
        return set.size();
    }


    public static void main(String[] args) {
        Haena2 sol = new Haena2();
        System.out.println(sol.solution(new int[]{3, 1, 2, 3}));
        System.out.println(sol.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(sol.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }
}

/* 테스트 통과 시간 : 0.04ms ~ 3.25ms
테스트 1 〉	통과 (0.05ms, 72MB)
테스트 2 〉	통과 (0.07ms, 74.1MB)
테스트 3 〉	통과 (0.04ms, 78.3MB)
테스트 4 〉	통과 (0.09ms, 77.8MB)
테스트 5 〉	통과 (0.05ms, 76.5MB)
테스트 6 〉	통과 (0.12ms, 79.8MB)
테스트 7 〉	통과 (0.24ms, 68.4MB)
테스트 8 〉	통과 (0.30ms, 75.3MB)
테스트 9 〉	통과 (0.36ms, 71.4MB)
테스트 10 〉	통과 (0.37ms, 74.4MB)
테스트 11 〉	통과 (0.28ms, 79MB)
테스트 12 〉	통과 (0.36ms, 80.2MB)
테스트 13 〉	통과 (0.62ms, 72.9MB)
테스트 14 〉	통과 (0.96ms, 77.3MB)
테스트 15 〉	통과 (0.73ms, 94.3MB)
테스트 16 〉	통과 (3.06ms, 79.9MB)
테스트 17 〉	통과 (2.81ms, 75.3MB)
테스트 18 〉	통과 (3.25ms, 83.8MB)
테스트 19 〉	통과 (2.71ms, 81.4MB)
테스트 20 〉	통과 (2.42ms, 81.3MB)
 */