package Test08.t0809;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        System.out.println(donghwan.solution(2, 1, 20));
        System.out.println(donghwan.solution(3, 1, 20));
    }

    public int solution(int a, int b, int n) {
        int answer=0; //값을 담아줄 answer 변수 생성.
        while (n>=a) { //남은 병의 수가 a보다 크거나 같을때만 반복문 실행되게 생성.
            answer += n/a*b; // answer에 n/a*b를 해줘서 n/a를 나눈값에서 받는 병수 b를 곱해준다.
            n = n/a*b+n%a; //받은 콜라수와 n%a를 해줘서 남는 콜라수를 구해준 후 받은 콜라수 + 남은 콜라수를 더해준 값을 N에다가 재정의해준다.
        }
        return answer;//answer 리턴
    }
}

//        테스트 1 〉	통과 (0.03ms, 75.3MB)
//        테스트 2 〉	통과 (0.02ms, 71.6MB)
//        테스트 3 〉	통과 (0.03ms, 73.1MB)
//        테스트 4 〉	통과 (0.02ms, 73.6MB)
//        테스트 5 〉	통과 (0.03ms, 72.3MB)
//        테스트 6 〉	통과 (0.02ms, 71.6MB)
//        테스트 7 〉	통과 (0.04ms, 77.2MB)
//        테스트 8 〉	통과 (0.02ms, 76.1MB)
//        테스트 9 〉	통과 (0.02ms, 74.8MB)
//        테스트 10 〉	통과 (0.02ms, 74.9MB)
//        테스트 11 〉	통과 (0.03ms, 76.3MB)
//        테스트 12 〉	통과 (0.15ms, 76.5MB)
//        테스트 13 〉	통과 (0.02ms, 73MB)
//        테스트 14 〉	통과 (0.03ms, 75.4MB)
