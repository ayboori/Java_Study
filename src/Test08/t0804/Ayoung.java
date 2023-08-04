//  lv.1 가장 가까운 같은 글자
package Test08.t0804;

public class Ayoung {

    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(Arrays.toString(ay.solution("banana"))); //[-1, -1, -1, 2, 2, 2]
        System.out.println(Arrays.toString(ay.solution("foobar"))); //[-1, -1, 1, -1, -1, -1]
    }

    public int[] solution(String s) {
        int [] answer = new int[s.length()]; // 정답으로 return할 배열
        char[] charArray = s.toCharArray(); // 입력받은 String을 문자열 하나씩 분리하여 배열로 만들기
        int check = -1; // answer[i]에 세팅될 두 인덱스의 차이

        answer[0] = check; // 0번째 인덱스는 무조건 -1, 아래 for문에서 answer[0] 세팅 불가함

        for(int i = 0 ; i < s.length() ; i++){
            check = -1; // check를 따로 세팅하지 않으면 (아래 조건에 안 걸리면) -1
            for(int j = 0 ; j < i ; j++){ // i번째 인덱스 전까지 검사

                // 같은 값 검사 시 check세팅, 가장 가까운 값을 검사하므로 check는 변경될 수 있음.
                // 가장 먼 같은 글자 찾기였다면 continue; 걸어서 더 이상 검사하지 않으면 되겠다!
                if(charArray[i] == charArray[j]) check = i-j;
            }
            answer[i] = check;
        }

        return answer;
    }
}
/*
0.02ms ~ 178.69ms

테스트 1 〉	통과 (0.02ms, 79.4MB)
테스트 2 〉	통과 (0.19ms, 79.2MB)
테스트 3 〉	통과 (0.10ms, 85.3MB)
테스트 4 〉	통과 (5.99ms, 76.2MB)
테스트 5 〉	통과 (87.70ms, 80.3MB)
테스트 6 〉	통과 (21.31ms, 73MB)
테스트 7 〉	통과 (152.06ms, 79.6MB)
테스트 8 〉	통과 (22.89ms, 74.6MB)
테스트 9 〉	통과 (178.69ms, 105MB)
테스트 10 〉	통과 (13.70ms, 81.8MB)
테스트 11 〉	통과 (92.20ms, 76.5MB)
테스트 12 〉	통과 (0.02ms, 76.3MB)
테스트 13 〉	통과 (0.01ms, 76.5MB)
테스트 14 〉	통과 (1.61ms, 77.7MB)
테스트 15 〉	통과 (0.02ms, 73.3MB)
테스트 16 〉	통과 (0.04ms, 79.1MB)
테스트 17 〉	통과 (0.04ms, 66.7MB)
테스트 18 〉	통과 (11.76ms, 83MB)
테스트 19 〉	통과 (9.54ms, 74.3MB)
테스트 20 〉	통과 (1.77ms, 64.3MB)
테스트 21 〉	통과 (0.06ms, 75.1MB)
테스트 22 〉	통과 (18.01ms, 75.5MB)
테스트 23 〉	통과 (1.73ms, 73.6MB)
테스트 24 〉	통과 (2.11ms, 78.1MB)
테스트 25 〉	통과 (2.71ms, 73MB)
테스트 26 〉	통과 (0.30ms, 68.9MB)
테스트 27 〉	통과 (3.06ms, 78MB)
테스트 28 〉	통과 (2.43ms, 74.2MB)
테스트 29 〉	통과 (0.04ms, 75.8MB)
테스트 30 〉	통과 (146.20ms, 80.6MB)
 */