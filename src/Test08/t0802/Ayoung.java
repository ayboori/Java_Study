package Test08.t0802;
// lv.1 푸드 파이트 대회

public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution(new int[]{1, 3, 4, 6})); // "1223330333221"
        System.out.println(ay.solution(new int[]{1, 7, 1, 2})); // "111303111"
    }

    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        // i번째 음식의 크기만큼 루프를 돌며
        for(int i = 1; i<food.length; i++){
            // i번째 음식의 갯수 / 2 만큼 StringBuilder에 부착
            for(int j = 0 ; j < food[i]/2 ; j++){
                sb.append(i);
            }
        }

        // 가운데에 0 부착
        sb.append(0);

        // 루프를 거꾸로 돌며
        for(int i = food.length-1; i > 0; i--){
            // i번째 음식의 갯수 / 2 만큼 StringBuilder에 부착
            for(int j = 0 ; j < food[i]/2 ; j++){
                sb.append(i);
            }
        }

        // String으로 반환 후 리턴
        return sb.toString();
    }
}

/*
테스트 1 〉	통과 (0.88ms, 78.8MB)
테스트 2 〉	통과 (0.61ms, 76.3MB)
테스트 3 〉	통과 (0.56ms, 82.6MB)
테스트 4 〉	통과 (0.99ms, 77.6MB)
테스트 5 〉	통과 (0.34ms, 72.1MB)
테스트 6 〉	통과 (0.66ms, 74.4MB)
테스트 7 〉	통과 (0.98ms, 78.1MB)
테스트 8 〉	통과 (0.72ms, 74.1MB)
테스트 9 〉	통과 (0.75ms, 75.8MB)
테스트 10 〉	통과 (0.76ms, 69.6MB)
테스트 11 〉	통과 (0.03ms, 71.4MB)
테스트 12 〉	통과 (0.05ms, 77.6MB)
테스트 13 〉	통과 (0.03ms, 79.3MB)
테스트 14 〉	통과 (2.16ms, 78.9MB)
테스트 15 〉	통과 (0.05ms, 72.3MB)
테스트 16 〉	통과 (0.09ms, 71.9MB)
테스트 17 〉	통과 (0.03ms, 73.3MB)
테스트 18 〉	통과 (0.05ms, 72.2MB)
테스트 19 〉	통과 (0.03ms, 77.5MB)
테스트 20 〉	통과 (0.06ms, 76.9MB)
 */