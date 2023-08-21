package Test08.t0818;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        int[] test1 = {3, 1, 2, 3};
        int[] test2 = {3, 3, 3, 2, 2, 4};
        int[] test3 = {3, 3, 3, 2, 2, 2};

        System.out.println(donghwan.solution(test1));
        System.out.println(donghwan.solution(test2));
        System.out.println(donghwan.solution(test3));
    }

    public int solution(int[] nums) {
        List<Integer> arr = new ArrayList<>();// 동적할당을 위해 ArrayList 생성
        for (int i = 0; i < nums.length; i++) { // 값 하나하나 접근하기 위해 반복문
            if (!arr.contains(nums[i])) { // 중복값이 들어가면 안되니 contains를 이용해 중복확인
                if (arr.size() < nums.length / 2) { // 포켓몬을 얻을 수 있는 수는 n/2이기 때문에 if문 생성
                    arr.add(nums[i]);// 값추가
                }
            }
        }
        return arr.size(); // 사이즈가 곧 경우의 수기 때문에 size로 반환
    }
}

//        테스트 1 〉	통과 (0.03ms, 75.1MB)
//        테스트 2 〉	통과 (0.04ms, 76.4MB)
//        테스트 3 〉	통과 (0.05ms, 72.9MB)
//        테스트 4 〉	통과 (0.03ms, 66.5MB)
//        테스트 5 〉	통과 (0.07ms, 75.7MB)
//        테스트 6 〉	통과 (0.04ms, 75.1MB)
//        테스트 7 〉	통과 (0.38ms, 72.8MB)
//        테스트 8 〉	통과 (0.38ms, 74.9MB)
//        테스트 9 〉	통과 (0.38ms, 77.4MB)
//        테스트 10 〉	통과 (0.44ms, 82.9MB)
//        테스트 11 〉	통과 (0.17ms, 74.5MB)
//        테스트 12 〉	통과 (5.26ms, 77.1MB)
//        테스트 13 〉	통과 (4.57ms, 66.8MB)
//        테스트 14 〉	통과 (2.38ms, 76MB)
//        테스트 15 〉	통과 (1.22ms, 79.7MB)
//        테스트 16 〉	통과 (30.95ms, 79.5MB)
//        테스트 17 〉	통과 (29.37ms, 76.2MB)
//        테스트 18 〉	통과 (23.12ms, 87.5MB)
//        테스트 19 〉	통과 (14.66ms, 82.8MB)
//        테스트 20 〉	통과 (2.00ms, 73.7MB)