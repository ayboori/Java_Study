package Test07.Test0707_P;

import java.util.Arrays;

public class Jinhyuk {
    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        int[] d1 = {1, 3, 2, 5, 4};
        int[] d2 = {2, 2, 3, 3};

        int budget1 = 9;
        int budget2 = 10;

        System.out.println(jinhyuk.solution(d1, budget1));
        System.out.println(jinhyuk.solution(d2, budget2));
    }

    public int solution(int[] d, int budget) {
        int answer = 0;

        int sum = 0;

        Arrays.sort(d); //배열을 작은숫자부터 순서대로 오름차순 정리하는 메소드

        for (int i = 0; i < d.length; i++) { //d 길이만큼 반복
            sum += d[i]; //순서대로 하나씩 sum 에 담고

            if (sum <= budget) { // sum 이 budget과 비교해서 작거나 같으면
                answer += 1; // answer을 하나씩 더해준다
            }
        }
        return answer; //답 도출
    }
}

/*
        테스트 1 〉	통과 (0.39ms, 76.9MB)
        테스트 2 〉	통과 (0.35ms, 73.7MB)
        테스트 3 〉	통과 (0.47ms, 75.9MB)
        테스트 4 〉	통과 (0.33ms, 76.7MB)
        테스트 5 〉	통과 (0.49ms, 82.5MB)
        테스트 6 〉	통과 (0.50ms, 77.5MB)
        테스트 7 〉	통과 (0.55ms, 81MB)
        테스트 8 〉	통과 (0.35ms, 77.5MB)
        테스트 9 〉	통과 (0.36ms, 77.3MB)
        테스트 10 〉	통과 (0.40ms, 74.4MB)
        테스트 11 〉	통과 (0.39ms, 67.2MB)
        테스트 12 〉	통과 (0.53ms, 76.3MB)
        테스트 13 〉	통과 (0.50ms, 77.9MB)
        테스트 14 〉	통과 (0.44ms, 73.7MB)
        테스트 15 〉	통과 (0.40ms, 73.6MB)
        테스트 16 〉	통과 (0.38ms, 70.4MB)
        테스트 17 〉	통과 (0.56ms, 76.8MB)
        테스트 18 〉	통과 (0.45ms, 76.3MB)
        테스트 19 〉	통과 (0.53ms, 76.9MB)
        테스트 20 〉	통과 (0.34ms, 72.7MB)
        테스트 21 〉	통과 (0.50ms, 79.9MB)
        테스트 22 〉	통과 (0.49ms, 79.6MB)
        테스트 23 〉	통과 (0.39ms, 68.2MB)
        채점 결과
        정확성: 100.0
        합계: 100.0 / 100.0
        */
