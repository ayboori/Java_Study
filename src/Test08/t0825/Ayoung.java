package Test08.t0825;
import java.util.Arrays;
//  lv.1 명예의 전당 ( 63% )

public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(Arrays.toString(ay.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(ay.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }
        public int[] solution(int k, int[] score) {
// 매일 출연한 가수의 점수가 지금까지 출연 가수들의 점수 중 상위 k번째 이내이면 해당 가수의 점수를 명예의 전당이라는 목록에 올려 기념
            int min = score[0]; // 최하위 점수, 처음에는 배열의 0번째 값으로 세팅
            int[] minArray = new int[score.length]; // 리턴할 값
            int[] myeongye = new int[k]; // 명예의 전당
            int index = 0;

            for(int i=0; i < score.length ; i++){
                if(i<k){
                    myeongye[index ++] = score[i];
                    // int 배열에 값이 꽉 차있지 않을 경우 0으로 채워지기 때문에
                    // 뒤의 sort 후 최소값을 찾는 로직은 적절하지 않다!
                    if(min > score[i]){
                        min = score[i];
                    }
                }
                // 현재 들어오려는 값이 min보다 클 경우 최솟값 교체
                else if(score[i] >= min){
                    Arrays.sort(myeongye);
                    myeongye[0] = score[i];
                    Arrays.sort(myeongye);
                    min = myeongye[0];
                }
                // 결론적으로 구한 최솟값을 최하위 점수 배열에 추가한다
                minArray[i] = min;
            }

// 명예의 전당의 최하위 점수를 return
            return minArray;
        }

}
/*
테스트 1 〉	통과 (0.43ms, 77.7MB)
테스트 2 〉	통과 (0.03ms, 72.7MB)
테스트 3 〉	통과 (0.38ms, 77.5MB)
테스트 4 〉	통과 (0.54ms, 80.5MB)
테스트 5 〉	통과 (0.41ms, 75.3MB)
테스트 6 〉	통과 (0.42ms, 77.8MB)
테스트 7 〉	통과 (0.42ms, 70.5MB)
테스트 8 〉	통과 (0.44ms, 73.4MB)
테스트 9 〉	통과 (0.02ms, 76.3MB)
테스트 10 〉	통과 (0.04ms, 82.6MB)
테스트 11 〉	통과 (0.02ms, 76.6MB)
테스트 12 〉	통과 (1.90ms, 74.7MB)
테스트 13 〉	통과 (2.40ms, 78.4MB)
테스트 14 〉	통과 (1.64ms, 78.1MB)
테스트 15 〉	통과 (2.99ms, 80.6MB)
테스트 16 〉	통과 (3.63ms, 86.7MB)
테스트 17 〉	통과 (2.58ms, 78.3MB)
테스트 18 〉	통과 (2.30ms, 78.1MB)
테스트 19 〉	통과 (0.37ms, 73.8MB)
테스트 20 〉	통과 (0.39ms, 80.3MB)
테스트 21 〉	통과 (0.67ms, 73.9MB)
테스트 22 〉	통과 (0.46ms, 84.4MB)
테스트 23 〉	통과 (0.40ms, 76.2MB)
테스트 24 〉	통과 (0.46ms, 79.3MB)
테스트 25 〉	통과 (0.45ms, 76.8MB)
테스트 26 〉	통과 (0.33ms, 77.9MB)
 */