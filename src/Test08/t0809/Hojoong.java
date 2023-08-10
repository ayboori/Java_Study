package Test08.t0809;

public class Hojoong {

    public static void main(String[] args) {

        Hojoong hojoong = new Hojoong();

        int a = 2;
        int b = 1;
        int n = 20;

        System.out.println(hojoong.solution(a, b, n));
    }

    // 빈병 n개 주면 a당 b개를 준다
    // x = (n/a)*b; // 빈병 20->10
    // 빈병 x개를 주면 a당 b개를 준다.
    // y = (x/a)*b; //빈병 10->5
    // 빈병 y개를 주면 a당 b개를 준다.
    // z = (y/a)*b; // 빈병 5->2, 나머지 : y%a = 1
    // 빈병 z개를 주면 a당 b개를 준다.
    // d = (z+나머지/a)*b; // 빈병 3->1, 나머지 : z+나머지%a = 1
    // 빈병 d개를 주면 a당 b개를 준다.
    // p = (d+나머지/a)*b; // 빈병 2->1, 나머지 : d+나머지%a = 1

    // 로직
    // -> 변수 = (변수+나머지/a)*b
    // -> answer += 변수
    // -> 나머지 = n%a
    // -> n = 변수+나머지

    public int solution(int a, int b, int n) {

        int answer = 0;

        while (n >= a) {

            int x = (n / a) * b;
            answer += x;
            int y = n % a;
            n = x + y;

        }

        return answer;
    }
}

//    테스트 1 〉	통과 (0.02ms, 78.3MB)
//    테스트 2 〉	통과 (0.02ms, 73.8MB)
//    테스트 3 〉	통과 (0.01ms, 73MB)
//    테스트 4 〉	통과 (0.01ms, 79.5MB)
//    테스트 5 〉	통과 (0.01ms, 74.7MB)
//    테스트 6 〉	통과 (0.02ms, 73.6MB)
//    테스트 7 〉	통과 (0.02ms, 75.9MB)
//    테스트 8 〉	통과 (0.01ms, 78.2MB)
//    테스트 9 〉	통과 (0.02ms, 73.3MB)
//    테스트 10 〉	통과 (0.02ms, 77.5MB)
//    테스트 11 〉	통과 (0.01ms, 74.1MB)
//    테스트 12 〉	통과 (0.08ms, 83.2MB)
//    테스트 13 〉	통과 (0.01ms, 71.3MB)
//    테스트 14 〉	통과 (0.01ms, 76.1MB)