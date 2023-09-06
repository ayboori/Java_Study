package Test09.t0906;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,7,6,4};

        System.out.println(jinhyuk.solution(nums1));
        System.out.println(jinhyuk.solution(nums2));
    }

    /*
    딱봐도 뭔가 소수를 판단하는 메서드가 있을 것 같다고 생각
    검색해보았습니다. 호중님 맘에 드시나요? \(>,<)/
    */
    public int solution(int[] nums) {
        int answer = 0;

        //삼중 포문으로 모든 더하는 경우의 수를 구해준다
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (So_Su(sum)) { //소수면 asnwer에 1을 더해준다.
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public boolean So_Su(int n) { // 소수 판별 메서드
        int sqrt = (int) Math.sqrt(n); // Math.sqrt를 사용해서 소수를 판단
        for (int i = 2; i <= sqrt; i++) { // 2부터 n의 제곱근까지 나누어 떨어지는 수가 있으면 소수가 아니므로~
            if (n % i == 0) { // 나누어 떨어지면 소수가 아니니까
                return false; // false
            }
        }
        return true; // 나누어 떨어지는 수가 없으면 -> 소수이므로 true
    }
}
