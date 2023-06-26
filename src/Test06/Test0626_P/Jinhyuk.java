// lv. 1 최대공약수와 최소공배수
package Test06.Test0626_P;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();
        int n1 = 3;
        int m1 = 12;

        int n2 = 2;
        int m2 = 5;

        System.out.println(jinhyuk.solution(n1, m1));
        System.out.println(jinhyuk.solution(n2, m2));
    }

    public int[] solution(int n, int m) {
        int lcm = 0;
        int gcd = 0;

        for (int i = 1; i <= m && i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        lcm = (m*n)/gcd;

        int[] answer = {gcd, lcm};
        return answer;
    }
}
