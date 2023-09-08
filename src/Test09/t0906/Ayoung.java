package Test09.t0906;
// lv.1 소수 만들기
public class Ayoung {
    public int solution(int[] nums) {
        int numsL = nums.length;
        // 랜덤하게 뽑아낸 세 수의 합을 담는 배열 생성
        int [] sums = new int [(numsL * (numsL-1) * (numsL-2))/2];
        int index = 0;

        // 세 수의 합을 담기
        for (int i = 0 ; i < numsL -2 ; i++){
            for(int j = i+1 ; j < numsL-1 ; j++ ){
                for (int k = j+1 ; k < numsL ; k++){
                    sums[index++] = nums[i]+nums[j]+nums[k];
                }
            }
        }

        // 세 수의 합이 소수이면 +1 하는 변수 생성
        int answer = 0;

        for(int sum : sums){
            if(IsDemical(sum)){
                answer ++;
            }
        }

        // 결과 값 리턴
        return answer;
    }

    // 소수일 경우 true를 리턴하는 함수
    private boolean IsDemical(int input){
        if (input < 2) {
            return false;
        }

        for(int i = 2 ; i <= Math.sqrt(input) ; i++){
            if(input % i == 0){
                return false;
            }
        }
        return true;
    }

}
/*
테스트 1 〉	통과 (0.70ms, 73.6MB)
테스트 2 〉	통과 (0.82ms, 74.6MB)
테스트 3 〉	통과 (0.29ms, 72.6MB)
테스트 4 〉	통과 (0.37ms, 73.1MB)
테스트 5 〉	통과 (1.90ms, 72.9MB)
테스트 6 〉	통과 (1.26ms, 77MB)
테스트 7 〉	통과 (0.19ms, 75.4MB)
테스트 8 〉	통과 (3.96ms, 67.7MB)
테스트 9 〉	통과 (0.43ms, 68.9MB)
테스트 10 〉	통과 (2.97ms, 78.1MB)
테스트 11 〉	통과 (0.11ms, 77.1MB)
테스트 12 〉	통과 (0.08ms, 77.2MB)
테스트 13 〉	통과 (0.11ms, 73.5MB)
테스트 14 〉	통과 (0.05ms, 81MB)
테스트 15 〉	통과 (0.06ms, 72.3MB)
테스트 16 〉	통과 (6.81ms, 82.6MB)
테스트 17 〉	통과 (2.73ms, 77.3MB)
테스트 18 〉	통과 (0.12ms, 72.4MB)
테스트 19 〉	통과 (0.03ms, 76.2MB)
테스트 20 〉	통과 (5.48ms, 76.1MB)
테스트 21 〉	통과 (3.85ms, 72.6MB)
테스트 22 〉	통과 (1.08ms, 76MB)
테스트 23 〉	통과 (0.04ms, 81.7MB)
테스트 24 〉	통과 (4.67ms, 75.5MB)
테스트 25 〉	통과 (3.15ms, 72.7MB)
테스트 26 〉	통과 (0.03ms, 70.5MB)
 */
