package Test07.Test0721_P;

// lv1. 크기가 작은 부분 문자열 (71%)
public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution("3141592", "271"));
        System.out.println(ay.solution("500220839878", "7"));
        System.out.println(ay.solution("10203", "15"));
    }

    public int solution(String t, String p) {
        int size = p.length(); // 짧은 문자열의 길이
        int answer = 0;
        for(int i = 0 ; i < t.length() - p.length() +1 ; i++){ // 포인터 하나씩 옮기며 검사
            // i번째 문자열부터 size 크기만큼 자르며 비교
            if(Long.parseLong(t.substring(i, size+i)) <=  Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}

/*
통과 시간 0.07ms ~ 9.58ms

테스트 1 〉	통과 (4.03ms, 64.8MB)
테스트 2 〉	통과 (9.80ms, 79.1MB)
테스트 3 〉	통과 (3.82ms, 73.7MB)
테스트 4 〉	통과 (5.87ms, 79MB)
테스트 5 〉	통과 (3.22ms, 76.5MB)
테스트 6 〉	통과 (5.40ms, 81.3MB)
테스트 7 〉	통과 (7.30ms, 74.3MB)
테스트 8 〉	통과 (3.15ms, 65.9MB)
테스트 9 〉	통과 (2.43ms, 78.5MB)
테스트 10 〉	통과 (0.57ms, 77.7MB)
테스트 11 〉	통과 (4.73ms, 68.6MB)
테스트 12 〉	통과 (8.50ms, 73.9MB)
테스트 13 〉	통과 (9.58ms, 77.4MB)
테스트 14 〉	통과 (6.86ms, 74.6MB)
테스트 15 〉	통과 (5.86ms, 73.4MB)
테스트 16 〉	통과 (6.63ms, 78MB)
테스트 17 〉	통과 (8.51ms, 77.1MB)
테스트 18 〉	통과 (6.40ms, 64MB)
테스트 19 〉	통과 (2.31ms, 70.6MB)
테스트 20 〉	통과 (2.37ms, 72.7MB)
테스트 21 〉	통과 (0.12ms, 72.9MB)
테스트 22 〉	통과 (1.80ms, 83.7MB)
테스트 23 〉	통과 (3.43ms, 72.2MB)
테스트 24 〉	통과 (0.24ms, 72.8MB)
테스트 25 〉	통과 (0.43ms, 76.3MB)
테스트 26 〉	통과 (0.46ms, 73.8MB)
테스트 27 〉	통과 (0.34ms, 87.1MB)
테스트 28 〉	통과 (0.22ms, 75MB)
테스트 29 〉	통과 (0.32ms, 73.9MB)
테스트 30 〉	통과 (2.55ms, 72.3MB)
테스트 31 〉	통과 (0.11ms, 72.9MB)
테스트 32 〉	통과 (0.11ms, 76.3MB)
테스트 33 〉	통과 (0.07ms, 73.9MB)
테스트 34 〉	통과 (0.11ms, 75.4MB)
테스트 35 〉	통과 (0.10ms, 67.7MB)
테스트 36 〉	통과 (0.22ms, 73.3MB)
테스트 37 〉	통과 (0.07ms, 74.9MB)
테스트 38 〉	통과 (0.12ms, 76.4MB)
 */
