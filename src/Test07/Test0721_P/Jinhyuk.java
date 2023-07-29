package Test07.Test0721_P;

import java.math.BigInteger;

public class Jinhyuk {
    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        String t1 = "3141592";
        String p1 = "271";

        String t2 = "500220839878";
        String p2 = "7";

        String t3 = "10203";
        String p3 = "15";

        System.out.println(jinhyuk.solution(t1, p1));
        System.out.println(jinhyuk.solution(t2, p2));
        System.out.println(jinhyuk.solution(t3, p3));

    }

    public int solution(String t, String p) {
        int answer = 0;
        int t_len = t.length();
        int p_len = p.length();
        int repeat = t_len - p_len + 1;
        long pLong = Long.parseLong(p);

        for (int i = 0; i < repeat; i++) {
            if (Long.parseLong(t.substring(i, i + p_len)) <= pLong) {
                answer++;
            }
        }
        return answer;
    }

}
