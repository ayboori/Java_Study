package Test08.t0818;

import java.util.HashSet;
import java.util.Set;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        int[] nums = {3, 1, 2, 3};

        System.out.println(hojoong.solution(nums));
    }

    public int solution(int[] nums) {

        //당신도 혹시 홍박사님을 아세요?
        //n마리의 포켓몬 중, n/2마리의 포켓몬만 가져가도 좋다고함, 근데 중복있음.
        //중복을 제거하고 가장 많은 수를 가져가는 방법
        //중복 X -> set
        //중복이 안되고 n/2수만 가져가면됨..
        //즉 : 조건 중복 제거한 set 내용물은 num/2보다 크면 안됨.

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.size() < (nums.length) / 2) {
                set.add(num);
            }
        }

        return set.size();
    }

//    테스트 1 〉	통과 (0.05ms, 75.8MB)
//    테스트 2 〉	통과 (0.10ms, 75MB)
//    테스트 3 〉	통과 (0.08ms, 71.1MB)
//    테스트 4 〉	통과 (0.04ms, 75.7MB)
//    테스트 5 〉	통과 (0.09ms, 77.2MB)
//    테스트 6 〉	통과 (0.08ms, 74MB)
//    테스트 7 〉	통과 (0.23ms, 86.6MB)
//    테스트 8 〉	통과 (1.53ms, 76MB)
//    테스트 9 〉	통과 (0.30ms, 81.7MB)
//    테스트 10 〉	통과 (0.27ms, 77.3MB)
//    테스트 11 〉	통과 (0.21ms, 77.1MB)
//    테스트 12 〉	통과 (0.39ms, 71MB)
//    테스트 13 〉	통과 (0.89ms, 78.8MB)
//    테스트 14 〉	통과 (0.76ms, 78.4MB)
//    테스트 15 〉	통과 (0.70ms, 77.1MB)
//    테스트 16 〉	통과 (4.34ms, 80.9MB)
//    테스트 17 〉	통과 (3.01ms, 82.9MB)
//    테스트 18 〉	통과 (2.80ms, 86.9MB)
//    테스트 19 〉	통과 (2.89ms, 72.9MB)
//    테스트 20 〉	통과 (3.85ms, 80.2MB)

}
