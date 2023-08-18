package Test08.t0816;


import java.util.HashMap;

// 프로그래머스 lv.1 폰켓몬
public class Haena {
    public int solution(int[] nums) {
        // <폰켓몬의 종류 - 개수>를 담을 HashMap을 선언한다.
        HashMap<Integer, Integer> map = new HashMap<>();

        // 주어진 nums 배열을 돌며 <폰켓몬의 종류 - 개수>를 HashMap에 넣는다.
        for (int i = 0; i < nums.length; i++) {
            Integer key = nums[i];
            // 이전 값이 없는 경우 NullPointerException 방지를 위해 getOrDefault 사용해 이전 값을 불러온다.
            Integer value = map.getOrDefault(key, 0);
            // 이전 값의 +1씩하여 폰켓몬 종류별 개수를 센다.
            map.put(key, value++);
        }

        // 폰켓몬의 종류 개수와 최대 가져갈 수 있는 개수를 비교해 더 작은 값을 return 한다.
        return Math.min(map.size(), nums.length / 2);
    }


    public static void main(String[] args) {
        Haena sol = new Haena();
        System.out.println(sol.solution(new int[]{3, 1, 2, 3}));
        System.out.println(sol.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(sol.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }
}

/* 테스트 통과 시간 : 0.04ms ~ 4.70ms
테스트 1 〉	통과 (0.05ms, 76.2MB)
테스트 2 〉	통과 (0.06ms, 72.3MB)
테스트 3 〉	통과 (0.04ms, 66.4MB)
테스트 4 〉	통과 (0.06ms, 66.9MB)
테스트 5 〉	통과 (0.06ms, 72.8MB)
테스트 6 〉	통과 (0.07ms, 76.3MB)
테스트 7 〉	통과 (0.23ms, 78.4MB)
테스트 8 〉	통과 (0.17ms, 75.9MB)
테스트 9 〉	통과 (0.29ms, 82.7MB)
테스트 10 〉	통과 (0.28ms, 78.8MB)
테스트 11 〉	통과 (0.39ms, 78.9MB)
테스트 12 〉	통과 (0.87ms, 73.5MB)
테스트 13 〉	통과 (1.16ms, 79.6MB)
테스트 14 〉	통과 (0.58ms, 71.4MB)
테스트 15 〉	통과 (1.22ms, 75MB)
테스트 16 〉	통과 (4.13ms, 87.1MB)
테스트 17 〉	통과 (3.49ms, 82.4MB)
테스트 18 〉	통과 (4.70ms, 79.2MB)
테스트 19 〉	통과 (4.24ms, 79.2MB)
테스트 20 〉	통과 (2.71ms, 76MB)
 */