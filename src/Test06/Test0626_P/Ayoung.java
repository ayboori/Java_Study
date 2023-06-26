// lv. 1 최대공약수와 최소공배수
package Test06.Test0626_P;

import java.util.Arrays;

public class Ayoung {
    public int[] solution(int n, int m) {
        if (n > m){ // 더 작은 수를 n으로 세팅
            int temp = n;
            n = m;
            m = temp;
        }

        int divisor = 1;

        for(int i = 1; i <= n ; i++){ // 최대 공약수 구하기
            if(m % i ==0 && n % i ==0){
                divisor = i;
            }
        }

        int multiple = m*n / divisor; // 두 수의 곱 = 최대공약수 * 최소공배수

        int[] answer = {divisor, multiple};
        return answer;
    }

    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(Arrays.toString(ay.solution(3,5)));
        System.out.println(Arrays.toString(ay.solution(4,30)));
        System.out.println(Arrays.toString(ay.solution(12,3)));
    }

}
