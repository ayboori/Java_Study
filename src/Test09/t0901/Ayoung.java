package Test09.t0901;
import java.util.Arrays;
// lv.1 과일 장수
public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(ay.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    public int solution(int k, int m, int[] score) {
        // 사과 한 상자의 가격은 상자 내의 가장 낮은 점수 * 사과 갯수
        // 얻을 수 있는 최대 이익을 계산하기

        // 가격이 적은 애들끼리 한 상자, 높은 애들끼리 한 상자

        // 오름차순 정렬 > 뒤에서부터 꺼내와야 큰 값부터 꺼냄
        Arrays.sort(score);

        int restApple = score.length;
        int answer = 0;

        // m개씩 잘라서 최소값을 구한다
        for(int i = score.length-1 ; i >= 0 ; i--){
            // 이미 한 상자만큼 안 나오는데 검사하는 경우를 방지
            if(restApple < m){
                break;
            }

            // 거꾸로 검사하고 있기 때문에, index는 똑바로 검사해야 함
            if((score.length-i)%m == 0 || i == 0){ // i == 0 없으면 모든 사과 다 쓰는 경우 검사 못함
                answer += score[i] * m; // 현재 index가 최솟값임, 상자 크기만큼 곱하기
                restApple -= m; // 남은 사과 수 세팅
            }
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.39ms, 73.3MB)
테스트 2 〉	통과 (0.47ms, 74.3MB)
테스트 3 〉	통과 (0.49ms, 75.4MB)
테스트 4 〉	통과 (0.54ms, 69.5MB)
테스트 5 〉	통과 (0.48ms, 72MB)
테스트 6 〉	통과 (9.13ms, 85.8MB)
테스트 7 〉	통과 (8.89ms, 83.4MB)
테스트 8 〉	통과 (2.08ms, 86.2MB)
테스트 9 〉	통과 (10.53ms, 80.4MB)
테스트 10 〉	통과 (6.01ms, 78.2MB)
테스트 11 〉	통과 (65.52ms, 121MB)
테스트 12 〉	통과 (88.33ms, 125MB)
테스트 13 〉	통과 (53.62ms, 135MB)
테스트 14 〉	통과 (61.58ms, 128MB)
테스트 15 〉	통과 (81.47ms, 145MB)
테스트 16 〉	통과 (0.46ms, 76.9MB)
테스트 17 〉	통과 (0.44ms, 77.6MB)
테스트 18 〉	통과 (0.55ms, 72.5MB)
테스트 19 〉	통과 (0.57ms, 72MB)
테스트 20 〉	통과 (0.56ms, 74.2MB)
테스트 21 〉	통과 (0.38ms, 81.5MB)
테스트 22 〉	통과 (0.54ms, 73.6MB)
테스트 23 〉	통과 (0.63ms, 74.4MB)
테스트 24 〉	통과 (0.38ms, 74.2MB)
 */
