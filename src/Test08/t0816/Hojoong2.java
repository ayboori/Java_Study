package Test08.t0816;

import java.util.ArrayList;

public class Hojoong2 {

    public static void main(String[] args) {
        Hojoong2 hojoong = new Hojoong2();

        int[] nums = {3, 1, 2, 3};

        System.out.println(hojoong.solution(nums));
    }

    public int solution(int[] nums) {
        int answer = 0;

        //중복체크를 위한 가별배열 생성
        ArrayList<Integer> duplication = new ArrayList<>();

        //nums for문을 통해 돌려가며 중복 체크, 길이 체크, 조건을 통해 가져갈수 있는 갯수 더하기.
        for (int num : nums) {
            if (!duplication.contains(num)) {
                if (duplication.size() < nums.length / 2) {
                    duplication.add(num);
                    answer++;
                } else {
                    //순회시, 이미 가져갈수 있는 갯수를 넘으면 for문 종료
                    break;
                }
            }
        }

        return answer;
    }

//    테스트 1 〉	통과 (0.03ms, 74.6MB)
//    테스트 2 〉	통과 (0.03ms, 76.9MB)
//    테스트 3 〉	통과 (0.04ms, 74MB)
//    테스트 4 〉	통과 (0.03ms, 71.8MB)
//    테스트 5 〉	통과 (0.05ms, 77.8MB)
//    테스트 6 〉	통과 (0.03ms, 73.3MB)
//    테스트 7 〉	통과 (0.32ms, 77.2MB)
//    테스트 8 〉	통과 (0.36ms, 77.5MB)
//    테스트 9 〉	통과 (0.36ms, 77.1MB)
//    테스트 10 〉	통과 (0.29ms, 76.7MB)
//    테스트 11 〉	통과 (0.20ms, 72MB)
//    테스트 12 〉	통과 (2.50ms, 69.8MB)
//    테스트 13 〉	통과 (4.26ms, 84.9MB)
//    테스트 14 〉	통과 (2.45ms, 77.3MB)
//    테스트 15 〉	통과 (1.32ms, 76.2MB)
//    테스트 16 〉	통과 (27.34ms, 89.5MB)
//    테스트 17 〉	통과 (29.09ms, 87.8MB)
//    테스트 18 〉	통과 (22.93ms, 77.3MB)
//    테스트 19 〉	통과 (16.06ms, 80.1MB)
//    테스트 20 〉	통과 (1.70ms, 83.2MB)

}
