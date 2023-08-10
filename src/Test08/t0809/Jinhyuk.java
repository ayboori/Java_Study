package Test08.t0809;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        int a1 = 2;
        int b1 = 1;
        int n1 = 20;

        int a2 = 3;
        int b2 = 1;
        int n2 = 20;

        int a3 = 5;
        int b3 = 1;
        int n3 = 10;

        int a4 = 5;
        int b4 = 1;
        int n4 = 5;

        System.out.println(jinhyuk.solution(a1, b1, n1));
        System.out.println(jinhyuk.solution(a2, b2, n2));
        System.out.println(jinhyuk.solution(a3, b3, n3));
        System.out.println(jinhyuk.solution(a4, b4, n4));
    }
    public int solution(int a, int b, int n) {
        int answer = 0;

        boolean exchangeCoke = true; // 콜라 교환 가능 여부 플래그

        while (exchangeCoke) { // 콜라 교환 가능할 때까지 반복
            int addCoke = n / a; // 바꿔주는 빈병 수
            int remainCoke = n % a; // 남은 빈병 수

            answer += addCoke * b; // 누적되는 콜라병 수
            n = addCoke*b + remainCoke; // 새로운 콜라병 수

            if (n < a || n < 2) { // 콜라병 수가 바꿔주는 빈병 수보다 작으면 콜라교환 불가능, 보유 빈병 2개미만이면 콜라 못받음
                exchangeCoke = false; // 반복문 탈주
            }
        }
        return answer; // 짜라잔
    }
}

/*
    {{ Trouble Shooting }}
오류
정확성: 14.3 - 합계: 14.3 / 100.0
코드실행은 성공했는데 제출 후 채점에서 대량 실점

시도
테스트 케이스를 추가해보았는데 정답이 계속 나와서 문제점 찾는데 난항
질문목록을 보면서 비슷한 케이스의 오류를 가진 사람들의 코드를 확인

해결
n = addCoke + remainCoke; 로 생각하였는데
addCoke*b + remainCoke; 로 수정하니 정답이 나왔다.
(바꿔주는 병의 갯수를 놓침 아차차!)

    [[ 시간 복잡도 0.01~0.09ms ]]
테스트 1 〉	통과 (0.02ms, 76.9MB)
테스트 2 〉	통과 (0.01ms, 75.7MB)
테스트 3 〉	통과 (0.02ms, 78.3MB)
테스트 4 〉	통과 (0.02ms, 77.4MB)
테스트 5 〉	통과 (0.01ms, 74MB)
테스트 6 〉	통과 (0.02ms, 76.7MB)
테스트 7 〉	통과 (0.03ms, 81.4MB)
테스트 8 〉	통과 (0.03ms, 75.7MB)
테스트 9 〉	통과 (0.02ms, 74.2MB)
테스트 10 〉	통과 (0.03ms, 74.2MB)
테스트 11 〉	통과 (0.03ms, 75.7MB)
테스트 12 〉	통과 (0.09ms, 73.1MB)
테스트 13 〉	통과 (0.03ms, 67.2MB)
테스트 14 〉	통과 (0.02ms, 73.7MB)
*/

