package Test09.t0906;

import java.util.ArrayList;
import java.util.List;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(hojoong.solution(nums));
    }

    public int solution(int[] nums) {

        // 3개의 합 구하기, 처음에 set써서 중복 없게 했는데 중복 있어야 된다네요 list로 변경
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                int y = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int z = nums[k];
                    list.add(x + y + z);
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < list.size(); i++) {
            if (sosu(list.get(i))) {
                answer++;
            }
//            answer = (int) list.stream().filter(Solution::isPrime).count(); 스트림 공부 중
        }

        return answer;
    }

    public static boolean sosu(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

//    테스트 1 〉	통과 (1.28ms, 64.9MB)
//    테스트 2 〉	통과 (2.37ms, 76.1MB)
//    테스트 3 〉	통과 (1.01ms, 75.1MB)
//    테스트 4 〉	통과 (1.08ms, 65.2MB)
//    테스트 5 〉	통과 (2.62ms, 81.7MB)
//    테스트 6 〉	통과 (5.88ms, 65.9MB)
//    테스트 7 〉	통과 (0.71ms, 73.9MB)
//    테스트 8 〉	통과 (8.28ms, 80.4MB)
//    테스트 9 〉	통과 (1.33ms, 72MB)
//    테스트 10 〉	통과 (6.55ms, 79.6MB)
//    테스트 11 〉	통과 (0.21ms, 73.2MB)
//    테스트 12 〉	통과 (0.13ms, 73.3MB)
//    테스트 13 〉	통과 (0.24ms, 83.3MB)
//    테스트 14 〉	통과 (0.13ms, 74.6MB)
//    테스트 15 〉	통과 (0.10ms, 72.5MB)
//    테스트 16 〉	통과 (12.97ms, 78.2MB)
//    테스트 17 〉	통과 (3.56ms, 76.8MB)
//    테스트 18 〉	통과 (0.93ms, 77.4MB)
//    테스트 19 〉	통과 (0.08ms, 71.6MB)
//    테스트 20 〉	통과 (21.63ms, 75.4MB)
//    테스트 21 〉	통과 (22.65ms, 73MB)
//    테스트 22 〉	통과 (1.81ms, 67.7MB)
//    테스트 23 〉	통과 (0.03ms, 78.4MB)
//    테스트 24 〉	통과 (18.34ms, 74MB)
//    테스트 25 〉	통과 (17.96ms, 79.2MB)
//    테스트 26 〉	통과 (0.03ms, 76.7MB)

}
