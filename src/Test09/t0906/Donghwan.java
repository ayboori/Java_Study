package Test09.t0906;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 7, 6, 4};

        System.out.println(donghwan.solution(nums1));
        System.out.println(donghwan.solution(nums2));
    }

    public int solution(int[] nums) {
        int answer = 0; // 결과를 저장할 변수 선언 및 초기화.
        int n; // 세 수의 합을 저장할 변수 선언.

        for(int i = 0; i < nums.length - 2; i++) // 첫 번째 숫자 선택.
            for(int j = i+1; j < nums.length -1; j++) // 두 번째 숫자 선택.
                for(int k = j+1; k < nums.length; k++){ // 세 번째 숫자 선택.
                    n = nums[i] + nums[j] + nums[k]; // 세 숫자의 합 계산.

                    for(int l = 2; l < n+1; l++){ // n이 소수인지 확인하는 반복문.
                        if(n % l == 0 && l != n) break; // n이 소수가 아니라면 반복 종료.
                        else if(l == n) answer++; // n이 소수라면 결과 변수 증가.
                    }
                }

        return answer; // 결과 반환
    }
}


//        테스트 1 〉	통과 (0.95ms, 76.3MB)
//        테스트 2 〉	통과 (2.29ms, 76.5MB)
//        테스트 3 〉	통과 (0.28ms, 65.8MB)
//        테스트 4 〉	통과 (0.18ms, 78.2MB)
//        테스트 5 〉	통과 (1.51ms, 76.3MB)
//        테스트 6 〉	통과 (5.80ms, 71.3MB)
//        테스트 7 〉	통과 (0.62ms, 76.3MB)
//        테스트 8 〉	통과 (7.74ms, 74.2MB)
//        테스트 9 〉	통과 (1.56ms, 73.1MB)
//        테스트 10 〉	통과 (9.34ms, 72.9MB)
//        테스트 11 〉	통과 (0.12ms, 69.8MB)
//        테스트 12 〉	통과 (0.04ms, 69.1MB)
//        테스트 13 〉	통과 (0.09ms, 69.8MB)
//        테스트 14 〉	통과 (0.04ms, 75.7MB)
//        테스트 15 〉	통과 (0.03ms, 75.4MB)
//        테스트 16 〉	통과 (16.16ms, 72.9MB)
//        테스트 17 〉	통과 (0.75ms, 77.1MB)
//        테스트 18 〉	통과 (0.65ms, 75.1MB)
//        테스트 19 〉	통과 (0.09ms, 68.5MB)
//        테스트 20 〉	통과 (28.07ms, 84.1MB)
//        테스트 21 〉	통과 (32.16ms, 78.7MB)
//        테스트 22 〉	통과 (0.27ms, 76.6MB)
//        테스트 23 〉	통과 (0.02ms, 77.8MB)
//        테스트 24 〉	통과 (16.09ms, 79.7MB)
//        테스트 25 〉	통과 (14.75ms, 72.9MB)
//        테스트 26 〉	통과 (0.02ms, 78.2MB)