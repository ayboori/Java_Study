// lv.1 약수의 개수와 덧셈
package Test06.Test0621_P;

public class Jinhyuk {
    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        System.out.println(jinhyuk.solution(13, 17));
        System.out.println(jinhyuk.solution(24, 27));

    }

    public int solution(int left, int right) {
        //answer 선언, 초기화
        int answer = 0;


        //left부터 right까지 값을 a로 지정하여 하나씩 ++하며 반복
        for (int a = left; a <= right; a++) {
            //int 선언, 반복 내에서의 초기화
            int num = 0;
            //i에서 a까지의 수를 나누면서 약수의 갯수를 확인
            for (int i = 1; i <= a; i++) {
                // 나누었을때 나머지가 0일경우
                if (a % i == 0) {
                    //num이라는 값에 1을 더한다
                    //a가 13일 경우, 1에서 한번, 13에서 한번으로 num=2가 된다.
                    num++;
                }
            }
            //num이 짝수이면
            if (num % 2 == 0) {
                //answer값에 a값을 더해주고
                answer += a;
                //num값이 홀수이면
            } else {
                //answer값에 a값을 빼준다
                answer -= a;
            }
        }
        //answer을 return해준다!
        return answer;
    }
}
/*  테스트 1 〉	통과 (3.62ms, 74.6MB)
    테스트 2 〉	통과 (1.31ms, 75.8MB)
    테스트 3 〉	통과 (1.31ms, 85.3MB)
    테스트 4 〉	통과 (0.55ms, 72.1MB)
    테스트 5 〉	통과 (5.57ms, 74.5MB)
    테스트 6 〉	통과 (0.60ms, 76.4MB)
    테스트 7 〉	통과 (0.21ms, 78.2MB)  */


