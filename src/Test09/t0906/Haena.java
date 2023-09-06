package Test09.t0906;

public class Haena {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // 세 숫자의 합 만들기
                    int num = nums[i] + nums[j] + nums[k];
                    // 세 숫자의 합이 소수인지 판별하기
                    if (checkPrimeNum(num)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    // 소수인지 판별하기
    // 어떤 자연수 n이 소수임을 판정하기 위해선
    // {sqrt {n}}까지의 수 중 1을 제외하고 그 자연수의 약수가 있는지 확인
    private boolean checkPrimeNum(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Haena sol = new Haena();
        System.out.println(sol.solution(new int[]{1, 2, 3, 4}));
        System.out.println(sol.solution(new int[]{1, 2, 7, 6, 4}));
    }
}

/*
테스트 1 〉	통과 (0.39ms, 75MB)
테스트 2 〉	통과 (0.71ms, 75.7MB)
테스트 3 〉	통과 (0.20ms, 75.6MB)
테스트 4 〉	통과 (0.20ms, 71.8MB)
테스트 5 〉	통과 (0.73ms, 80.7MB)
테스트 6 〉	통과 (0.75ms, 77.3MB)
테스트 7 〉	통과 (0.07ms, 73.1MB)
테스트 8 〉	통과 (2.15ms, 80MB)
테스트 9 〉	통과 (0.38ms, 77.5MB)
테스트 10 〉	통과 (1.52ms, 72.8MB)
테스트 11 〉	통과 (0.05ms, 68.6MB)
테스트 12 〉	통과 (0.04ms, 81.3MB)
테스트 13 〉	통과 (0.09ms, 84.3MB)
테스트 14 〉	통과 (0.04ms, 74.3MB)
테스트 15 〉	통과 (0.04ms, 74.6MB)
테스트 16 〉	통과 (1.71ms, 71.3MB)
테스트 17 〉	통과 (1.25ms, 75.8MB)
테스트 18 〉	통과 (0.08ms, 72.8MB)
테스트 19 〉	통과 (0.04ms, 73MB)
테스트 20 〉	통과 (2.15ms, 77MB)
테스트 21 〉	통과 (2.81ms, 79.3MB)
테스트 22 〉	통과 (0.35ms, 70.2MB)
테스트 23 〉	통과 (0.04ms, 75.2MB)
테스트 24 〉	통과 (1.66ms, 66.2MB)
테스트 25 〉	통과 (1.63ms, 72.3MB)
테스트 26 〉	통과 (0.02ms, 74.8MB)
 */