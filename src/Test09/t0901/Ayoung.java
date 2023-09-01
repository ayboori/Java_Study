package Test09.t0901;
import java.util.Arrays;
// lv.1 과일 상자
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
