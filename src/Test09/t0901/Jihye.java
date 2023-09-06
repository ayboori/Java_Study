package Test09.t0901;

import java.util.Arrays;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();

        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 4, 2, 3, 1};

        System.out.println(jh.solution(k, m ,score));

    }
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int num = 0;
        int[] apple = new int[score.length];

        // 최상품, 최하품을 위해 점수 정렬
        Arrays.sort(score);

        // 정렬된 수를 apple 배열에 추가
        for(int i=0; i<score.length; i++){
            apple[i] = score[score.length - i -1];
        }

        while(true){
            if(apple.length <= num || num+m > apple.length){
                break;
            }
            // 사과상자의 점수 곱한값을 answer에 더해주기
            answer += apple[num-1+m] * m;
            // 사과 개수만큼 더해주기
            num += m;
        }

        return answer;
    }
//    테스트 1 〉	통과 (1.12ms, 74.9MB)
//    테스트 2 〉	통과 (0.36ms, 75.3MB)
//    테스트 3 〉	통과 (0.34ms, 78.2MB)
//    테스트 4 〉	통과 (3.57ms, 76.3MB)
//    테스트 5 〉	통과 (0.55ms, 72.3MB)
//    테스트 6 〉	통과 (6.31ms, 90.2MB)
//    테스트 7 〉	통과 (8.09ms, 84.8MB)
//    테스트 8 〉	통과 (1.99ms, 75.6MB)
//    테스트 9 〉	통과 (10.22ms, 82.9MB)
//    테스트 10 〉	통과 (8.72ms, 83.9MB)
//    테스트 11 〉	통과 (71.35ms, 127MB)
//    테스트 12 〉	통과 (67.15ms, 128MB)
//    테스트 13 〉	통과 (57.17ms, 140MB)
//    테스트 14 〉	통과 (62.88ms, 149MB)
//    테스트 15 〉	통과 (54.68ms, 148MB)
//    테스트 16 〉	통과 (0.48ms, 73.5MB)
//    테스트 17 〉	통과 (0.33ms, 75.7MB)
//    테스트 18 〉	통과 (0.38ms, 67.5MB)
//    테스트 19 〉	통과 (0.41ms, 70.3MB)
//    테스트 20 〉	통과 (0.51ms, 79.8MB)
//    테스트 21 〉	통과 (0.49ms, 76.8MB)
//    테스트 22 〉	통과 (0.38ms, 74.4MB)
//    테스트 23 〉	통과 (0.49ms, 79.9MB)
//    테스트 24 〉	통과 (0.41ms, 75.6MB)

}
