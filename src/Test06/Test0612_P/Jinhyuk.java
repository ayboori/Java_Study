// 최댓값과 최솟값

package Test06.Test0612_P;
import java.util.Scanner;
public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jh = new Jinhyuk();
        System.out.println(Jinhyuk.Solution);
    }
    // 예시를 이용하여 solution 메서드를 잘 구현했는지 확인하는 main 메서드
    class Solution {
        public String solution(String s) {
            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int[] list = new int[a];

            for (int i = 0; i < a; i++) {
                list[i] = in.nextInt();
            }
            in.close();
            int max = list[0];
            int min = list[0];
            for (int i = 0; i < list.length; i++) {
                if (list[i] > max) {
                    max = list[i];
                }
                if (list[i] < min) {
                    min = list[i];
                }
            }
            String answer = min + " " + max;
            return answer;
        }
    }
}