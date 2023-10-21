package Test09.t0908;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        int n = 10;

        System.out.println(hojoong.solution(n));
    }

    public int solution(int n) {
        int answer = 1;
        for(int i = 3; i<= n; i++)
            if(checkPrimeNum(i)){
                answer++;
            }

        return answer;
    }

    static public boolean checkPrimeNum(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    테스트 1 〉	통과 (0.02ms, 70.1MB)
//    테스트 2 〉	통과 (0.08ms, 74.5MB)
//    테스트 3 〉	통과 (0.12ms, 79.1MB)
//    테스트 4 〉	통과 (0.20ms, 75.3MB)
//    테스트 5 〉	통과 (0.16ms, 70.5MB)
//    테스트 6 〉	통과 (1.09ms, 74.6MB)
//    테스트 7 〉	통과 (0.52ms, 73.3MB)
//    테스트 8 〉	통과 (0.85ms, 78.7MB)
//    테스트 9 〉	통과 (1.80ms, 66.8MB)
//    테스트 10 〉	통과 (38.72ms, 70.3MB)
//    테스트 11 〉	통과 (172.10ms, 86.7MB)
//    테스트 12 〉	통과 (43.73ms, 83.3MB)
}
