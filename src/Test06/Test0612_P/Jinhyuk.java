// 최댓값과 최솟값
package Test06.Test0612_P;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jh = new Jinhyuk();
        Solution sol = jh.new Solution();
        String t1 = "1 2 3 4";
        String t2 = "-1 -2 -3 -4";
        String t3 = "-1 -1";

        System.out.println(sol.solution(t1));
        System.out.println(sol.solution( t2 ) );
        System.out.println(sol.solution( t3 ) );

    }
    // 예시를 이용하여 solution 메서드를 잘 구현했는지 확인하는 main 메서
    class Solution {
        public String solution(String s) {
            Jinhyuk jh = new Jinhyuk();
            String[] str = s.split(" ");

            int[] num = new int[str.length];

            for (int i = 0; i < str.length; i++) {
//                num[i] = Integer.valueOf(str[i]);
                num[i] = Integer.parseInt(str[i]);
            }
            int maxNum = num[0];
            int minNum = num[0];
            for (int i = 0; i < num.length; i++) {
                if (num[i] > maxNum) {
                    maxNum = num[i];
                }
                if (num[i] < minNum) {
                    minNum = num[i];
                }
            }
            String maxStr = Integer.toString(maxNum);
            String minStr = Integer.toString(minNum);

            String answer = minStr + " " + maxStr;
            return answer;
        }
    }
}