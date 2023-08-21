package Test08.t0818;

import java.util.HashSet;

public class Jihye {
    public static void main(String[] args) {

        Jihye jh = new Jihye();

        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        System.out.println(jh.solution(nums1));
        System.out.println(jh.solution(nums2));
        System.out.println(jh.solution(nums3));

    }
    public int solution(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // 방법 1: Math.min()
        int answer = Math.min(set.size(), nums.length / 2);

        // 방법 2 : 삼항 연산자
//        int answer = (set.size() < nums.length/2) ? set.size() : nums.length/2;
        return answer;
    }

//    Math.min()
//    테스트 1 〉	통과 (0.05ms, 72.3MB)
//    테스트 2 〉	통과 (0.04ms, 76.2MB)
//    테스트 3 〉	통과 (0.06ms, 74.2MB)
//    테스트 4 〉	통과 (0.10ms, 77.9MB)
//    테스트 5 〉	통과 (0.04ms, 73.8MB)
//    테스트 6 〉	통과 (0.07ms, 77.4MB)
//    테스트 7 〉	통과 (0.44ms, 84.5MB)
//    테스트 8 〉	통과 (0.32ms, 77.5MB)
//    테스트 9 〉	통과 (0.16ms, 76.2MB)
//    테스트 10 〉	통과 (0.32ms, 80.2MB)
//    테스트 11 〉	통과 (0.24ms, 66.6MB)
//    테스트 12 〉	통과 (0.35ms, 73.8MB)
//    테스트 13 〉	통과 (1.11ms, 79MB)
//    테스트 14 〉	통과 (0.79ms, 77.8MB)
//    테스트 15 〉	통과 (0.57ms, 77MB)
//    테스트 16 〉	통과 (4.69ms, 81.2MB)
//    테스트 17 〉	통과 (9.35ms, 70.2MB)
//    테스트 18 〉	통과 (5.52ms, 73.1MB)
//    테스트 19 〉	통과 (5.38ms, 81.7MB)
//    테스트 20 〉	통과 (7.65ms, 71.2MB)

//    ---------------------------------------
//    삼항 연산자
//    테스트 1 〉	통과 (0.03ms, 70MB)
//    테스트 2 〉	통과 (0.06ms, 76MB)
//    테스트 3 〉	통과 (0.04ms, 67.3MB)
//    테스트 4 〉	통과 (0.07ms, 77MB)
//    테스트 5 〉	통과 (0.07ms, 75.5MB)
//    테스트 6 〉	통과 (0.17ms, 74.7MB)
//    테스트 7 〉	통과 (0.26ms, 74.8MB)
//    테스트 8 〉	통과 (0.39ms, 74.6MB)
//    테스트 9 〉	통과 (0.27ms, 85.4MB)
//    테스트 10 〉	통과 (0.28ms, 79.3MB)
//    테스트 11 〉	통과 (0.44ms, 66.1MB)
//    테스트 12 〉	통과 (0.29ms, 80.8MB)
//    테스트 13 〉	통과 (0.67ms, 79.8MB)
//    테스트 14 〉	통과 (0.96ms, 82.5MB)
//    테스트 15 〉	통과 (0.77ms, 75.5MB)
//    테스트 16 〉	통과 (3.92ms, 77.9MB)
//    테스트 17 〉	통과 (3.61ms, 85.4MB)
//    테스트 18 〉	통과 (5.57ms, 70.8MB)
//    테스트 19 〉	통과 (1.57ms, 75.7MB)
//    테스트 20 〉	통과 (2.91ms, 76.9MB)
}

